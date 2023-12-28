import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {

        //create object of student class
        Student student=new Student("shrey","shreyyerhs07@gmail.com",20,"gwalior");

        try {
            //create a fileOutputStream object to send whatever raw data is present in stream to file object.txt
            FileOutputStream fileOutputStream=new FileOutputStream("object.txt");
            //to convert object into stream of bytes and sending these bytes to fileOutputStream
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            //method to write bytes into file
            objectOutputStream.writeObject(student);
            //so overall objectOutputStream converts the state of an object to stream of bytes(fileOutputStream)
            //and then fileOutputStream is writing those bytes in object.txt
            System.out.println("Object is transfered to file");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
