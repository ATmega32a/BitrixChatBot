package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Culinary {
    private static Map<String,String> management = new HashMap<>();  // руководство
    private static Map<String,String> accountingDepartment = new HashMap<>();  // бухгалтерия
    private static Map<String,String> purchasingDepartment = new HashMap<>(); // отдел закупок
    private static Map<String,String> callCenterOfCulinary = new HashMap<>();  // контакт центр Кулинариум
    private static Map<String,String> callCenterOfAntek = new HashMap<>();  // контакт центр Антэк
    private static Map<String,String> productionDepartment = new HashMap<>();  // производственный отдел
    private static List<String> listOfCulinary = new ArrayList<>(); // список отделов
    private static List<Map> listOfMapOfCulinary = new ArrayList<>(); // список отделов

    static {
        management.put("Саломатина А.Н.","Руководство");
        management.put("Самоха Т.Г.","Руководство");
        management.put("Озерова С.","Руководство");

        accountingDepartment.put("Овчинникова Ю.Н.","Бухгалтерия");
        accountingDepartment.put("Селезнева А.","Бухгалтерия");

        purchasingDepartment.put("Кретова Е.","Отдел закупок");
        purchasingDepartment.put("Бондаренко К.","Отдел закупок");

        callCenterOfCulinary.put("Арбамянц А.А.","Контакт центр Кулинариум");
        callCenterOfCulinary.put("Абраменко С.","Контакт центр Кулинариум");
        callCenterOfCulinary.put("Шувалова Н.","Контакт центр Кулинариум");

        callCenterOfAntek.put("Якушевич И.В.","Контакт центр Антэк");
        callCenterOfAntek.put("Вьюнникова А.","Контакт центр Антэк");
        callCenterOfAntek.put("Хоченкова Т.","Контакт центр Антэк");

        productionDepartment.put("Потегаев А. М.","Производство");
        productionDepartment.put("Лысенко С.","Производство");
        productionDepartment.put("Мужицкая С.","Производство");
        productionDepartment.put("Колпачева А.","Производство");
        productionDepartment.put("Администраторы производства","Производство");

        listOfCulinary.add("Руководство");
        listOfCulinary.add("Бухгалтерия");
        listOfCulinary.add("Отдел закупок");
        listOfCulinary.add("Контакт центр Кулинариум");
        listOfCulinary.add("Контакт центр Антэк");
        listOfCulinary.add("Производство");

        listOfMapOfCulinary.add(management);
        listOfMapOfCulinary.add(accountingDepartment);
        listOfMapOfCulinary.add(purchasingDepartment);
        listOfMapOfCulinary.add(callCenterOfCulinary);
        listOfMapOfCulinary.add(callCenterOfAntek);
        listOfMapOfCulinary.add(productionDepartment);


    }

    public static Map<String, String> getManagement() {
        return management;
    }

    public static Map<String, String> getAccountingDepartment() {
        return accountingDepartment;
    }

    public static Map<String, String> getPurchasingDepartment() {
        return purchasingDepartment;
    }

    public static Map<String, String> getCallCenterOfCulinary() {
        return callCenterOfCulinary;
    }

    public static Map<String, String> getCallCenterOfAntek() {
        return callCenterOfAntek;
    }

    public static Map<String, String> getProductionDepartment() {
        return productionDepartment;
    }

    public static List<Map> getListOfMapOfCulinary() {
        return listOfMapOfCulinary;
    }

    public static List<String> getListOfCulinary() {
        return listOfCulinary;
    }
}


