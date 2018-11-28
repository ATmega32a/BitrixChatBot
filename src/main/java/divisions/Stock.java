package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    private static Map<String, String> management = new HashMap<>();  // руководство
    private static Map<String, String>  accountingDepartment = new HashMap<>(); // бухгалтерия
    private static Map<String, String>  logisticDepartment = new HashMap<>(); // логисты
    private static Map<String, String>  claimsDepartment = new HashMap<>(); // претензионный отдел
    private static Map<String, String>  salesDepartment = new HashMap<>(); // коммерческий отдел
    private static Map<String, String>  storageDepartment = new HashMap<>(); // склад
    private static Map<String, String>  operatorsDepartment = new HashMap<>(); // операторский отдел
    private static List<String> stockList= new ArrayList<>(); // список отделов
    private static List<Map> listOfMapOfstock= new ArrayList<>(); // список отделов

    static {
        management.put("Чиквашвили Д.Р.","Руководство");
        management.put("Алавердян А.А.","Руководство");
        management.put("Дегтярев А.И.","Руководство");

        accountingDepartment.put("Бечетнова Е.В.","Бухгалтерия");
        accountingDepartment.put("Мухтиярова Э.","Бухгалтерия");
        accountingDepartment.put("Долженко И.","Бухгалтерия");

        logisticDepartment.put("Шулакова Е.","Логисты");
        logisticDepartment.put("Кондрашов Е.","Логисты");

        claimsDepartment.put("Воробьева Л.","Претензионный отдел");

        salesDepartment.put("Лебедева Н.","Коммерческий отдел");

        storageDepartment.put("Куликов П.Н.","Склад");
        storageDepartment.put("Ананиев Р.","Склад");

        operatorsDepartment.put("Святохин Е.","Операторский отдел");

        stockList.add("Руководство");
        stockList.add("Бухгалтерия");
        stockList.add("Логисты");
        stockList.add("Претензионный отдел");
        stockList.add("Коммерческий отдел");
        stockList.add("Склад");
        stockList.add("Операторский отдел");

        listOfMapOfstock.add(management);
        listOfMapOfstock.add(accountingDepartment);
        listOfMapOfstock.add(logisticDepartment);
        listOfMapOfstock.add(claimsDepartment);
        listOfMapOfstock.add(salesDepartment);
        listOfMapOfstock.add(storageDepartment);
        listOfMapOfstock.add(operatorsDepartment);
    }

    public static Map<String, String> getManagement() {
        return management;
    }

    public static Map<String, String> getAccountingDepartment() {
        return accountingDepartment;
    }

    public static Map<String, String> getLogisticDepartment() {
        return logisticDepartment;
    }

    public static Map<String, String> getClaimsDepartment() {
        return claimsDepartment;
    }

    public static Map<String, String> getSalesDepartment() {
        return salesDepartment;
    }

    public static Map<String, String> getStorageDepartment() {
        return storageDepartment;
    }

    public static Map<String, String> getOperatorsDepartment() {
        return operatorsDepartment;
    }

    public static List<Map> getListOfMapOfstock() {
        return listOfMapOfstock;
    }

    public static List<String> getStockList() {
        return stockList;
    }
}
