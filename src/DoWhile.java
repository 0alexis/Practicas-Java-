import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
   int response = 0;

        do{
            System.out.println("selecciona el numero de la opcion deseada");
            System.out.println("1. movies");
            System.out.println("2. series");
            System.out.println("3. salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Gracias por visitar");
                    break;

                case 1:
                    System.out.println("Movies");
                    break;

                case 2:
                    System.out.println("Series");
                    break;

                default:
                    System.out.println("Seleciona una opcion correcta");

            }

        }

        while (response != 0);
        System.out.println("TERMINO EL PROGRAMA");
    }

}
