import divisions.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChoiceDepartmentForm extends CommonGUIForm{
    ChoiceFullNameForm choiceFullName;
    public ChoiceDepartmentForm (String textQuery, List<String> list) throws HeadlessException {
        super(textQuery, list);
        buttonPrev.addActionListener(new ButtonPrevEventListener());
        buttonNext.addActionListener(new ButtonNextEventListener());
        buttonPrev.setEnabled(false);
        listOfChoice = list;
        setLocationRelativeTo(null);
        setVisible(true);
    }
    class ButtonNextEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            listOfChoice.removeAll(listOfChoice);
            switch (Counter.getNumber()){
                case 0: listOfChoice = selectingMap(Office.getListMapOffice(),selectedVariant);
                break;
                case 1: listOfChoice = selectingMap(Retail.getRetailMapList(),selectedVariant);
                break;
                case 2: listOfChoice = selectingMap(Stock.getListOfMapOfstock(),selectedVariant);
                break;
                case 3: listOfChoice = selectingMap(Culinary.getListOfMapOfCulinary(),selectedVariant);
                break;
                case 4: listOfChoice = selectingMap(CafeNovinskyBoulevard.getListOfMapOfCafeNB(),selectedVariant);
                break;
                case 5: listOfChoice = selectingMap(CafeAZ.getListOfMapOfCafeAZ(),selectedVariant);
                break;
                case 6: listOfChoice = selectingMap(CafeAirport.getListMapCafeAirport(),selectedVariant);
                break;
            }
            choiceFullName = new ChoiceFullNameForm(Offer.getChoiceOfFullName(), listOfChoice);
            choiceFullName.setVisible(true);
            ChoiceDepartmentForm.this.setVisible(false);
            StringQuery.getQuery().append("Отдел: ").append(selectedVariant).append('\n');
            Message.setFromDepartment(selectedVariant);
        }
    }
    class ButtonPrevEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }

    }
    static List selectingMap(List<Map> list,String selectedVariant){
        List resultList = new ArrayList();
        for (Map<String,String> map:list) {
            for(Map.Entry<String,String> m: map.entrySet()){
                String value = m.getValue();
                String key = m.getKey();
                if(selectedVariant.equals(value)){
                    resultList.add(key);
                }
            }
        }
        return resultList;
    }

}
