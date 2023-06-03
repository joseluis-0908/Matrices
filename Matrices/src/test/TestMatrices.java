package test;

import domain.Persona;

public class TestMatrices {
    
    public static void main(String[] args) {
        // vamos a crear un arreglo uno que controla las filas o renglones y oto las columnas
        int edades[][] = new int[3][2];
        System.out.println(" == " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        System.out.println(" ===== " + edades[0][0]);
        System.out.println(" ===== " + edades[0][1]);
        System.out.println(" ===== " + edades[1][0]);
        System.out.println(" ===== " + edades[1][1]);

        //Se itera cada uno de los elementos utilizando un ciclo for anidado
        // Un ciclo for es necesario ya que se deben iterar cada una de las filas o renglones y lo mismo las columnas
        for (int ren = 0; ren < edades.length; ren++) {
            //utilizo el contador de ren para que nos regrese el largo de columnas que tiene el renglo que se esta trabajando
            //.lengh nos dara a conocer el largo de columnas del renglon que se esta trabajando
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println(" === " + ren + "-" + col + " : " + edades[ren][col]);
                
            }
            
        }
        String frutas[][] = {{"Naranja", "limon"}, {"Pera", "mora"}, {"aguacate", "Manzana"}};
        imprimir(frutas);// para frutas
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("pedro");
        personas[0][1] = new Persona("Karla");   
        imprimir(personas);//para personas
    }

    public static void imprimir(Object matriz[][]) {
        for (int ren1 = 0; ren1 < matriz.length; ren1++) {
            for (int col1 = 0; col1 < matriz[ren1].length; col1++) {
                System.out.println(" ======>>> " + ren1 + "->" + col1 + ": " + matriz[ren1][col1]);
                
            }
            
        }
        
    }
    
}
