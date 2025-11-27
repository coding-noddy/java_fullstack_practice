public class AbstractClasses {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new FullTimeEmployee(60000);
    
        Employee emp3 = new PartTimeEmployee(1000, 50);
        Employee emp4 = new PartTimeEmployee(2000, 100);

        System.out.printf("Full time : emp1 :: %f\n", emp1.calculateSalary());
        System.out.printf("Full time : emp2 :: %f\n", emp2.calculateSalary());
        System.out.printf("Full time : emp3 :: %f\n", emp3.calculateSalary());
        System.out.printf("Full time : emp4 :: %f\n", emp4.calculateSalary());
    }
}

abstract class Employee {
    protected double salary;
    public abstract double calculateSalary();
    public double getSalary() {
        return this.salary;
    }
}

class FullTimeEmployee extends Employee {
    
    FullTimeEmployee(double fixedSalary) {
        this.salary = fixedSalary;
    }

    public double calculateSalary() {
        return this.salary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate = 0;
    private int hoursWorked = 0;
    
    PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        this.salary = this.hourlyRate * this.hoursWorked;
        return this.salary;
    }
}