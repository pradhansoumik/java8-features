import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Practice01LambdaExpression {

    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(26,250000));
        list.add(new Employees(15,5000));
        list.add(new Employees(10,300000));
        list.add(new Employees(30,500000));
        list.add(new Employees(50,550000));
        //People having age more than 25 , increase their salary by 30%
        System.out.println(list);
        List<Employees> modifyList = list.stream().filter(e -> e.getAge()>25).map(e -> {e.setSalary(e.getSalary()*1.3);
            return e;}).collect(Collectors.toList());
        System.out.println(modifyList);
    }
}

class Employees {
    int age;
    double salary;

    public Employees(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
