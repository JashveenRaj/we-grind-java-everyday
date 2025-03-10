package Patterns;//*_*_*_*_*
//*_*_*_*__
//*_*_*____
//*_*______
//*________

public class triangle_and_dashes {
        public static void main(String[] args) {
            int a = 5;
            for (int i = a; i > 0 ; i--) {
                for (int j = 0; j < i ; j++) {
                    if(j==0){
                        System.out.print("*");
                    }else{
                        System.out.print("_*");
                        System.out.print("");
                    }
                }
                for(int k = a ; k>i ; k--){
                    System.out.print("__");
                    System.out.print("");
                }
                // System.out.println();
                System.out.println();
            }
        }
    }