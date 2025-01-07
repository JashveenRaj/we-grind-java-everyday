class max {
    public static int element_in_array(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}

class min {
    public static int element_in_array2(int[] array2) {
        int min = array2[0];
        for (int i : array2) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}

class maxi {
    public static int fromhalf(int[] array) {
        int max = array[0];
        int limit;

        if ((array.length) % 2 == 0) {
            limit = array.length / 2;
        } else {
            limit = array.length / 2 + 1;
        }

        for (int i = 0; i < limit; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

class mini{
    public static int fromhalf(int[] array){
        int max = array[0];
        int limit;

        if ((array.length) % 2 == 0) {
            limit = array.length / 2;
        } else {
            limit = array.length / 2 + 1;
        }

        for (int i = 0; i < limit; i++) {
            if (max > array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

class maxim{
    public static int fromevenindices(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(i%2 == 0){
                if(max<array[i]){
                    max = array[i];
                }
            }
        }
        return max;
    }
}

class reversingarr{
    public static int[] thearray(int[] array){
        int start = 0;              //pointers
        int end = array.length-1;

        while(start < end){
            int temp = array[start];
            array [start]= array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
}

//class reversefirst{
//    public static int[] half(int[] array){
//        int limit;
//        if(array.length%2 == 0){
//            limit = (array.length/2)-1;
//        } else {
//            limit = array.length/2;
//        }
//
//        int start = 0;
//        int end = array.length-1;
//
//        for(int i = 0 ; i<limit ; i++){
//            while(start<end){
//                int temp = array[start];
//                start = end;
//                end = temp;
//                start++;
//                end--;
//            }
//        }
//        return array;
//    }
//}

public class max_element_in_array {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 6, 9, -3, -9, 7, 3, -52};
        int result1 = max.element_in_array(arr);
        int result2 = min.element_in_array2(arr);
        int result3 = maxi.fromhalf(arr);
        int result4 = mini.fromhalf(arr);
        int result5 = maxim.fromevenindices(arr);
        int[] result6 = reversingarr.thearray(arr);
//        int[] result7 = reversefirst.half(arr);

        System.out.println("Maximum element in array is: " + result1);
        System.out.println("Minimum element in array is: " + result2);
        System.out.println("Maximum element in first half of the array is: " + result3);
        System.out.println("Minimum element in first half of the array is: " + result4);
        System.out.println("Maximum element from positive indices of given array is: " + result5);

        System.out.print("Reversed array: ");
        for(int i : result6){
            System.out.print(i + " ");
        }
        System.out.println();

//        System.out.print("First half of array reversed: ");
//        for(int i : result7){
//            System.out.print(i + " ");
//        }
    }
}
