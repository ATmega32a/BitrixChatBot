import java.util.ArrayList;
import java.util.List;

public class Offer {
    private static final String choiceOfSubdivision = "Здравствуйте! Выберите, пожалуйста, подразделение, к которому Вы относитесь.";
    private static final String choiceOfDepartment = "Выберите, пожалуйста, отдел, к которому Вы относитесь.";
    private static final String choiceOfFullName = "Выберите, пожалуйста, себя из списка.";
    private static final String choiceOfITEmployee = "Выберите, пожалуйста, сотрудника, которому Вы бы хотели адресовать заявку.";
    private static List<String> choiceList = new ArrayList<String>();

    static {
        choiceList.add(0,choiceOfSubdivision);
        choiceList.add(1,choiceOfDepartment);
        choiceList.add(2,choiceOfFullName);
        choiceList.add(3,choiceOfITEmployee);
    }


    public static String getChoiceOfSubdivision() {
        return choiceOfSubdivision;
    }

    public static String getChoiceOfDepartment() {
        return choiceOfDepartment;
    }

    public static String getChoiceOfFullName() {
        return choiceOfFullName;
    }

    public static String getChoiceOfITEmployee() {
        return choiceOfITEmployee;
    }

    public static List<String> getChoiceList() {
        return choiceList;
    }
}
