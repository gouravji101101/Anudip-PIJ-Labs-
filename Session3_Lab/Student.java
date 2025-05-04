package Session3_Lab;

public class Student {
    private String name;
    private int age;
    private String department;

    // Constructor
    public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Student stu = new Student("Priya", 21, "Computer Science");

        System.out.println("Student Details:");
        System.out.println("Name: " + stu.getName());
        System.out.println("Age: " + stu.getAge());
        System.out.println("Department: " + stu.getDepartment());
    }
}
