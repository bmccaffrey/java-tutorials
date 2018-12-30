import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Bob", 100);
        scores.put("Michael", 86);
        scores.put("Seth", 85);
        System.out.println(scores);
        System.out.println(scores.get("Bob"));
    }
}
