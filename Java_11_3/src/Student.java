import java.util.Date;
import java.text.SimpleDateFormat;
public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    int group;
    int GPA;
    Date birthday;

    public Student(String name, String surname, String speciality, int course, int group, int GPA, Date birth) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        birthday = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", GPA=" + GPA +
                ", birthday=" + SDF.format(birthday) +
                '}';
    }
}
