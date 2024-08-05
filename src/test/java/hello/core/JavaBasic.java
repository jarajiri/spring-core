package hello.core;

public class JavaBasic {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        try {
            double divide = divide(a, b); // 이 라인에서 ArithmeticException 발생
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누면 되겠냐?");
        }

        String nan = "NaN";
        double doubleNan = Double.parseDouble(nan);
        System.out.println(doubleNan + 100.0);

    }

    private static int divide(int i, int j) throws ArithmeticException {
        return i / j; // 이 라인에서 ArithmeticException 발생
    }
}
