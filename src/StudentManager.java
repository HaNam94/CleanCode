import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public List<Student> students;
    public StudentManager(){
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStundent(int id, Student updateStudent){
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id){
                students.set(i, updateStudent);
                return;
            }
        }
    }
    public double calculateAverageGradeOfAllStudents() {
        double totalAverage = 0;
        for (Student student : students) {
            totalAverage += student.calculateAverageGrade();
        }
        return totalAverage / students.size();
    }
    public Student findStudentById(int id){
        for (Student student : students){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }
    public List<Student> findStudentsByName(String name){
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students){
            if (student.getName().toLowerCase().contains(name.toLowerCase())){
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }
    public Student getStudentWithHighestAverageGrade(){
        if (students.isEmpty()){
            return null;
        }
        Student highestScoringStudent = students.get(0);
        double highestAverage = highestScoringStudent.calculateAverageGrade();
        for (Student student : students){
            double average = student.calculateAverageGrade();
            if (average > highestAverage){
                highestAverage = average;
                highestScoringStudent = student;
            }
        }
        return highestScoringStudent;
    }
}
