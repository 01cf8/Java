import java.io.*;

public class fileHandling {
    public static void main(String[] args) {
        // Code to create a file
        /*
         * File file = new File("file.txt");
         * try {
         * file.createNewFile();
         * } catch (Exception e) {
         * System.out.println("Unable to create file");
         * }
         */

        // Code to write to a file
        /*
         * try {
         * FileWriter writer = new FileWriter("file.txt");
         * writer.write("Writing to file\nWriting successfull");
         * writer.close();
         * } catch (Exception e) {
         * System.out.println("Unable to write to file");
         * }
         */

        // Code to read from a file
        try {
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Unable to read from file");
        }
    }
}