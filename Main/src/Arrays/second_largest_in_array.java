package Arrays;

class second{
    public static int largest(int[] array){
        int max1 = 0 ;
        int max2 = -1 ;
        for(int i = 0 ; i<=array.length-2 ; i++){
            for(int j = 1 ; j<=array.length-1 ; j++){
                if(array[i] > array[j]){
                    max1 = array[i];
                    max2 = array[j];
                }
            }
        }

        for(int i = 0 ; i<=array.length-1; i++){
            if(array[i]>max2 && array[i]<max1){
                max2 = array[i];
            }
        }
        return max2;
    }
}

class first{
    public static int largest(int[] array){
        int max1 = 0;
        for(int i = 0 ; i<=array.length-2 ; i++) {
            for (int j = 1; j <= array.length - 1; j++) {
                if (array[i] > array[j]) {
                    max1 = array[i];
                    break;
                }
            }
        }
        return max1;
    }
}

public class second_largest_in_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,5,7,12,1,2};
        int result1 = first.largest(a);
        int result2 = second.largest(a);
        System.out.println("First Largest: " + result1);
        System.out.print("Second Largest: " + result2);
    }
}
