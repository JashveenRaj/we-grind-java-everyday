package Arrays;

public class missing_in_range {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        int out = 0;
        for (int i = 0; i < max; i++) {
            for (int j = 1; j < a.length; j++) {
                if(a[j] != i){
                   out=i;
                }
            }
        }
        System.out.println(out);
    }
}
