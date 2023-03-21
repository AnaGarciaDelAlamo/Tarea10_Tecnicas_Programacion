package Ejercicio2;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Operacion operacion = new Operacion();
    while(true){
        System.out.println("Introduce un número entero: ");
        int a = sc.nextInt();
        System.out.println("Introduce otro número entero: ");
        int b = sc.nextInt();

        System.out.println("Introduce el operador que quieres usar (+-*/% o s para salir ");
        String operador = sc.next();

        if(operador.equals("s")){
            System.out.println("Adiós");
            break;
        }

        int resultado = 0;
        try{
            switch(operador){
                case "+":
                    resultado = operacion.suma(a, b);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    resultado = operacion.resta(a, b);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case "*":
                    resultado = operacion.multiplicacion(a, b);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case "/":
                    resultado = operacion.division(a, b);
                    System.out.println("El resultado de la división es: " + resultado);
                    if (a%b != 0){
                        System.out.println("El resultado de la división no es exacto");
                    }
                    break;
                case "%":
                    resultado = operacion.modulo(a, b);
                    System.out.println("El resultado del módulo es: " + resultado);
                    break;
                    default:
                        System.out.println("Operador no válido");
            }
        }catch (DesbordaCapacidadException e){
            System.out.println(e.getMessage());
        }

    }


    }


}
