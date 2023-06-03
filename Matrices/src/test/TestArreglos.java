package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[]/*lado izqueiro declaro la variable*/ = new int[3];/*lado derecho se esta instanciando un objeto de tipo arreglo*/
        System.out.println("===" + edades);

        //variable para acceder al valor del elemento 0 del arreglo
        edades[0] = 10;
        System.out.println(" === " + edades[0]);
        /* //acceder a los otros valores de los elementos del arreglo
        edades [1] = 20;
        System.out.println(" === " + edades[1]);
        
        edades [2] = 30;
        System.out.println(" === " + edades[2]);*/
       
        for (int i = 0; i < edades.length;i++){
        System.out.println(" Edades del elementos " + i + " : " + edades[i]);

        }
    }
}
