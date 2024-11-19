import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        // MENU
        System.out.println("""
                ¿Que operación quiere realizar?
                1) Suma
                2) Resta
                3) Multiplicación
                4) División
                """);

        int input = new Scanner(System.in).nextInt();

        System.out.println("Dime el primer numero");
        double num1 = new Scanner(System.in).nextInt();

        System.out.println("Dime el segundo numemro");
        double num2 = new Scanner(System.in).nextInt();

        double resultado = 1;


    }
}
