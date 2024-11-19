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

        System.out.println("Dime el primer número");
        double num1 = new Scanner(System.in).nextInt();

        System.out.println("Dime el segundo número");
        double num2 = new Scanner(System.in).nextInt();

        double resultado = 1;

        switch (input){
            case 1 ->{
                resultado = num1 + num2;
            }

            case 2 ->{
                resultado = num1 - num2;
            }
        }
        System.out.println("El resultado de la operación es: " + resultado);
    }
}
