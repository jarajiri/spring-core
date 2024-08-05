package hello.core.staticEx;

public class Car {
    String name;
    static int count;

    public Car(String name) {
        System.out.println("차량 구입, 이름 : " + name);
        this.name = name;
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + count);
    }
}
