package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CafeNovinskyBoulevard {
    private static Map<String,String> cafeNovinskyBoulevardManagers= new HashMap<>();  // менеджеры
    private static List<String> listOfCafeNB= new ArrayList<>();  // список оделов
    private static List<Map> listOfMapOfCafeNB = new ArrayList<>();  // список оделов

    static {
        cafeNovinskyBoulevardManagers.put("Денисова А.","Менеджеры");
        cafeNovinskyBoulevardManagers.put("Менеджер кафе \"Новинский бульвар\"","Менеджеры");

        listOfCafeNB.add("Менеджеры");
        listOfMapOfCafeNB.add(cafeNovinskyBoulevardManagers);
    }

    public static Map<String, String> getCafeNovinskyBoulevardManagers() {
        return cafeNovinskyBoulevardManagers;
    }

    public static List<Map> getListOfMapOfCafeNB() {
        return listOfMapOfCafeNB;
    }

    public static List<String> getListOfCafeNB() {
        return listOfCafeNB;
    }
}
