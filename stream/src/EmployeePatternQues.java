import java.util.*;
import java.util.stream.Collectors;

public class EmployeePatternQues {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //1. How many males and females employees are there in an organisation ?
        Map<String, Long> noOfMaleAndFemaleEmployee =employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployee);

        //2. Print the names of all departments
        /*List<String> departmentNames1 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(departmentNames1);*/
        employeeList.stream().map(Employee::getDepartment).distinct()
                .forEach(System.out::println);
        /*System.out.println(departmentNames);*/

        //3.  average age of male and female employees ?
        Map<String, Double> avgAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge)));
        System.out.println(avgAge);

        //4. Which employee has maximum salary ?
        Optional<Double> max = employeeList.stream().map(Employee::getSalary).max(Double::compare);
        System.out.println(max);

        Optional<Employee> emp = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(emp);

        Optional<Employee> highestPaidEmployee =
                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(highestPaidEmployee);

        //5. Get the names of all employees who have joined after 2015 ?
        List<String> emp1 = employeeList.stream().filter(e->e.getYearOfJoining()>2015)
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(emp1);

        //6. Count the number of employees in each department
        Map<String, Long> emp3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(emp3);

        //7. How many male and female in sales and marketing department
        Map<String, Long> salesAndMarketing = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales and marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(salesAndMarketing);
    }
}
class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }

    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

}
