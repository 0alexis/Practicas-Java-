
import java.util.Scanner;

public class Name{

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese su nombre: ");

        String nombre = sc.next();

        System.out.println("Ingrese su edad: ");

        int edad = sc.nextInt();

        System.out.println("Su nombre es: " + nombre + " y su edad es: " + edad);

    }//cierra método main

}