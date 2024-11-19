import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int input = 1;

        while (input != 5) {
            System.out.println("Dime el primer número");
            double num1 = new Scanner(System.in).nextInt();

            System.out.println("Dime el segundo número");
            double num2 = new Scanner(System.in).nextInt();

            // MENU
            System.out.println("""
                    ¿Que operación quiere realizar?
                    1) Suma
                    2) Resta
                    3) Multiplicación
                    4) División
                    5) Salir
                    """);

            input = new Scanner(System.in).nextInt();

            double resultado = 0;

            switch (input) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> resultado = num1 / num2;
            }
            String respuesta = (input == 5) ? "Calculadora apagada" : "El resultado de la operación es:\n" + resultado;
            System.out.println(respuesta+"\n\nPulse cualquier tecla para continuar...");
            new Scanner(System.in).nextLine();
        }
    }
}
