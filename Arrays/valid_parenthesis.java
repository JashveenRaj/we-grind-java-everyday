//package Arrays;
//import java.util.*;
//
//public class valid_parenthesis {
//    public static void main(String[] args) {
//        Stack<Character> stack = new Stack<>();
//
//        for(char c : s.toCharArray()){
//            if(c=='(' || c=='{' || c=='['){
//                stack.push(c);
//            }else{
//                if(stack.isEmpty()){
//                    return false;
//                }
//                char top = stack.pop();
//                if ((c == ')' && top != '(') ||
//                        (c == '}' && top != '{') ||
//                        (c == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//        }
//    }
