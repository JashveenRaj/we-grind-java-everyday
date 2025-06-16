package Arrays;
import java.util.Arrays;

class move{
    public static int[] zero(int[] array){
        int[] newarr = new int[array.length];
        int index = 0;
        for (int i : array) {
            if (i != 0) {
                newarr[index] = i;
                index++;
            }
        }
        return newarr;
    }
}

public class move_zeroes_to_end {
    public static void main(String[] args) {
        int[] a = {0,1,0,2,3,4,0,0,5,0,6};
        int[] result = move.zero(a);
        System.out.print(Arrays.toString(result));
    }
}
