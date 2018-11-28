package divisions;

import java.util.ArrayList;
import java.util.List;

public class SubDivisions {
    private static List<String> subDivisions = new ArrayList<>();
    static {
        subDivisions.add("Офис");
        subDivisions.add("Розница");
        subDivisions.add("Склад");
        subDivisions.add("Кулинариум");
        subDivisions.add("Кафе Новинский бульвар");
        subDivisions.add("Кафе Автозаводская");
        subDivisions.add("Кафе Аэропорт");
    }

    public static List<String> getSubDivisions() {
        return subDivisions;
    }
}
