import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Smith", 19, "Miami", 8.38, "Civil"),
                new Student("Mike", "Miles", 21, "New York", 8.4, "IT"),
                new Student("Michael", "Peterson", 20, "New York", 7.5, "Civil"),
                new Student("James", "Robertson", 20, "Miami", 9.1, "IT"),
                new Student("John", "Miller", 20, "Miami", 7.83, "Civil")
        );

        //Find All Students from Miami with a grade > 8.0
        students.stream().filter(s -> s.getAddress().equalsIgnoreCase("Miami") && s.getCgpa() > 8.0)
                .forEach(System.out::println);

        //find the student with the highest grade
        Student student = students.stream().max(Comparator.comparingDouble(Student::getCgpa)).orElse(null);
        System.out.println("Student with the highest grade: " + student);

        //count the number of students in each department

        /*students.stream().map(Student::getDept).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .forEach((dept, count) -> System.out.println(dept + ": " + count));*/
        //OR,
        students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .forEach((dept, count) -> System.out.println("number of students in "+dept + ": " + count));

        //find the average grade per department
        Map<String, Double> studentMap = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getCgpa)));
        System.out.println("average grade per department: "+studentMap);

        //sort students by age, then by grade
        System.out.println("++++++++ number of students in each department +++++++");
        students.stream().sorted(Comparator.comparingInt(Student::getAge).thenComparingDouble(Student::getCgpa))
                .forEach(System.out::println);

        //Get a comma-separated list of all student names
        System.out.println("++++++++ comma-separated list of all student names +++++++");
        String collect = students.stream().map(s -> s.getfName()+" "+s.getlName()).collect(Collectors.joining(","));
        System.out.println("comma-separated list of all student names: " + collect);

        //check if all students are older than 18
        System.out.println("++++++++ check if all students are older than 18 +++++++");
        //students.stream().filter(s -> s.getAge() > 18).forEach(System.out::println);
        boolean allAbove18 = students.stream().allMatch(s -> s.getAge() > 18);
        System.out.println("are all students older than 18? " + allAbove18);

        //find the department with the most students
        System.out.println("++++++++ department with the most students +++++++");
        Map<String, Long> map = students.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey)
                .ifPresent(dept -> System.out.println("Department with the most students: " + dept));

        //Partition students into grade > 8.0 & grade <= 8.0
        System.out.println("++++++++ Partition students into grade > 8.0 & grade <= 8.0 +++++++");
        Map<Boolean, List<Student>> partitioned = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getCgpa() > 8.0));

        List<Student> above8 = partitioned.get(true);
        List<Student> belowOrEqual8 = partitioned.get(false);

        System.out.println("Students with grade > 8.0:");
        above8.forEach(s -> System.out.println(s.getfName() + " " + s.getlName() + " - " + s.getCgpa()));

        System.out.println("\nStudents with grade <= 8.0:");
        belowOrEqual8.forEach(s -> System.out.println(s.getfName() + " " + s.getlName() + " - " + s.getCgpa()));

        //find the student with the longest full name
        System.out.println("++++++++ student with the longest full name +++++++");
        students.stream().max(Comparator.comparing(s -> (s.getfName() + " " + s.getlName()).length()))
                .ifPresent(s -> System.out.println("Student with the longest full name: " + s.getfName() + " " + s.getlName()));

    }
}

class Student{

    String fName;
    String lName;
    int age;
    String address;
    double cgpa;
    String dept;

    public Student(String fName, String lName, int age, String address, double cgpa, String dept) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.address = address;
        this.cgpa = cgpa;
        this.dept = dept;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", cgpa=" + cgpa +
                ", dept='" + dept + '\'' +
                '}';
    }
}
