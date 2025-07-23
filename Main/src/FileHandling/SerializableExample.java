package FileHandling;

import java.io.*;

class Summa implements Serializable {
    String email;
    transient int pwd;  // will NOT be serialized

    public Summa(String email, int pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Summa{" +
                "email='" + email + '\'' +
                ", pwd=" + pwd +
                '}';
    }
}

public class SerializableExample {
    public static void main(String[] args) {
        String filename = "output1.ser";
        Summa obj = new Summa("jash@gmail.com", 12345);

        // Serialize the object
        try {
            // Create parent dirs if necessary
            File file = new File(filename);
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }


            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
                oos.writeObject(obj);
                System.out.println("Object serialized to " + filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Summa deserializedObj = (Summa) ois.readObject();
            System.out.println("Deserialized object: " + deserializedObj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
