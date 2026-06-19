import java.util.ArrayList;

public class StudentManagementSystem {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void removeStudent(int rollNo) {

        for (Student s : students) {

            if (s.getRollNo() == rollNo) {
                students.remove(s);
                System.out.println("Student removed successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }
}