package Arrays;

public class subarrays_of_arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 1; i < a.length-(a.length-i); i++) {
            System.out.print(a[i]);
        }
    }
}
