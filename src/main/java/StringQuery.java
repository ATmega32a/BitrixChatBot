import java.util.Scanner;

public class StringQuery {
    private static StringBuilder query = new StringBuilder();
    private Scanner sc = new Scanner(System.in);

    public static StringBuilder getQuery() {
        return query;
    }

    public static void setQuery(StringBuilder query) {
        StringQuery.query = query;
    }
}
