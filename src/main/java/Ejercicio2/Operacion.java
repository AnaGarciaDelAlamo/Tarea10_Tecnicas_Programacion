package Ejercicio2;

public class Operacion {

    public int suma(int a, int b) throws DesbordaCapacidadException{
        long resultado = (long)a + (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE){
            throw new DesbordaCapacidadException("El resultado de la suma es demasiado grande");
        } else {
            return (int)resultado;
        }
    }

    public int resta(int a, int b) throws DesbordaCapacidadException{
        long resultado = (long)a - (long)b;
        if (resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE){
            throw new DesbordaCapacidadException("El resultado de la resta es demasiado grande");
        } else {
            return (int)resultado;
        }
    }

    public int multiplicacion(int a, int b) throws DesbordaCapacidadException{
        long resultado = (long)a * (long)b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE){
            throw new DesbordaCapacidadException("El resultado de la multiplicación es demasiado grande");
        } else {
            return (int)resultado;
        }
    }

    public int division(int a, int b) throws DesbordaCapacidadException{
        long resultado = (long)a / (long)b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE){
            throw new DesbordaCapacidadException("El resultado de la división es demasiado grande");
        } else {
            return (int)resultado;
        }

    }


}
