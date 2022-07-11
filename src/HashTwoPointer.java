import java.util.*;

public class HashTwoPointer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int w = sc.nextInt();
        int[] arr = new int[d];
        for (int i = 0; i < d; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(d, w, arr)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int d, int w, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< w-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;

        for (int rt = w-1; rt < d; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);

            if(map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }
}
