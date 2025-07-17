package exceptionTest;

public class ExceptionThrowTest {
    public static void divid(int a, int b) throws  ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("0으로 나누면 안되요!");
        }
        int c = a / b;
    }
    public static void main (String[] args) {


        int a = 10;
        int b = 0;
        try {

            divid(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
