import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {

        //create object of student class
        Student student=new Student("shrey","shreyyerhs07@gmail.com",20,"gwalior");

        try {

            FileOutputStream fileOutputStream=new FileOutputStream("object.txt");

            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);

            System.out.println("Object is transfered to file");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
