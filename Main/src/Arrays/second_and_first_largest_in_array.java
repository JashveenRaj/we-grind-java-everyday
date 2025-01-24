package Arrays;

class second{
    public static int largest(int[] array){
        int largest = array[0]; // Assume the first element is the largest
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE; // Start with the smallest possible value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondLargest && array[i] < largest) {
                secondLargest = array[i]; // Update secondLargest
            }
        }
        return secondLargest;
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

public class second_and_first_largest_in_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,5,7,12,1,2};
        int result1 = first.largest(a);
        int result2 = second.largest(a);
        System.out.println("First Largest: " + result1);
        System.out.print("Second Largest: " + result2);
    }
}