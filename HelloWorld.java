import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double a = input.nextDouble();
    double b = input.nextDouble();

    System.out.println("1. Add\n2. Subtract\n3. Divide\n4. Multiply");
    int menu = input.nextInt();

    switch(menu) {
      case(1):
        System.out.println("Sum = " + (a + b));
        break;
      case(2):
        System.out.println("Sum = " + (a - b));
        break;
      case(3):
        System.out.println("Sum = " + (a / b));
      case(4):
        System.out.println("Sum = " + (a * b));
    }
  }
}

