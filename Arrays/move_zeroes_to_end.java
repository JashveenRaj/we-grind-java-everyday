package Arrays;
import java.util.Arrays;

class move{
    public static int[] zero(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,3,4,0,0,5,0,6};
        int[] result = move.zero(a);
        System.out.print(Arrays.toString(result));
    }
}
