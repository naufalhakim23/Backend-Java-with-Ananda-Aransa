package week1;
public class Employee {
    // Declare private variables
    private int id;
    private String name;
    private int age;
    private int monthlySalary;
    private String department;
    String jurusan;

    // Class, object dan method
    // Declare public setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMonthlySalary(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    
    // Declear public getter
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getMonthlySalary(){
        return this.monthlySalary;
    }
    public String getDepartment(){
        return this.department;
    }
    public static void main(String[] args) {
        Employee john = new Employee();
        john.setId(1);
        john.setName("John");
        john.setAge(25);
        john.setMonthlySalary(5000);
        john.setDepartment("IT");
        
        System.out.println("Employee ID: " + john.getId());
        System.out.println("Employee Name: " + john.getName());
        System.out.println("Employee Age: " + john.getAge());
        System.out.println("Employee Monthly Salary: " + john.getMonthlySalary());
        System.out.println("Employee Department: " + john.getDepartment());
    }

}