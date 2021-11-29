import java.math.*;

public class Rectangle {
  public double width;
  public double length;

  public Rectangle(double w, double l) {
    width = w;
    length = l;
  }

  private double area() {
    return length * width;
  }

  private double perimiter() {
    return length * 2 + width * 2;
  }

  private double diagonal() {
    return Math.sqrt(length*length + width*width);
  }

  public void info_out() {
    System.out.println("Rectangle's Area: " + area());
    System.out.println("Rectangle's Perimiter: " + perimiter());
    System.out.println("Rectangle's diagonal: " + diagonal());
  }
}