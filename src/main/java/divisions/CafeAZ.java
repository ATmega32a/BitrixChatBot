package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CafeAZ {
    private static Map<String,String> cafeAZManagers= new HashMap<>();  // менеджеры
    private static List<String> listOfCafeAZ = new ArrayList<>();  // список отделов
    private static List<Map> listOfMapOfCafeAZ = new ArrayList<>();  // список словарей


    static {
        cafeAZManagers.put("Денисова Н.","Менеджеры");
        cafeAZManagers.put("Менеджер кафе \"Автозавод\"","Менеджеры");

        listOfCafeAZ.add("Менеджеры");

        listOfMapOfCafeAZ.add(cafeAZManagers);
    }

    public static Map<String, String> getCafeAZManagers() {
        return cafeAZManagers;
    }

    public static List<Map> getListOfMapOfCafeAZ() {
        return listOfMapOfCafeAZ;
    }

    public static List<String> getListOfCafeAZ() {
        return listOfCafeAZ;
    }
}
