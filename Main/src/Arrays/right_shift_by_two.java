class right2{
    public static int[] shifter2(int[] array){
        int temp1 = array[array.length-1];
        int temp2 = array[array.length-2];

        for (int i = array.length-1 ; i > 1 ; i--) {
            array[i] = array[i-2];
        }
        array[0] = temp2;
        array[1] = temp1;

        return array;
    }
}

public class right_shift_by_two {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; // {4, 5, 1, 2, 3}
        int[] result = right2.shifter2(a);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
