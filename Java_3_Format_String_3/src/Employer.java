public class Employer {
    private String fullname;
    private double salary;

    public Employer(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public Employer() {
        this.fullname = "";
        this.salary = 0;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
