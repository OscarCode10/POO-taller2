package clase1;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Animal {
    //ATRIBUTOS
    public String name;
    public int age;

    //Método u operaciones

    Scanner reading=new Scanner(System.in);

    //public void registerAnimal(){ metodo sin parametros
        //cuerpo método
        //System.out.println("Ingrese el nombre del animal");
        //name=reading.nextLine();   

        //System.out.println("Ingrese la edad del animal");
        //age=reading.nextInt();
    //}
    //método con parametros
    public void registerAnimal(String n, int e){
        //cuerpo método
        name=n;
        age=e;
    }
    public void showAnimal(){
        System.out.println("El nombre de su animal es: "+name+" y su edad es: "+age);
    }
    public int doubleAge(int age){
        int duplicate=age*2;
        return duplicate;
    }
}
