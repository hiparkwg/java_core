package clazz;

public class Car {
    String color; // 색상
    int displacement; // 배기량
    int doors; //문짝 수
    String handle; // 운전대 방향
    int personnel; // 승차인원
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "black";

        Car yourCar = new Car();
        yourCar.color = "red";

        System.out.println("내차 색상 : " + myCar.color);
        System.out.println("당신차 색상 : " + yourCar.color);
    }
}
