package me.circle.practice.geometry;

public class TestCircle {
    public static void testConstructor() {
        System.out.println("Тест 1 : Конструктор с допустимым радиусом");
        try {
            Circle circle = new Circle(5);
            System.out.println("Тест пройден");
        }catch (Exception e) {
            System.out.println("Тест не пройден : " + e.getMessage());
        }
    }
    public static void testSetRadius() {
        System.out.println("Тест 2 : SetRadius с допустимым значением");
        try{
            Circle circle = new Circle(2);
            circle.setRadius(4);
            System.out.println("Тест пройден");
        }catch (Exception e){
            System.out.println("Тест не пройден : " + e.getMessage());
        }
    }
    public static void testGetArea() {
        System.out.println("Тест 3 : GetArea с допустимым значением");
        try {
            Circle circle = new Circle(5);
            if(circle.getArea() != 78.5398163375) {
                System.out.println("Тест не пройден");
            }else {
                System.out.println("Тест пройден");
            }
        }catch (Exception e) {
            System.out.println("Тест не пройден :" + e.getMessage());

        }
    }
}
