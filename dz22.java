import java.io.*;

public class dz22 {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("fail.txt", false)) {

            String text ="TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST TEST ";
            writer.write(text);

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}