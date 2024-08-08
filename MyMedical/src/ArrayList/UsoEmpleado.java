package ArrayList;

import java.util.ArrayList;

public class UsoEmpleado {
    public static void main(String[] args) {

        /*
        Empleado ListaEmpleados[] = new Empleado[3];
        //uso de Array para manejar datos, lo cual mejoraremos con el uso de arraylist
        ListaEmpleados[0] = new Empleado("brayan", 23, 1500);
        ListaEmpleados[1] = new Empleado("jader", 22, 500);
        ListaEmpleados[2] = new Empleado("camila", 42, 3500);
        */


        ArrayList<Empleado> ListaEmpleados = new ArrayList<Empleado>();
        // seria la creacion de un arraylis,
        // la clase empleado es donde estan los tipos de datos y lista empleados el metodo para imprimir

        ListaEmpleados.ensureCapacity(20); //sirve para darle un tam al arraylist y consumir menos memoria

        //la manera de agregar datos al arraylist donde su tope es de 10 dts pero se pueden agregar mas

        ListaEmpleados.add(new Empleado("brayan", 23, 1500));
        ListaEmpleados.add(new Empleado("Andres", 21, 2200));

        //metodo para reemplazar un array
       // ListaEmpleados.set(0, new Empleado("camilo", 23, 3500));

        //metodo para agregar un dato en cierto lugar
        ListaEmpleados.add(1, new Empleado("emma", 23, 4500));

        //ListaEmpleados.set(3, new Empleado("camilo", 45, 2200));


        //cortar el exceso de mem cuando sobran espacios de los previstos
        ListaEmpleados.trimToSize();

        //size se usa para saber la cantidad de datos
        System.out.println(ListaEmpleados.size());


        //ciclo for para imprimir los empleados
        // for (Empleado a : ListaEmpleados){
        //     System.out.println(a.DameDato());
        // }


        //ciclo for i para imprimir datos desde principio a fin
        for (int i = 0; i < ListaEmpleados.size(); i++) {
            Empleado e = ListaEmpleados.get(i);{
                System.out.println(e.DameDato());
            }
        }


    }
}
