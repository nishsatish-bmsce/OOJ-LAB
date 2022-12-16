import java.util.Scanner;
abstract class Shape {
  double a, b;
  abstract void printArea();
}

class Rectangle extends Shape {
  void getData(double x, double y) {
    a = x;
    b = y;
  }

  void printArea() {
    double x = a * b;
    System.out.println("\n Area of the rectangle is " + x);
  }

}

class Triangle extends Shape {
  void getData(double x, double y) {
    a = x;
    b = y;
  }

  void printArea() {
    double x = 0.5 * a * b;
    System.out.println("\n Area of the triangle is " + x);
  }
}

class Circle extends Shape {
  void getData(double x) {
    a = x;
    b=0;
  }

  void printArea() {
    System.out.println("Area of the circle is " + (3.14 * a * a));
  }
}

class Shapes {
  public static void main(String args[]) {
    Triangle t = new Triangle();
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    Scanner sc = new Scanner(System.in);

    double l, b, radius;

    System.out.println("1. Rectangle 2. Triangle 3. Circle");
    int ch = sc.nextInt();

    switch (ch) {
    case 1:
      System.out.println("Enter the length and breadth of the rectangle");
      l = sc.nextDouble();
      b = sc.nextDouble();
      r.getData(l, b);
      r.printArea();
      break;

    case 2:
      System.out.println("Enter the breadth and height of the triangle");
      l = sc.nextDouble();
      b = sc.nextDouble();
      t.getData(l, b);
      t.printArea();
      break;

    case 3:
      System.out.println("Enter the radius of the circle");
      radius = sc.nextDouble();
      c.getData(radius);
      c.printArea();
      break;

    default:
      System.out.println("No choice detected");
      break;
    }
  }

}