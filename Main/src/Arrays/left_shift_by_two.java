package Arrays;

class left2{
    public static int[] shifter2(int[] array){
        int temp1 = array[0];
        int temp2 = array[1];

        for(int i = 0 ; i<array.length-2 ; i++){
            array[i] = array[i+2];
        }
        array[array.length-1] = temp2;
        array[array.length-2] = temp1;

        return array;
    }
}


public class left_shift_by_two {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; //3, 4, 5, 1, 2
        int[] result = left2.shifter2(a);
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
