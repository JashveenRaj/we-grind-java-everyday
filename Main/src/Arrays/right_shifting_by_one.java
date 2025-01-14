package Arrays;

class right{
    public static int[] shifter(int[] array){
        int temp = array[array.length-1];
        for (int i = array.length-1 ; i > 0 ; i--) {
            array[i] = array[i-1];
        }
        array[0] = temp;
        return array;
    }
}


public class right_shifting_by_one {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] result = right.shifter(a);
        for(int i:result){
            System.out.print(i + " ");
        }
    }
}
