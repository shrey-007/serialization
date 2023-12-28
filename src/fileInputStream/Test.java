
/*
In Java, FileOutputStream is a class that is part of the java.io package and is used for writing raw bytes to a file.
It is a subclass of the OutputStream class. FileOutputStream is commonly used to create a file and write data to it.
 */



package fileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        // Specify the path of the file you want to create or overwrite
        String filePath = "example.txt";

        try {
            // Create a FileOutputStream object with the specified file path
            FileOutputStream fos = new FileOutputStream(filePath);

            // Write bytes to the file
            String data = "Hello, FileOutputStream!";
            byte[] byteData = data.getBytes();
            fos.write(byteData);

            // Close the FileOutputStream to release resources
            fos.close();

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
In this example:

1) We create a FileOutputStream object with the file path "example.txt".
2) We convert a string ("Hello, FileOutputStream!") to bytes using the getBytes() method.
3) We use the write() method of FileOutputStream to write the byte data to the file.
4) Finally, we close the FileOutputStream using the close() method to release system resources.

*/

