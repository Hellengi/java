import java.util.Comparator;

public class Student implements Comparator<Student> {
    int id;
    int GPA;

    public Student(int id, int GPA) {
        this.id = id;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return -(o1.GPA - o2.GPA);
    }
}
