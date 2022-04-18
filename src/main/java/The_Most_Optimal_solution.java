import java.util.HashMap;
import java.util.Map;

public class The_Most_Optimal_solution {
    public static void main(String[] args) {
        int a[] = {2, 10, 15, 26, 7, 3, 45, 7, 14, 12, 13, 9, 5, 8};
        Pair(a, 21);
    }

    static void Pair(int[] a, int sum) {
        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (pairs.containsKey(sum - a[i]))
                System.out.println("(" + a[i] + "," + (sum - a[i]) + ")");
            else
                pairs.put(a[i], 0);
        }
    }
}
