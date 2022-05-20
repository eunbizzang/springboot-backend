package net.javaguides.springboot.lambda;

interface Shape{
    void draw();
}

class Rectangles implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangles class : draw() method");
    }
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square class : draw() method");
    }
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Circle class : draw() method");
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        String str = "hello";

        //Shape rectangle = () -> System.out.println("Rectangles class : draw() method ");
        //rectangle.draw();

        //Shape square = () -> System.out.println("Square class : draw() method");
        //square.draw();

        //Shape circle = () -> System.out.println("Circle class : draw() method");
        //circle.draw();

        print(() -> System.out.println("Rectangles class : draw() method "));
        print(() -> System.out.println("Square class : draw() method"));
        print(() -> System.out.println("Circle class : draw() method"));
    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
