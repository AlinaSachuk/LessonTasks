package S;

public class Employee {
    private String name;
    private int age;
    private long salary;
    private String email;

    public static long getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
