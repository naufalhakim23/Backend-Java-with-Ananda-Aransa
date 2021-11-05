import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public @Data class EmployeeLombok {
    private int id;
    private String name;
    private int age;
    private int monthlySalary;
    private String department;
    public static void main(String[] args) {
        EmployeeLombok emp = new EmployeeLombok();
        emp.setId(1);
        emp.setName("John");
        emp.setAge(25);
        emp.setMonthlySalary(5000);
        emp.setDepartment("IT");
        System.out.println("Employee Details: ");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Monthly Salary: " + emp.getMonthlySalary());
        System.out.println("Department: " + emp.getDepartment());
    }
}