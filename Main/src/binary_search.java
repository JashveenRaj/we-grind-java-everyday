class binary{
    public static int search(int[] a , int target){
        int left = 0;
        int right = a.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if (a[mid] == target){
                return mid;
            } else if (a[mid]<target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class binary_search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,12,47};
        int result = binary.search(array,6);
        System.out.println(result);
    }
}
