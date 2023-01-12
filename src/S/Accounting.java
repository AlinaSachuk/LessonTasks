package S;

public class Accounting {
    public void changeSalary (double coefficient){
        long newSalary = (long) ((Employee.getSalary()) * coefficient);
    }
}
