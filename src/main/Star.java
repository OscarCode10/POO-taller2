package main;

import health.Person;

public class Star {
    public static void main(String[] args) {
        Person person=new Person();

        person.requestData();
        person.showPerson();
        //person.calculateImc();
        person.mayoressAge();
        
        String weighString=person.calculateImc(null);
        if (weighString.equals("PESOBAJO")) {
            System.out.println("Su peso es bajo");
        }
        else if(weighString.equals("PESOIDEAL")){
            System.out.println("Su peso es el ideal");
        }
        else if(weighString.equals("SOBREPRESO")){
            System.out.println("Su peso es alto");
        }
    }
}
