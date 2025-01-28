package Arrays;

public class max_min_max_min {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = new int[a.length];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]<a[j]){
                    max1 = a[i];
                    a[i+1] = a[j];
                }
            }
        }
    }
}
