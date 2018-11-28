package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CafeAirport {
    private static Map<String,String> cafeAirportManagers= new HashMap<>();  // менеджеры
    private static List<String>  listCafeAirport = new ArrayList<>();  // список отделов
    private static List<Map> listMapCafeAirport = new ArrayList<>();  // список словарей

    static {
        cafeAirportManagers.put("Менеджер кафе \"Аэропорт\"","Менеджеры");

        listCafeAirport.add("Менеджеры");

        listMapCafeAirport.add(cafeAirportManagers);
    }


    public static List<String> getListCafeAirport() {
        return listCafeAirport;
    }

    public static Map<String, String> getCafeAirportManagers() {
        return cafeAirportManagers;
    }

    public static List<Map> getListMapCafeAirport() {
        return listMapCafeAirport;
    }
}
