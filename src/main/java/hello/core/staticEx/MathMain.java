package hello.core.staticEx;

public class MathMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int min = MathArrayUtils.min(arr);
        int max = MathArrayUtils.max(arr);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
