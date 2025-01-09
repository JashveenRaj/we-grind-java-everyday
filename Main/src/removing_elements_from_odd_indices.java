import java.util.Arrays;

class remover{
    public static int[] odd_indices(int[] array){
        int count = 0 ;

        for (int i = 0 ; i <= array.length-1 ; i++) {
            if(i%2!=0){
                array[i] = 0;
                count++;
            }
        }

        int a = array.length-count;
        int[] newarr = new int[a];
        int index = 0;

        for (int i = 0; i <= array.length-1; i++) {
            if(array[i] != 0 ){
                newarr[index] = array[i];
                index++;
            }
        }
        return newarr;
    }
}

public class removing_elements_from_odd_indices {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5}; //1 3 5
        int[] result = remover.odd_indices(a);
        System.out.println(Arrays.toString(result));
    }
}
