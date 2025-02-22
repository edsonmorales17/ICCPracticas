/*Clase hecha por Edson Jair Morales Hernandez
318076546
*/
import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       Scanner entrada1 = new Scanner(System.in);
       Scanner entrada2 = new Scanner(System.in);
       double a = 0;
       double b = 0;
       double r = 0;
       System.out.println("CALCULADORA");
       System.out.println("Bienvenido :) Este programa simula una calculadora básica");
       System.out.println("Teclea la opcion que deseas ingresar: ");
       System.out.println("1. Suma");
       System.out.println("2. Resta ");
       System.out.println("3. Multiplicación");
       System.out.println("4. División");
       int opcion = entrada.nextInt();
       
       if (opcion == 1) {
        System.out.println("Ingresa el primer valor: ");
        a = entrada1.nextDouble();
        System.out.println("Ingresa el segundo valor: ");
        b = entrada2.nextDouble();
        r = a + b;
        System.out.println("El resultado es: " + r); 
        } if(opcion == 2) {
            System.out.println("Ingresa el primer valor: ");
            a = entrada1.nextDouble();
            System.out.println("Ingresa el segundo valor: ");
            b = entrada2.nextDouble();
            r = a - b;
            System.out.println("El resultado es: " + r);
            } if (opcion == 3) {
                System.out.println("Ingresa el primer valor: ");
                a = entrada1.nextDouble();
                System.out.println("Ingresa el segundo valor: ");
                b = entrada2.nextDouble();
                r = a * b;
                System.out.println("El resultado es: " + r);
            } if (opcion == 4) {
                System.out.println("Ingresa el primer valor: ");
                a = entrada1.nextDouble();
                System.out.println("Ingresa el segundo valor: ");
                b = entrada2.nextDouble();
                if (b == 0) {
                    System.out.println("Error: No existe la división entre cero :(");
                    }else{
                        r = a / b;
                        System.out.println("El resultado es: " + r);
                    }
                } else {
                    System.out.println("Error: ingresa un dato valido");
                }

    }
}