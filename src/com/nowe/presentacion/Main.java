/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author agarm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tenemos una Interface que se llama set y otra que se llama list
        //Vamos a crear un set
        //set nombreobjeto = new HashSet;
        Set coleccionSinOrdenSinDuplicados = new HashSet();
        coleccionSinOrdenSinDuplicados.add("Lunes");
        coleccionSinOrdenSinDuplicados.add(2);
        coleccionSinOrdenSinDuplicados.add("Miercoles");
        System.out.println("¿Tiene el elemento Lunes? " + coleccionSinOrdenSinDuplicados.contains("Lunes"));
        System.out.println("¿Tiene el elemento Lunes? " + coleccionSinOrdenSinDuplicados.contains("Martes"));
        System.out.println("¿Cuántos elementos hay en la colección? " + coleccionSinOrdenSinDuplicados.size());
        System.out.println("¿La colección está vacía? " + coleccionSinOrdenSinDuplicados.isEmpty());
        coleccionSinOrdenSinDuplicados.remove("Lunes");
        System.out.println("Elementos de la colección " + coleccionSinOrdenSinDuplicados);
        
        //Vamos aprobar el método contains con collection
        //Creamos otra colección de tipo set
        Set s1 = new HashSet();
        s1.add("Miercoles");
        s1.add(2);
        s1.add("Sabado");
        s1.add("Sabado");
        //No va a poner dos sábados
        //¿Todos los elementos de coleccionSinOrdenSinDuplicados están en s1?:
        System.out.println("¿Contiene los elementos del set coleccionSinOrdenSinDuplicados? " + s1.containsAll(coleccionSinOrdenSinDuplicados));
        System.out.println("Elementos del SET " + s1);
        s1.remove(2);
        System.out.println("¿Contiene los elementos del set coleccionSinOrdenSinDuplicados? " + s1.containsAll(coleccionSinOrdenSinDuplicados));
        System.out.println("Elementos del SET " + s1);
        
        //Voy a borrar los elementos de la coleccion
        coleccionSinOrdenSinDuplicados.clear();
        System.out.println("Elementos de la colección " + coleccionSinOrdenSinDuplicados);
        
        //Coleccion List
        //Vemos los métodos que no tenemos en el set: el set, get, indexof
        System.out.println("-------Array List ------");
        List l1 =new ArrayList();
        l1.add("Lunes");
        l1.add("Miercoles");
        System.out.println("Elementos de la colección " + l1);
        l1.set(1, "Martes"); //en la posición 1 quiero Martes y machaca lo que había en esa posicion que era Miércoles. Con add no lo elimina
        System.out.println("Elementos de la colección " + l1);
        System.out.println("Elemento 1 de la colección " + l1.get(1));
        System.out.println("Obtener el contenido de la posición del elemento Martes ->  " + l1.indexOf("Martes"));
        l1.addAll(s1); //añadimos miércoles y sábado de s1 a l1
        System.out.println("Elementos de la colección " + l1);
        //añadir en una determinada posición
        l1.add(3, "Jueves");
        System.out.println("Elementos de la colección " + l1);
        System.out.println("Número de elementos -> " + l1.size());
        l1.remove("Sabado");
        System.out.println("Elementos de la colección " + l1);
        
        
    }
    
}
