class get {
    public static int element(int[] a, int target){
        int left = 0;
        int right = a.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if (a[mid]==target){
                return mid;
            } else if (a[mid] < target) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}

class not{
    public static int found(int neg , int[] b){
        if(neg == -1){

        }
        return neg;
    }
}

public class find_or_insert {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,6,7};
        int out = get.element(array,4);
        int insert = not.found(out,array);
        System.out.println();
    }
}
