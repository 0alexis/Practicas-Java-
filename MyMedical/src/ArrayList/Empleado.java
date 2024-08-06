package ArrayList;

public class Empleado {
    private String name;
    private int age;
    private double salary;

    public Empleado(String name, int age, double salary){

        this.name = name;
        this.age = age;
        this.salary = salary;


    }

    public String DameDato() {
       return  "el nombre del empleado es "+ name + " su edad es " + age + " con un salario de " + salary;
    }

}
