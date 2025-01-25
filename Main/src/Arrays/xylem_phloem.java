package Arrays;

public class xylem_phloem {
    public static void main(String[] args) {
        int num = 1234;
        int num2 =num;
        int size = 0;
        while(num>0){
            num=num/10;
            size++;
        }
        int[]a = new int[size];

        while(num2>0){
            for(int i = 0 ; i<a.length; i++) {
                a[i] = num2 % 10;
                num2/=10;
            }
        }

        int inbetween = 0;
        for (int i = 1; i < a.length-1 ; i++) {
            inbetween+=a[i];
        }
        if((a[0]+ a[a.length-1] == inbetween )){
            System.out.println("Xylem");
        }else{
            System.out.println("Phloem");
        }
    }
}
