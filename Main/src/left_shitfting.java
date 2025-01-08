class left{
    public static int[] shifter(int[] array){
        int temp = array[0];
        for (int i = 0; i < array.length-1 ; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = temp;
        return array;
    }
}

public class left_shitfting {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; //2 3 4 5 1
        int[] result = left.shifter(a);
        for(int i: result){
            System.out.print(i + " ");
        }
    }
}
