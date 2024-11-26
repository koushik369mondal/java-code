class Student {
    private String name;
    private double cgpa;

    // parameterized constructor
    Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.getName();
        this.cgpa = s.getcgpa();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getcgpa() {
        return cgpa;
    }

    public void setcgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Kaushik", 8.5);
        Student cloneOfS1 = new Student(s1);

        s1.setName("Mandal");// Changing the original object

        System.out.println("Student-1: " + s1.getName());
        System.out.println("Student-2: " + cloneOfS1.getName());
    }
}
