package week1;
public class test {
    public int devide(int a, int b) {
        int result = 0;
        try {
            return a / b;
        } catch (Exception e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.devide(10, 2));
        System.out.println(t.devide(10, 0));
    }
}
