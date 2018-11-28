package divisions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Retail {
    private static Map<String,String> managersOfPoints = new HashMap<>();  // менеджеры точек
    private static Map<String,String> kro = new HashMap<>();  // Отдел КРО
    private static Map<String,String> videoSurveillance = new HashMap<>();  // видеонаблюдение
    private static List<String> retailList = new ArrayList<>();  // список подразделений
    private static List<Map> retailMapList = new ArrayList<>();  // список подразделений

    static {
        managersOfPoints.put("Сизова Л.","Менеджеры точек");
        managersOfPoints.put("Избиенова Н.","Менеджеры точек");
        managersOfPoints.put("Суслопарова Е.","Менеджеры точек");
        managersOfPoints.put("Чаднова А.","Менеджеры точек");

        kro.put("Рябцева Е.","Отдел КРО");

        videoSurveillance.put("Панасенко Е.","Видеонаблюдение");
        videoSurveillance.put("Котенко Н.","Видеонаблюдение");

        retailList.add("Менеджеры точек");
        retailList.add("Отдел КРО");
        retailList.add("Видеонаблюдение");

        retailMapList.add(managersOfPoints);
        retailMapList.add(kro);
        retailMapList.add(videoSurveillance);
    }

    public static Map<String, String> getManagersOfPoints() {
        return managersOfPoints;
    }

    public static Map<String, String> getKro() {
        return kro;
    }

    public static Map<String, String> getVideoSurveillance() {
        return videoSurveillance;
    }

    public static List<Map> getRetailMapList() {
        return retailMapList;
    }

    public static List<String> getRetailList() {
        return retailList;
    }

}

