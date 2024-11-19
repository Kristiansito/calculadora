import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        System.out.println("Dime el primer numero");
        double num1 = new Scanner(System.in).nextInt();

        System.out.println("Dime el segundo numemro");
        double num2 = new Scanner(System.in).nextInt();

        System.out.println("Has introducido los numeros " + num1 + " y " + num2);

        double resultado = 1;
    }
}
