import divisions.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ChoiceDivisionForm extends CommonGUIForm {
    ChoiceDepartmentForm choiceDepartmentForm;
    public ChoiceDivisionForm(String textQuery, List<String> list) throws HeadlessException {
        super(textQuery, list);
        buttonPrev.addActionListener(new ButtonPrevEventListener());
        buttonNext.addActionListener(new ButtonNextEventListener());
        buttonPrev.setEnabled(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    class ButtonNextEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         switch (selectedVariant){
             case "Офис" :
                 listOfChoice = Office.getListOffice();
                 Counter.setNumber(0);
                 break;
             case "Розница" :
                 listOfChoice = Retail.getRetailList();
                 Counter.setNumber(1);
                 break;
             case "Склад" :
                 listOfChoice = Stock.getStockList();
                 Counter.setNumber(2);
             break;
             case "Кулинариум" :
                 listOfChoice = Culinary.getListOfCulinary();
                 Counter.setNumber(3);
             break;
             case "Кафе Новинский бульвар" :
                 listOfChoice = CafeNovinskyBoulevard.getListOfCafeNB();
                 Counter.setNumber(4);
             break;
             case "Кафе Автозаводская" :
                 listOfChoice = CafeAZ.getListOfCafeAZ();
                 Counter.setNumber(5);
             break;
             case "Кафе Аэропорт" :
                 listOfChoice = CafeAirport.getListCafeAirport();
                 Counter.setNumber(6);
             break;

         }
            choiceDepartmentForm = new ChoiceDepartmentForm(Offer.getChoiceOfDepartment(), listOfChoice);
            choiceDepartmentForm.setVisible(true);
            ChoiceDivisionForm.this.setVisible(false);
            StringQuery.getQuery().append("Подразделение: ").append(selectedVariant).append('\n');
            Message.setFromDivision(selectedVariant);
        }

    }
    class ButtonPrevEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    public ChoiceDepartmentForm getChoiceDepartmentForm() {
        return choiceDepartmentForm;
    }
}
