public class Student implements Comparable<Student>{
    int id;
    Student(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
