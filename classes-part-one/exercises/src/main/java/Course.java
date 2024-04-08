import java.util.ArrayList;

public class Course {

        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;


    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }



    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String topic, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }




}
