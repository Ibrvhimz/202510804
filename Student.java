import java.util.Scanner;

public class Student {
    private String registrationNumber;
    private String name;
    private int age;
    private double mark1;
    private double mark2;
    private double mark3;

    public Student(String registrationNumber, String name, int age, double mark1, double mark2, double mark3) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
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

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getMark3() {
        return mark3;
    }

    public void setMark3(double mark3) {
        this.mark3 = mark3;
    }

    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    public String getStatus() {
        if (calculateAverage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    public void displayInformation() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Status: " + getStatus());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        String regNo = input.nextLine();

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Age: ");
        int age = input.nextInt();

        System.out.print("Enter Mark 1: ");
        double m1 = input.nextDouble();

        System.out.print("Enter Mark 2: ");
        double m2 = input.nextDouble();

        System.out.print("Enter Mark 3: ");
        double m3 = input.nextDouble();

        Student student = new Student(regNo, name, age, m1, m2, m3);

        System.out.println("\n--- Student Details ---");
        student.displayInformation();

        input.close();
    }
}
