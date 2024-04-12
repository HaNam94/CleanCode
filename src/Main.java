import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Quỳnh", new double[]{8.5, 7.8, 9.2}, "Female");
        Student student2 = new Student(2, "Nam", new double[]{8.5, 9.5, 8.0}, "Male");
        Student student3 = new Student(3, "Huyền Anh", new double[]{6.8, 7.0, 7.5}, "Female");

        StudentManager manager = new StudentManager();

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        System.out.println("Average grade of all students: " + manager.calculateAverageGradeOfAllStudents());



        Student foundStudentById = manager.findStudentById(2);
        if (foundStudentById != null) {
            System.out.println("Found student by ID: " + foundStudentById.getName());
        } else {
            System.out.println("Student with ID 2 not found.");
        }

        System.out.println("Students with name containing 'a':");
        for (Student student : manager.findStudentsByName("a")) {
            System.out.println(student.getName());
        }

        Student highestScorer = manager.getStudentWithHighestAverageGrade();
        System.out.println("Student with the highest average grade: " + highestScorer.getName());


    }
}