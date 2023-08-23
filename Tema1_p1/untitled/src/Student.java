import java.io.Serializable;
import java.util.UUID;

public class Student implements Serializable {

    private String id;
    private String firstName;
    private String lastName;
    private double grade;
    private Integer birthYear;

    public Student(StudentBuilder studentBuilder){
        this.id = UUID.randomUUID().toString();
        this.firstName = studentBuilder.getFirstName();
        this.lastName = studentBuilder.getLastName();
        this.grade = studentBuilder.getGrade();
        this.birthYear = studentBuilder.getBirthYear();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", birthYear=" + birthYear +
                '}';
    }

    public static class StudentBuilder{
        private String id;
        private String firstName;
        private String lastName;
        private double grade;
        private Integer birthYear;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        public Integer getBirthYear() {
            return birthYear;
        }

        public StudentBuilder setId(String id) {
            this.id = id;
            return this;

        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;

        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;

        }

        public StudentBuilder setGrade(double grade) {
            this.grade = grade;
            return this;

        }

        public StudentBuilder setBirthYear(Integer birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

