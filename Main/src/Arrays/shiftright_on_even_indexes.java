package Arrays;

class shiftright{
    public static int[] foreven(int[] array){
        for (int i = array.length-1 ; i > 1; i--) {
            if(array[i]%2==0){
                    int temp = array[i];
                    array[i] = array[i-2];
                    array[i-2] = temp;
                }
            }
        return array;
    }
}


public class shiftright_on_even_indexes {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] result = shiftright.foreven(a);
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}
