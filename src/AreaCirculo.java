public class AreaCirculo {
    public static double Area(double r) {

        final double PI = Math.PI;

       double area = PI * r * r;

       return area;
    }

    public static void main(String[] args) {
        double r = 5;
        double area = Area(r);


        System.out.println("El area del circulo: "+ r + "es: "+ area);
        System.out.println("PESOS A DOLARES: " + converToDolar(5000, "MXN"));

    }



    public static double converToDolar(double peso, String moneda){
        switch (moneda){
            case "MXN":
                double m = peso * 0.052;

                break;

            case "COP":
                double c = peso * 0.00031;
                break;
        }
        return peso;

    }
}
