package Arrays;

public class SecondLargest {
    public static void main(String[] args) {

        int[] array = {10, 20, 5, 15, 30, 25};
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

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }
}