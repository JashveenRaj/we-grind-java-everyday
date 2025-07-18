package Arrays;

public class conosecutive_1s {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,1,1,1,1};
        int p1 = 0;
        int p2 = 1;
        int count = 1;
        int max = 0;

        while(p2< arr.length){
            if(arr[p1]==1 && arr[p2]==1){
                count++;
                if(count>max) //We can use Math.max(count,max)
                    max = count;
            } else if (arr[p2]==0) {
                count = 1;
            }
            p1++;
            p2++;
        }
        System.out.println(max);
    }
}
