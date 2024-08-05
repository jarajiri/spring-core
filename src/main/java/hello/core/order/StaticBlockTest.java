package hello.core.order;

class SBTest{
    static int A ;
    static {
        test();
        A++;
        System.out.println("static block  : " + A);
    }

    {
        instanceMethod();
        A++;
        System.out.println("instance block  : " + A);
    }

    static void test() {
        A++;
        System.out.println("static method  : " + A);
    }

    public SBTest() {
        instanceMethod();
        A++;
        System.out.println("contsructor  : " + A);
    }

    private void instanceMethod() {
        A++;
        System.out.println("instance method : " + A);
    }
}

public class StaticBlockTest {
    public static void main(String[] args) {

        SBTest.test();
        SBTest a = new SBTest();
        SBTest b = new SBTest();
        /**
         * 출력은 다음과 같다
         * static method  : 1
         * static block  : 2
         * static method  : 3
         * instance method : 4
         * instance block  : 5
         * instance method : 6
         * contsructor  : 7
         * instance method : 8
         * instance block  : 9
         * instance method : 10
         * contsructor  : 11
         */
    }
}