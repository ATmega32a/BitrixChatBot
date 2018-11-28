import divisions.ITDepartment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by USER on 19.11.2018.
 */
public class ChoiceFullNameForm extends CommonGUIForm{
    ChoiceITEpmloyeeForm choiceITEpmloyeeForm;
     public ChoiceFullNameForm(String textQuery, List<String> list) throws HeadlessException {
        super(textQuery, list);
         buttonPrev.addActionListener(new ButtonPrevEventListener());
         buttonPrev.setEnabled(false);
         buttonNext.addActionListener(new ButtonNextEventListener());
         listOfChoice = list;
         setLocationRelativeTo(null);
         setVisible(true);
    }
    class ButtonNextEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        choiceITEpmloyeeForm = new ChoiceITEpmloyeeForm(Offer.getChoiceOfITEmployee(),ITDepartment.getItDepartment());
        choiceITEpmloyeeForm.setVisible(true);
        ChoiceFullNameForm.this.setVisible(false);
        StringQuery.getQuery().append("От кого: ").append(selectedVariant).append('\n');
        Message.setFromUser(selectedVariant);
        }
    }
    class ButtonPrevEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }

    }
}
