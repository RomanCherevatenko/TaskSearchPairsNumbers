public class Not_Optimal_solution {
    public static void main(String[] args) {

        int nums[] = {10, 20, 30, 40, 1, 2, 30, 54, 23, 12, 24, 14};

        int sum = 54;

        System.out.println("Given value: " + sum);     //O(n^2)
        System.out.print("Combination of two elements: ");

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == sum) {
                    System.out.print("\n" + nums[i] + " and " + nums[j]);
                }
            }
        }
    }
}


