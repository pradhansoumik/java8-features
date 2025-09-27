package jpmc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JpmcEmployee {
    private int empId;
    private String empName;
    private double empSalary;

    public JpmcEmployee(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "JpmcEmployee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }
}
class JpmcEmployeeMain {
    public static void main(String[] args) {
        JpmcEmployee emp1 = new JpmcEmployee(101, "Alice", 75000);
        JpmcEmployee emp2 = new JpmcEmployee(102, "Bob", 80000);
        JpmcEmployee emp3 = new JpmcEmployee(103, "Charlie", 70000);
        JpmcEmployee emp4 = new JpmcEmployee(104, "Diana", 60000);

        List<JpmcEmployee> list = Arrays.asList(emp1, emp2, emp3, emp4);

        List<JpmcEmployee> retList = list.stream().sorted(Comparator.comparing(JpmcEmployee::getEmpSalary)).toList();
        System.out.println(retList);
    }
}
