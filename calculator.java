import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Variabel a = ");
        float a = input.nextFloat();
        System.out.print("Variabel b = ");
        float b = input.nextFloat();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}