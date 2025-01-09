// public class for_each {
//     public static void main(String[] args) {
        
//         int nums[] = new int[3];
//         nums[0] = 5;
//         nums[1] = 4;
//         nums[2] = 2;

//         for(int i=0;i<nums.length;i++){
//             System.out.println(nums[i]);
//         }

//         for(int n:nums){
//             System.out.println(n);
//         }
//     }
//}


public class for_each{
    public static void main(String[] args) {
        int nums[][]=new int[3][3];
        nums[0][0] = 1;
        nums[0][1] = 1;
        nums[0][2] = 1;
        nums[1][0] = 1;
        nums[1][1] = 1;
        nums[1][2] = 1;
        nums[2][0] = 1;
        nums[2][1] = 1;
        nums[2][2] = 1;

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.println(nums[i][j]);
        //     }
        // }

        for(int[] n:nums){
            for(int m:n){
                System.out.println(m);
            }
        }
    }
}