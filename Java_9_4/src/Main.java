public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(3, 6);
        Student s2 = new Student(2, 7);
        Student s3 = new Student(1, 5);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
    }
}