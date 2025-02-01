package Strings;
import java.util.Scanner;

/*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed,
    so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
*/

public class countxx {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0 ;
        char[] c = str.toCharArray();
        for(int i = 0 ; i <c.length ; i++){
            for(int j = i+1 ; j<c.length ; j++){
                if(c[i]=='x'&&c[j]=='x'){
                    count++;
                    c[j]='a';
                }else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
