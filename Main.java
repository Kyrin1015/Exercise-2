import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Please enter a width: ");
    double width = Double.parseDouble(keyboard.nextLine());

    System.out.print("Please enter a length: ");
    double length = Double.parseDouble(keyboard.nextLine());

    Rectangle rect = new Rectangle(width, length);
    rect.info_out();
  }
}