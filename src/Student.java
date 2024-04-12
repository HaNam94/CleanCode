import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] grades;
    private String gender;

    public Student(int id, String name, double[] grades, String gender) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGredes() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", gender='" + gender + '\'' +
                '}';
    }
}
