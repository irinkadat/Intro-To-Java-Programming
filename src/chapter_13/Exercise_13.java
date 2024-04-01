package chapter_13;

public class Exercise_13 {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming");
        course1.addStudent("Irinka");
        course1.addStudent("kkk");

        Course course2 = (Course) course1.clone();

        course2.addStudent("Irishka");

        System.out.println("Students in original course:");
        printStudents(course1);

        System.out.println("\nStudents in cloned course:");
        printStudents(course2);
    }

    public static void printStudents(Course course) {
        String[] students = course.getStudents();
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}
class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
    }

    @Override
    public Object clone() {
        try {
            Course clonedCourse = (Course) super.clone();
            clonedCourse.students = students.clone(); // დის იზ დი ვეი ვი ქრიეით deep copy of students array
            return clonedCourse;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
