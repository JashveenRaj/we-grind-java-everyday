class arr {
    public static double sum_of_arr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        double avgResult = avg.of_array(arr, sum);
        return avgResult;
    }
}

class avg {
    public static double of_array(int[] arr2, int value) {
        double count = 0;
        for (int i : arr2) {
            count++;
        }
        double out = value / count;
        return out;
    }
}

public class add_even_indices {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        double result1 = arr.sum_of_arr(a);
        System.out.println(result1);
    }
}
