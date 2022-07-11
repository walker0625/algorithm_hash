import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(solution(s1, s2));
    }

    private static String solution(String s1, String s2) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
           map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        return answer;
    }
}
