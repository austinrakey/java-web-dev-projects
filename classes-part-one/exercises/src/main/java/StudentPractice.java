import java.sql.SQLOutput;
import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below


        ArrayList<Student> enrolledStudents = new ArrayList<>();



        Student Austin = new Student("Austin", 12345, 1, 4.0);
        Student Churd = new Student("Churd", 54321, 1, 3.9);
        Student Ronathan = new Student("Ronathan", 35467, 1, 0.0);
        Teacher Phil = new Teacher("Phil", "Hodges", "Java", 10000);

        enrolledStudents.add(Austin);
        enrolledStudents.add(Churd);
        enrolledStudents.add(Ronathan);



        Course lc101 = new Course("Java", Phil, enrolledStudents);

        System.out.println(Austin.getName() + "is great!");
        System.out.println(Phil.getYearsTeaching());
        System.out.println(lc101.getEnrolledStudents());



    }
}