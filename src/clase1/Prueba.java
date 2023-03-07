package clase1;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) throws Exception {
        Animal guacamaya=new Animal();
        Movie titanic=new Movie();
        
        Scanner reading=new Scanner(System.in);

        System.out.println("Ingrese el nombre del animal");
        String name=reading.nextLine();
        System.out.println("Ingrese la edad de del animal");
        int age=reading.nextInt();

        guacamaya.registerAnimal(name, age);//Invocar o llamar un metodo
        guacamaya.showAnimal();

        int duplicate=guacamaya.doubleAge(age);
        System.out.println("La edad dublicada del animal es: "+duplicate);

        reading.close();
    }    
}
