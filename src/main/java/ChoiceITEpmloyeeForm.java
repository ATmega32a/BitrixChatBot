import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * Created by USER on 19.11.2018.
 */
public class ChoiceITEpmloyeeForm extends CommonGUIForm {
    public ChoiceITEpmloyeeForm(String textQuery, List<String> list) throws HeadlessException {
        super(textQuery, list);
        buttonNext.addActionListener(new ButtonNextEventListener());
        buttonPrev.addActionListener(new ButtonPrevEventListener());
        buttonPrev.setEnabled(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    class ButtonNextEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          StringQuery.getQuery().append("Кому: ").append(selectedVariant).append("\n\n");
          Message.setToUser(selectedVariant);
          Message message = new Message();
          message.setTitle("Сообщение");
          message.setVisible(true);
        }
    }
    class ButtonPrevEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }

    }
}
