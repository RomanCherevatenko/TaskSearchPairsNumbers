import java.util.Arrays;

public class Optimal_solution {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int array[] = {-2, -1, 0, 3, 5, 6, 7, 9, 13, 14};
        int sum = 10;
        Optimal_solution optimal_solution = new Optimal_solution();
       optimal_solution.printPair(array, sum);

        System.out.println(System.currentTimeMillis() - time);
    }

    void printPair(int[] array, int sum) {
        Arrays.sort(array);                 // O(n log n)
        int first = 0;
        int last = array.length - 1;
        while (first < last) {              //  O(n)
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + " and " + array[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
    }
}
