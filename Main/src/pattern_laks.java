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

public class pattern_laks{
    public static void main(String[] args) {
        int a = 4;
        for (int i = 0; i < a+1 ; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("_");
            }
            System.out.println();
        }
    }
}