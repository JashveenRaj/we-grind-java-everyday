package Strings;
/* 
* "\\s+" - removes one or more whitespaces from an String.
* If we use for each loop to iterate over string array, it gonna give words without spaces BUT THE SPACES ARE THERE !! 
* for each mf just seems to avoid it. ["v' , " " , "f" , "gfc"] - this is how it sees if we add multiple spaces and while printing them
* bro just ignores them 🙃.
* */

class reverse{
    public static String word(String word){
        String[] reverse = word.split("\\s+");
        String ans = "";
        for (int i = reverse.length-1 ; i >= 0 ; i--) {
            ans+=reverse[i] + " ";
        }
        return ans.strip();
    }
}

public class reversing_words {
    public static void main(String[] args) {
        String user = "v f gfc";
        String result = reverse.word(user);
        System.out.print((result));
    }
}
