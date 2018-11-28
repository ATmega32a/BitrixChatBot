import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CommonGUIForm extends JFrame{
    private Container container = this.getContentPane();

    protected JButton buttonNext;
    protected JButton buttonPrev;
    protected String selectedVariant = "";
    List listOfChoice;

    public CommonGUIForm(String textQuery, List<String> list) throws HeadlessException {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Чат бот Bitrix");
        this.setSize(600,200);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("chat.png")));
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }


        JLabel textLabel = new JLabel();
        textLabel.setText(textQuery);
        JPanel textPanel = new JPanel();

        textPanel.add(textLabel);

        container.add(BorderLayout.NORTH, textPanel);

        buttonNext = new JButton("Далее ->");
        buttonNext.setSize(100,40);

        buttonPrev = new JButton("<- Назад");
        buttonPrev.setSize(100,40);

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(BorderLayout.WEST, buttonPrev);
        buttonPanel.add(BorderLayout.EAST, buttonNext);

        container.add(BorderLayout.SOUTH, buttonPanel);
        radioButtonGroupCreate(list);

    }

    protected void radioButtonGroupCreate(List<String>list){
        JPanel radioButtonPanel = new JPanel();
        radioButtonPanel.setLayout(new GridLayout(4,2));
        ButtonGroup group = new ButtonGroup();
            for (String s : list){
                JRadioButton radioButton = new JRadioButton(s);
                radioButton.addActionListener(new RadioButtonEventListener());
                group.add(radioButton);
                radioButtonPanel.add(radioButton);
                container.add(BorderLayout.CENTER, radioButtonPanel);
            }


    }
    class RadioButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedVariant = e.paramString().split(",")[1].substring(4);
        }
    }
}
