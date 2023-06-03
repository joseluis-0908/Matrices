package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("juan");
        personas[1] = new Persona("carlos");
        System.out.println("personas 0 " + personas[0]);
        System.out.println("personas 0 " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println(" personas " + i + " == " + personas[i]);
        }
        //sintaxis resumida otra forma para crear arreglos
        String frutas[] = {"Naranja", "Pera", "Banano"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(" El numero de elemento es " + frutas[i]);

        }

    }

}
