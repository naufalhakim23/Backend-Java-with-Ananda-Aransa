package weekthree;

public class EacsEmployee {
    static String[] employeeEacs = {"Siti", "Hikaru", "Farin", "Nita", "Raden", "Dian"};
    static String[] employeeAddress = {"Cihanjuang", "Karawaci", "Cimanggis", "Sleman", "Bukittinggi", "Pejaten"};
    static int[] employeeAge = {21, 23, 22, 20, 24, 19};

    // Adding new string to array (Employee EACS) and (Employee Address)
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
    // Adding new int to array (Employee Age)
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
    
    // Adding find array index
    static int findEmployeeIndex(String[] employeeArray, String string)
    {
        int i;
        for (i = 0; i < employeeArray.length; i++)
        {
            if (employeeArray[i].equals(string))
            {
                return i;
            }
        }
        return -1;
    }

    //Updating Array String
    static String[] updateEmployeeEacs(int n, String[] employeeArray, String string, int index)
    {
        int i;
        String[] employeeArrayNew = new String[n];
        for (i = 0; i < n; i++)
        {
            if (i == index)
            {
                employeeArrayNew[i] = string;
            }
            else
            {
                employeeArrayNew[i] = employeeArray[i];
            }
        }
        return employeeArrayNew;
    }
    //Updating Array Int
    static int[] updateEmployeeAge(int n, int[] employeeArray, int integer, int index)
    {
        int i;
        int[] employeeArrayNew = new int[n];
        for (i = 0; i < n; i++)
        {
            if (i == index)
            {
                employeeArrayNew[i] = integer;
            }
            else
            {
                employeeArrayNew[i] = employeeArray[i];
            }
        }
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
        System.out.println("Adding Employee Rizki");
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
        //Searching Rizki and Hikaru in Array
        System.out.println(""+EacsEmployee.findEmployeeIndex(employeeEacs, "Rizki"));
        System.out.println(""+EacsEmployee.findEmployeeIndex(employeeEacs, "Hikaru"));

        // Updating Siti with John
        System.out.println("Updating Siti with John");
        int indexed = EacsEmployee.findEmployeeIndex(employeeEacs, "Siti");
        employeeEacs = EacsEmployee.updateEmployeeEacs(employeeEacs.length, employeeEacs, "John", indexed);
        employeeAddress = EacsEmployee.updateEmployeeEacs(employeeAddress.length, employeeAddress, "New York", indexed);
        employeeAge = EacsEmployee.updateEmployeeAge(employeeAge.length, employeeAge, 29, indexed);
        System.out.println("Employee EACS: " + employeeEacs[indexed]);
        System.out.println("Employee Address: " + employeeAddress[indexed]);
        System.out.println("Employee Age: " + employeeAge[indexed]);
        System.out.println("");
        
        // Checking Table Employee after updating Siti with John
        for (int i = 0; i < employeeEacs.length; i++) {
            System.out.println("Employee EACS: " + employeeEacs[i]);
            System.out.println("Employee Address: " + employeeAddress[i]);
            System.out.println("Employee Age: " + employeeAge[i]);
            System.out.println("");
        }
        
    }

}
