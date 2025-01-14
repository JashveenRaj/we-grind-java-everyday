package Patterns;

public class pattern_laks {
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

//--------------------------------------------------TRIALS----------------------------------------------------------------------------

//*
//* *
//* * *
//* * * *
//* * * * *

//public class pattern_laks {
//    public static void main(String[] args) {
//        int a = 5;
//        for (int i = 0; i < a+1; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//        System.out.println();
//        }
//    }
//}

//----------------------------------------------------------------------------------------------------------------------------------------

//* * * * *
//* * * *
//* * *
//* *
//*


//public class pattern_laks{
//    public static void main(String[] args) {
//        int a = 5;
//        for (int i = a ; i > 0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//        System.out.println();
//        }
//    }
//}

//---------------------------------------------------------------------------------------------------------------------------------------

//    *
//   * *
//  * * *
// * * * *

//public class pattern_laks{
//    public static void main(String[] args) {
//        int a = 4;
//        for (int i = 0; i < a+1 ; i++) {
//            for (int j = 0; j < a-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("*");
//                System.out.print(" ");
//            }
//
//        System.out.println();
//        }
//    }
//}

//-----------------------------------------------------------------------------------------------------------------------------------------

//_ _ _ _
//_ _ _ _
//_ _ __
//_ ___
//____

//public class pattern_laks{
//    public static void main(String[] args) {
//        int a = 4;
//        for (int i = 0; i < a+1 ; i++) {
//            for (int j = 0; j < a-i; j++) {
//                System.out.print("_");
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("_");
//            }
//            System.out.println();
//        }
//    }
//}

//-------------------------------------------------------------------------------------------------------------------------------------
