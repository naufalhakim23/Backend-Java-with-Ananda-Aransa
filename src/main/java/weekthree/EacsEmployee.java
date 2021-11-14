package weekthree;

public class EacsEmployee {
    static String[] employeeEacs = {"Siti", "Hikaru", "Farin", "Nita", "Raden", "Dian"};
    static String[] employeeAddress = {"Cihanjuang", "Karawaci", "Cimanggis", "Sleman", "Bukittinggi", "Pejaten"};
    static int[] employeeAge = {21, 23, 22, 20, 24, 19};

    static String [] addEmployeeStrings(int n, String employeeArray[], String string)
    {
        int i;
        String[] employeeArrayNew = new String[n+1];
        for (i = 0; i < n; i++)
        {
            employeeArrayNew[i] = employeeArray[i];
        }
        employeeArrayNew[n] = string;
        return employeeArrayNew;
    }
    static int[] addEmployeeInt(int n, int employeeArray[], int integer)
    {
        int i;
        int[] employeeArrayNew = new int[n+1];
        for (i = 0; i < n; i++)
        {
            employeeArrayNew[i] = employeeArray[i];
        }
        employeeArrayNew[n] = integer;
        return employeeArrayNew;
    }
    public static void main(String[] args) {
        // Checking Table Employee
        for (int i = 0; i < employeeEacs.length; i++) {
            System.out.println("Employee EACS: " + employeeEacs[i]);
            System.out.println("Employee Address: " + employeeAddress[i]);
            System.out.println("Employee Age: " + employeeAge[i]);
            System.out.println("");
        }
        // Adding new employee
        employeeEacs = EacsEmployee.addEmployeeStrings(employeeEacs.length, employeeEacs, "Rizki");
        employeeAddress = EacsEmployee.addEmployeeStrings(employeeAddress.length, employeeAddress, "Cibinong");
        employeeAge = EacsEmployee.addEmployeeInt(employeeAge.length, employeeAge, 25);
        System.out.println("Employee EACS: " + employeeEacs[employeeEacs.length-1]);
        System.out.println("Employee Address: " + employeeAddress[employeeAddress.length-1]);
        System.out.println("Employee Age: " + employeeAge[employeeAge.length-1]);
        System.out.println("");

        // Checking Table Employee after adding new employee
        for (int i = 0; i < employeeEacs.length; i++) {
            System.out.println("Employee EACS: " + employeeEacs[i]);
            System.out.println("Employee Address: " + employeeAddress[i]);
            System.out.println("Employee Age: " + employeeAge[i]);
            System.out.println("");
        }
        
    }

}
