package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Office {
    private static Map<String,String> management = new HashMap<>();  // руководство
    private static Map<String,String> financialDepartment = new HashMap<>(); // фин. отдел
    private static Map<String,String> accountingDepartment = new HashMap<>(); // бухгалтерия
    private static Map<String,String> hr = new HashMap<>();
    private static Map<String,String> personnelDepartment = new HashMap<>(); // отдел кадров
    private static List<String> listOffice = new ArrayList<>(); // список отделов
    private static List<Map> listMapOffice = new ArrayList<>(); // список словарей

    static {
        management.put("Жулёв А.Г.","Руководство");
        management.put("Уразова О.К.","Руководство");

        financialDepartment.put("Каплуновская Е.А.","Финансовый отдел");
        financialDepartment.put("Кислицина Л.","Финансовый отдел");
        financialDepartment.put("Силенина Н.","Финансовый отдел");

        accountingDepartment.put("Чернопятова Е.Н.","Бухгалтерия");
        accountingDepartment.put("Шипицина Е.","Бухгалтерия");
        accountingDepartment.put("Галушкина Г.Я.","Бухгалтерия");
        accountingDepartment.put("Ошарина И.","Бухгалтерия");
        accountingDepartment.put("Репенко И","Бухгалтерия");
        accountingDepartment.put("Орехова Е","Бухгалтерия");
        accountingDepartment.put("Гусевская М","Бухгалтерия");
        accountingDepartment.put("Черная Я.","Бухгалтерия");

        hr.put("Моргунова Н.","HR");

        personnelDepartment.put("Винокурова Л.Н.","Отдел кадров");
        personnelDepartment.put("Довольнова Е.","Отдел кадров");
        personnelDepartment.put("Попова Н.","Отдел кадров");

        listOffice.add("Руководство");
        listOffice.add("Финансовый отдел");
        listOffice.add("Бухгалтерия");
        listOffice.add("HR");
        listOffice.add("Отдел кадров");

        listMapOffice.add(management);
        listMapOffice.add(financialDepartment);
        listMapOffice.add(accountingDepartment);
        listMapOffice.add(hr);
        listMapOffice.add(personnelDepartment);
    }

    public static List<Map> getListMapOffice() {
        return listMapOffice;
    }

    public static Map<String, String> getManagement() {
        return management;
    }

    public static Map<String, String> getFinancialDepartment() {
        return financialDepartment;
    }

    public static Map<String, String> getAccountingDepartment() {
        return accountingDepartment;
    }

    public static Map<String, String> getHr() {
        return hr;
    }

    public static Map<String, String> getPersonnelDepartment() {
        return personnelDepartment;
    }

    public static List<String> getListOffice() {
        return listOffice;
    }
}
