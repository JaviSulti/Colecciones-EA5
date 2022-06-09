package coo.ea5;

import coo.ea5.Servicios.Servicio;
import java.util.Scanner;
import java.util.TreeSet;

public class COOEA5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        Servicio s1 = new Servicio();

        TreeSet<String> listadoPaises = new TreeSet();

        System.out.println("Bienvenida/o al Paisaver. Por favor, lea las instrucciones detenidamente.");
        int i = 0;
        do {
            i++;
            listadoPaises = s1.guardarPaises(i);
            System.out.print("Si desea guardar otro pais, por favor, escriba SI. De lo contrario, indique NO > ");
        } while (teclado.next().equalsIgnoreCase("si"));

        TreeSet <String> listadoAEliminar = new TreeSet();
        
        listadoAEliminar = s1.mostrarConjunto(listadoPaises);
        
        s1.eliminarPais(listadoAEliminar);
        
    }

}
