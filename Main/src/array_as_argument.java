class adds {
    public static void array(int[] arr1 , int[] arr2){
        int[] sum = new int[arr1.length+arr2.length];
        for(int i:sum){
            sum[i] = arr1[i];
        }
        for(int i: sum){
            sum[arr1.length+i] = arr2[i];
        }
        for(int i: sum){
            System.out.println(i);
        }
    }
}

public class array_as_argument {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {5,4,3,2,1};
        adds.array(a,b);
    }
}
