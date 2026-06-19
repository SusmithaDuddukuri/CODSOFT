public class Student {
    private int rollNo;
    private String name;
    private String grade;
    private String course;

    public Student(int rollNo, String name, String grade, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +
               "\nName: " + name +
               "\nGrade: " + grade +
               "\nCourse: " + course +
               "\n--------------------------";
    }
}