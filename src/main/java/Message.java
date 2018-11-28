import bitrix.HttpGetSendClient;
import bitrix.HttpRequest;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Message extends JFrame{
    private static String fromUser;
    private static String fromDepartment;
    private static String fromDivision;
    private static String toUser;

    public static String getFromDepartment() {
        return fromDepartment;
    }

    public static void setFromDepartment(String fromDepartment) {
        Message.fromDepartment = fromDepartment;
    }

    public static String getFromDivision() {
        return fromDivision;
    }

    public static void setFromDivision(String fromDivision) {
        Message.fromDivision = fromDivision;
    }

    public static String getToUser() {
        return toUser;
    }

    public static void setToUser(String toUser) {
        Message.toUser = toUser;
    }

    public static String getFromUser() {
        return fromUser;
    }

    public static void setFromUser(String fromUser) {
        Message.fromUser = fromUser;
    }

    public Message() throws HeadlessException {
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("chat.png")));

        Font font = new Font("Verdana", Font.PLAIN, 14);

        final JTextArea textArea = new JTextArea(14,20);
        textArea.setLineWrap(true);
        textArea.setFont(font);
        textArea.setSize(550,250);
        textArea.setMargin(new Insets(10,10,10,10));

        JPanel labelPanel = new JPanel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();

        label1.setText("Подразделение: " +getFromDivision());
        label2.setText("Отдел: " + getFromDepartment());
        label3.setText("От кого: " + getFromUser());
        label4.setText("Кому: " + getToUser());

        label1.setFont(font);
        label2.setFont(font);
        label3.setFont(font);
        label4.setFont(font);


        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        labelPanel.add(label1);
        labelPanel.add(label2);
        labelPanel.add(label3);
        labelPanel.add(label4);

        Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched, "Данные отправителя и получателя");
        labelPanel.setBorder(titled);

        this.getContentPane().add(BorderLayout.NORTH, labelPanel);

        JScrollPane scrollPane = new JScrollPane(textArea);

        Border scrollBorderEtch = BorderFactory.createEtchedBorder();
        Border scrollBorderTitled = BorderFactory.createTitledBorder(scrollBorderEtch, "Текст сообщения");
        scrollPane.setBorder(scrollBorderTitled);

        this.getContentPane().add(scrollPane);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setSize(80,30);
        final JButton sendMsgButton = new JButton("Отправить сообщение");
        sendMsgButton.setSize(80,30);
        buttonPanel.add(sendMsgButton,BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel,BorderLayout.SOUTH);

        sendMsgButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                System.out.println(text);
                HttpGetSendClient.setDescription(new StringBuilder().append(text));
                HttpRequest http = new HttpRequest(
                        HttpRequest.getUrl() +
                            HttpRequest.getId()+ "/" +
                            HttpRequest.getWebHook()+ "/" +
                            HttpRequest.getMethod()+
                            HttpRequest.getDataFormat()+"?"
                );

                final String finalText = text + "\n\n" +
                        "--------------------------------------------------------------" +
                        "--------------------------------------------------------------\n"
                        + StringQuery.getQuery();

                String s = http.Request(new HashMap<String, String>() {{
                    put("TASKDATA[TITLE]", finalText.substring(0,20));
                    put("TASKDATA[DESCRIPTION]", finalText);
                    put("TASKDATA[RESPONSIBLE_ID]","40");
                    put("TASKDATA[TAGS][]",fromUser);
                    put("TASKDATA[ACCOMPLICES][]","1");
                }});
                System.out.println(s);
                JOptionPane.showMessageDialog(Message.this,StringQuery.getQuery().toString() + textArea.getText()+"\n\nУспешно отправлено!","Успех!", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                System.exit(0);

            }
        });
    }
}
