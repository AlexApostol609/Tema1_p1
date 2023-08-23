import java.io.IOException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        List<Student> arrayOfStudents = new ArrayList<Student>();
        Student s1 = new Student.StudentBuilder()
                    .setFirstName("Alin")
                    .setGrade(9)
                    .setBirthYear(1999)
                    .build();

        Student s2 = new Student.StudentBuilder()
                .setFirstName("Vali")
                .setGrade(9.8)
                .setBirthYear(2001)
                .build();

        Student s3 = new Student.StudentBuilder()
                .setFirstName("Costi")
                .setGrade(9.2)
                .setBirthYear(2000)
                .build();

        StudentManager man1 = new StudentManager();

        arrayOfStudents.add(s1);
        arrayOfStudents.add(s2);
        arrayOfStudents.add(s3);
        man1.writeToFile(arrayOfStudents);

        man1.closeFile();
    }}