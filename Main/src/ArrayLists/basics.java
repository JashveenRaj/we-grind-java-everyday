package ArrayLists;
import java.util.*;

public class basics {
    public static void main(String[] args){
        //Declaration of Integer type ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //Adding new elements
        arr.add(2);
        arr.add(5);
        arr.add(4);

        //Printing an ArrayList
        System.out.println("ArrayList: " + arr);

        //Removing from an ArrayList
        arr.remove(1);
        System.out.println("Element from index 1 removed: "+arr);

        //Accessing an Element
        System.out.println("Accessed Element: "+arr.get(1));

        //Updating an Element
        arr.set(0, 7);
        System.out.println("Updated: " + arr);

        //Size of an ArrayList
        System.out.println("Size: " + arr.size());

        //Copying an ArrayList to new ArrayList
        ArrayList<Integer> arr2 = arr;
        System.out.println("Copied ArrayList: " + arr2);

        //Iterating through ArrayList
        for(int i = 0 ; i<arr.size() ; i++){
            System.out.println("Elements Iterated: " + arr.get(i));
        }

        //Sorting an ArrayList
        Collections.sort(arr);
        System.out.println(arr);

        //Converting ArrayList to Array
        Integer[] array = arr.toArray(new Integer[0]);
        //This shit is called generics, i don't know that till now, screw this
        System.out.println("Generic type Array Conversion : " + Arrays.toString(array));

        //Conventional way to convert ArrayList to primitive type int array
        int[] array2 = new int[arr.size()];
        for(int i = 0 ; i<arr.size() ; i++){
            array2[i] = arr.get(i);
        }
        System.out.println("Primitive type Array Conversion: " + Arrays.toString(array2));
    }
}
