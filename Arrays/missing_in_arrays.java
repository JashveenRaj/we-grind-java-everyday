package Arrays;

public class missing_in_arrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,4,5};
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length ; j++) {
                if(a[i] == b[j]){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(a[i]);
            }
        }

    }
}
