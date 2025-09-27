import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeExample {
    int empId;
    String deptName;
    Double salary;

    public EmployeeExample(int empId, String deptName, Double salary){
        this.empId = empId;
        this.deptName = deptName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: "+empId+" dept: "+deptName+" salary: "+salary;
    }

    public String getDeptName(){
        return deptName;
    }
    public Double getSalary(){
        return salary;
    }
}
class Execution{
    public static void main(String[] args) {
        EmployeeExample e1 = new EmployeeExample(1,"IT",150000.0);
        EmployeeExample e2 = new EmployeeExample(2,"NON-IT",60000.0);
        EmployeeExample e3 = new EmployeeExample(3,"SUPPORT",50000.0);
        EmployeeExample e4 = new EmployeeExample(4,"IT",70000.0);
        EmployeeExample e5 = new EmployeeExample(5,"IT",80000.0);

        Predicate<EmployeeExample> p1 = e -> e.getDeptName().equals("IT");
        //Predicate<EmployeeExample> p2 = e -> e.getSalary() > 100000;

        List<EmployeeExample> list = Arrays.asList(e1,e2,e3,e4,e5);

        List<Double> list1 = list.stream().filter(p1).map(EmployeeExample::getSalary).toList();
        System.out.println("Salary: "+list1);
    }
}

