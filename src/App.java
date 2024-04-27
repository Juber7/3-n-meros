import java.util.Scanner;
import java.lang.Math.*;

public class App {
    // Juber Josué Sánchez Guerrero #carnet: 2024-1346U
    public static int num1 = 0;
    public static int num2 = 0;
    public static int num3 = 0;

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número");
            num2 = leer.nextInt();
            System.out.println("Ingrese el tercer número");
            num3 = leer.nextInt();

            if (num1 != num2 && num2 != num3 && num1 != num3) {
                int min = Math.min(Math.min(num1, num2), num3) + Math.min(Math.max(num1, num2), num3);
                System.out.println("La suma entre los dos más pequeños da como resultado: " + min);

                int diferencia = Math.max(Math.max(num1, num2), num3) - Math.min(Math.max(num1, num2), num3);
                System.out.println("La diferencia entre los dos números más grandes es: " + diferencia);

                int mayor = Math.max(Math.max(num1, num2), num3);
                System.out.println("El número mayor entre los tres es: " + mayor);
            }
            else
            {
                System.out.println("Cada número debe ser diferente");
            }

        } catch (Exception e) {
            System.out.println("Ingrese un número entero");
        }

    }
}
