package Ejercicio2;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operacion operacion = new Operacion();

    int opcion = sc.nextInt();

        try{
            System.out.println("Ingresa un número entero: ");
            int a = sc.nextInt();
            System.out.println("Ingresa otro número entero: ");
            int b = sc.nextInt();

            System.out.println("Elige una opción: ");
            System.out.println("0. Salir");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            switch(opcion){
                case 0:
                    System.out.println("Adiós");
                    return;
                case 1:
                    int suma = operacion.suma(a, b);
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = operacion.resta(a, b);
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = operacion.multiplicacion(a, b);
                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    int division = operacion.division(a, b);
                    System.out.println("La división es: " + division);
                    break;
            }

        }catch(DesbordaCapacidadException e){
            System.out.println(e.getMessage());
        }

    }
}
