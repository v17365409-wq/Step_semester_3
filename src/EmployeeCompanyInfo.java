public class EmployeeCompanyInfo {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Constructor
    public EmployeeCompanyInfo(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    // Static method
    static void printCompanyInfo() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Count: " + employeeCount);
    }

    public static void main(String[] args) {

        EmployeeCompanyInfo employee1 =
                new EmployeeCompanyInfo("Arun", 40000);

        EmployeeCompanyInfo employee2 =
                new EmployeeCompanyInfo("Priya", 50000);

        EmployeeCompanyInfo employee3 =
                new EmployeeCompanyInfo("Rahul", 45000);

        // Call static method through class name
        EmployeeCompanyInfo.printCompanyInfo();
    }
}
