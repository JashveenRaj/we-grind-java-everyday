class linear{
    public static int search(int[] a , int target ){
        for (int i = 0; i < a.length-1; i++) {
           if (a[i] == target){
               return i;
           }
        }
        return -1;
    }
}

public class linear_search{
    public static void main(String[] args) {
        int[] array = {1,3,5,6,2,4};
        int result = linear.search(array,6);
        System.out.println(result);
    }
}
