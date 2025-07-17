package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class basic2 {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        file.createNewFile();
        System.out.println(file.exists());

        String s = "Hello Nigga";
        FileOutputStream f1 = new FileOutputStream(file);
//        f1.write(s.getBytes());

        for (int i = 0; i < s.length(); i++) {
            f1.write(s.charAt(i));
        }

        FileInputStream f2 = new FileInputStream(file);
        int a = f2.read();
        System.out.println("Returns first charecter's ASCII Value: " + a);
        while(a!=-1){
            a=f2.read();
            System.out.print(a + " ");
            System.out.println((char) a );
        }
    }
}

