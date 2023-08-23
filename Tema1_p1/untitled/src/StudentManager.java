import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager implements Serializable {
    public void writeToFile(List<Student> students) throws IOException {

        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("students.data"));
            output.writeObject(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    List<Student> emp = new ArrayList<Student>();

    public void closeFile(){
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("students.data"));
            emp = (List<Student>) is.readObject();
            System.out.print(emp.toString());

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}




