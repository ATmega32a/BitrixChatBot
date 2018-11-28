package divisions;

import java.util.ArrayList;
import java.util.List;

public class ITDepartment {
    private static List<String> itDepartment = new ArrayList<>();

    static {
        itDepartment.add("Вощанов М.А. (старший системный администратор)");
        itDepartment.add("Шапкин П.А. (программист 1с)");
        itDepartment.add("Панасюк Н. (программист 1с)");
        itDepartment.add("Федоров М. (системный администратор розница)");
        itDepartment.add("Соломатенко А. (программист 1с)");
        itDepartment.add("Баранов А. (программист 1с)");
        itDepartment.add("Косов С. (системный администратор Рябиновая)");
        itDepartment.add("Тряпичников А. (программист 1с)");
    }

    public static List<String> getItDepartment() {
        return itDepartment;
    }

}

