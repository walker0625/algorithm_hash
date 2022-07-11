import java.util.HashMap;
import java.util.Scanner;

public class FindLeaderByHashMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }

    private static char solution(int n, String str) {
        char answer = 0;
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x: str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : map.keySet()) {
            if(map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }

        return answer;
    }

}
