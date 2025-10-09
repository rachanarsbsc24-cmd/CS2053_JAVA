import java.util.Scanner;

class Employee {
    String empName;
    int empId;
    String empDept;
   
    public Employee(String empName, int empId, String empDept) {
        this.empName = empName;
        this.empId = empId;
        this.empDept = empDept;
    }
   
    public void showDetails() {
        System.out.println("Employee ID: " + empId + " | Name: " + empName + " | Department: " + empDept);
    }
}

public class Lab_session2 {
    public static void main(String[] args) {
        System.out.println("=== Welcome to HR Onboarding ===\n");
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID number: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee's department: ");
        String dept = scanner.nextLine();
       
        Employee employee = new Employee(name, id, dept);
        System.out.println("\n--- Entered Employee Info ---");
        employee.showDetails();
       
        System.out.println("\n--- Example Batch Update ---");
        if (args.length >= 3) {
            Employee newEmployee = new Employee(args[0], Integer.parseInt(args[1]), args[2]);
            newEmployee.showDetails();
        } else {
            System.out.println("Tip: Run with arguments like: java Lab_session2 <name> <id> <department>");
        }
       
        scanner.close();
    }
}


