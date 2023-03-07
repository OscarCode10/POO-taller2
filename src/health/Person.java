package health;

import java.util.Scanner;

public class Person {
    String typeDoc;
    int document;
    String name;
    String surname;
    double weight;
    double height;
    int age;
    String gender;

    Scanner reading=new Scanner(System.in);

    public void requestData(){
        System.out.println("Ingrese su tipo de documento");
        typeDoc=reading.nextLine();
        System.out.println("Ingrese su numero de documento");
        document=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su nombre");
        name=reading.nextLine();
        System.out.println("Ingrese su apellido");
        surname=reading.nextLine();
        System.out.println("Ingrese su peso en kilogramos");
        weight=reading.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        height=reading.nextDouble();
        System.out.println("Ingrese su edad");
        age=reading.nextInt();
        reading.nextLine();
        System.out.println("Ingrese su sexo");
        gender=reading.nextLine();
    }

    public void showPerson() {
        System.out.println("Su tipo de documento es: "+typeDoc);
        System.out.println("Su numero de documento es: "+document);
        System.out.println("Su nombre es: "+name);
        System.out.println("Su apellido es: "+surname);
        System.out.println("Su peso es: "+weight+"kg");
        System.out.println("Su altura es: "+height+"m");
        System.out.println("Su edad es: "+age+"años");
        System.out.println("Su sexo es: "+gender);
    }
    
    //public void calculateImc() {
        //System.out.println("Este es su Imc:");
        //double height2= Math.pow(height,2);
        //double weightNow= weight/height2;
        //System.out.println(weightNow);

        //if (weightNow<20) {
            //System.out.println("El peso esta por debajo de lo ideal");
        //}
        //else if(weightNow>=20 && weightNow<=25){
            //System.out.println("El peso es ideal");
        //}
        //else if(weightNow>25){
            //System.out.println("Usted tiene sobrepeso");
        //}
    //} 
    public void mayoressAge(){
        System.out.println("Su edad es: "+age);
        if (age<18) {
            System.out.println("por lo tanto, usted es menor de edad");
        } else {
            System.out.println("por lo tanto, usted es mayor de edad");
        }
    }
    public String calculateImc(String weightString) {
        weightString="";
        double height2= Math.pow(height,2);
        double weightNow= weight/height2;
        if (weightNow<20) {
            weightString="PESOBAJO";
            return weightString;
        }
        else if(weightNow>=20 && weightNow<=25){
            weightString="PESOIDEAL";
            return weightString;
        }
        else if(weightNow>25){
            weightString="SOBREPESO";
            return weightString;
        }
        System.out.println(weightString);
        return weightString;
        
    }
}
