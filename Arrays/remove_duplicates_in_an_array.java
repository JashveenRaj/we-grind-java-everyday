package Arrays;
import java.util.Arrays;

class removing{
    public static int[] duplicates(int[] array){
        int count = 0;
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]==array[j]){
                    array[j] = 0;
                    if(array[i]!=0){
                        count++;
                    }
                }
            }
        }

        int[] newarr = new int[array.length-count];
        int index = 0;
        for (int i = 0; i <=array.length-1; i++) {
            if(array[i]!=0){
                newarr[index] = array[i];
                index++;
            }
        }
        return newarr;
    }
}

public class remove_duplicates_in_an_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,1,2,3,5,6,7};
        int[] result = removing.duplicates(a);
        System.out.print(Arrays.toString(result));
    }
}
