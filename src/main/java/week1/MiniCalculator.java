package week1;
public class MiniCalculator {

    int sum(int number1, int number2) {
        return number1 + number2;
    }
    
    int multiply(int a, int b) {
        return a * b;
    }
    int fibonna(int count) {
        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        return fibonna(count - 1) + fibonna(count - 2);
    }
    int sortDesc(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (sorted[j] < sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += sorted[i];
        }
        return sum;
    }
    int sortAsc(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sorted[i] = arr[i];
        }
        return 0;
    }
    public boolean isSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        return false;
    }
    public boolean isMultiply(int a, int b, int c) {
        if (a * b == c) {
            return true;
        }
        return false;
    }
    public boolean isFibonacci(int a, int b, int c) {
        if (fibonna(a) + fibonna(b) == c) {
            return true;
        }
        return false;
    }
    public boolean isSortDesc(int[] arr, int a, int b, int c) {
        if (sortDesc(arr) == a + b + c) {
            return true;
        }
        return false;
    }
    public boolean isSortAsc(int[] arr, int a, int b, int c) {
        if (sortAsc(arr) == a + b + c) {
            return true;
        }
        return false;
    }
    public boolean isTriplePythagoras(int num1, int num2, int num3) {
        int temp = 0;
        int[] array = {num1, num2, num3};
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        return array[0] * array[0] + array[1] * array[1] == array[2] * array[2] ? true:false;
    }


    public static void main(String[] args) {
        MiniCalculator calculator = new MiniCalculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.fibonna(5));

        Employee employee = new Employee();
        employee.jurusan = "Teknik Informatika";

        employee.setAge(17);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(calculator.sortDesc(arr));
        System.out.println(calculator.sortAsc(arr));
        System.out.println("Apakah 1+2 =3 ?" + calculator.isSum(1, 2, 3));
        System.out.println("Apakah 1*2 =3 ?" + calculator.isMultiply(1, 2, 5));
        System.out.println("Apakah Fibonacci 1 dan 2 = 2 ?" + calculator.isFibonacci(1, 2, 2));

        System.out.println("Apakah 3,4,5 adalah triple pythagoras ?" + calculator.isTriplePythagoras(3, 5, 7));
    }
}