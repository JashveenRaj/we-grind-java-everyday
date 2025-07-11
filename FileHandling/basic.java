package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class basic {
    public static void main(String[] args) {
        File file = new File("Demo");
        File file1 = new File("text.txt");

        file.mkdir();

        System.out.println(file.exists());

        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file2 = new File("abc.txt");
        file1.renameTo(file2);

    }
}
