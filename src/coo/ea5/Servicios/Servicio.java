package coo.ea5.Servicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Servicio {

    TreeSet<String> listadoaux = new TreeSet();

    public TreeSet guardarPaises(int i) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el pais numero " + i + " > ");
        listadoaux.add(teclado.next());

        return listadoaux;

    }

    public TreeSet mostrarConjunto(TreeSet listadoPaises) {
        System.out.print("La lista de paises ingresados y ordenados alfabeticamente es: ");
        for (Object aux : listadoPaises) {
            System.out.print(aux + " ");
        }
        System.out.println("");
        return listadoPaises;
    }

    public void eliminarPais (TreeSet eliminarPais){
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Por favor, ingrese el pais que desee eliminar de la lista > ");
        String paisEliminar = teclado.next();
        
        int tamanio = eliminarPais.size();
        
        Iterator <String> it = eliminarPais.iterator();
        Iterator aux = eliminarPais.iterator();
        while (it.hasNext()) {
            if (it.next().equals(paisEliminar)) {
                it.remove();
                System.out.println("El pais " + paisEliminar + " se ha borrado.");
            }
        }
        if (tamanio == eliminarPais.size()) {
            System.out.println("El pais no se encuentra en la lista.");
        }

        if (tamanio > eliminarPais.size()) {
            System.out.print("La lista resultante es: ");
            for (Object eliminarPai : eliminarPais) {
                System.out.print(eliminarPai + " ");
            }
            System.out.println("");
        }

    }
    
}
