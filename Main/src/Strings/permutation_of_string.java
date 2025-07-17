package Strings;

public class permutation_of_string {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        char[] c = s.toCharArray();
        int[] a = new int[n];
        System.out.println(new String (c));

        int  i = 0 ;
        while(i<n){
            if(a[i]<i){
                if(i%2==0){
                    swap(c,0,i);
                }else{
                    swap(c,a[i],i);
                }
                System.out.println(new String(c));
                a[i]++;
                i=0;
            }else{
                a[i]=0;
                i++;
            }
        }
    }

    private static void swap(char[] c, int i , int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
