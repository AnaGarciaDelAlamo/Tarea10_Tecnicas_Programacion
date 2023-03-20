package Ejercicio1;

import java.util.Scanner;

public class RaizCuadrada {
    public double calcularRaizCuadrada(double num){
        if (num < 0){
            throw new IllegalArgumentException("El número no puede ser negativo");
        } else {
            return Math.sqrt(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero = sc.nextDouble();

        try{
            double resultado = new RaizCuadrada().calcularRaizCuadrada(numero);
            System.out.println("La raíz cuadrada de " + numero + " es " + resultado);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
