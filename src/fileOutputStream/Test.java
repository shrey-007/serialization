/*
In Java, FileInputStream is a class that is part of the java.io package and is used for reading bytes from a file.
It is a subclass of the InputStream class. FileInputStream is commonly used to open and read data from a file in a
byte-oriented manner.
 */

package fileOutputStream;


import java.io.FileInputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        // Specify the path of the file you want to read
        String filePath = "example.txt";

        try {
            // Create a FileInputStream object with the specified file path
            FileInputStream fis = new FileInputStream(filePath);

            // Read bytes from the file
            int byteData;
            while ((byteData = fis.read()) != -1) {
                // Process the byte data (e.g., print or manipulate)
                System.out.print((char) byteData);
            }

            // Close the FileInputStream to release resources
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
1) We create a FileInputStream object with the file path "example.txt".
2) We use the read() method of FileInputStream to read a byte from the file.
   The read() method returns -1 when the end of the file is reached.
3) We process the byte data as needed. In this example, we cast the byte to a char and print it.
4) We continue reading and processing bytes until the end of the file is reached.
5) Finally, we close the FileInputStream using the close() method to release system resources.
 */
