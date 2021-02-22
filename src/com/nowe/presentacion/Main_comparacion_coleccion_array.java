/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nowe.presentacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

/**
 *
 * @author agarm
 */
public class Main_comparacion_coleccion_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir un array de números de 5 posiciones
        // Array: tipo_dato nombre_array[];
        // nombre_array = new tipo_dato[tamanio];
        int numeros[];
        numeros = new int[5];
        // Insertar datos en el array
        numeros[0] = 4;
        numeros[1] = 7;
        numeros[2] = 9;
        numeros[3] = 8;
        numeros[4] = 2;
        System.out.println("Array\nEl array con los números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        //También se puede hacer: System.out.println(Arrays.toString(numeros)); en vez de con un for
        
        //Definir un Set de numeros añadiendo 5 números
        Set numerosS = new HashSet();
        numerosS.add(23);
        numerosS.add(34);
        numerosS.add(5);
        numerosS.add(16);
        numerosS.add(98);
        System.out.println("\nSet\nColección de números: " + numerosS);
        
        //Definir un List de numeros añadiento 5 números-usar índices
        List numerosL = new ArrayList();
        numerosL.add(0, 5);
        numerosL.add(1, 12);
        numerosL.add(2, 24);
        numerosL.add(3, 84);
        numerosL.add(4, 97);
        System.out.println("\nList\nColección de números: " + numerosL);
        
//        Profesora:
//        public static void main(String[] args) {
//        // Definir un array de numeros de 5 posiciones
//        // insertar datos en el array
//        int[] array = new int[5];
//        for (int i = 0; i < 5; i++) {
//            array[i] = i*5;
//        }
//        System.out.println("Elementos del Array " + Arrays.toString(array));
//        
//        //Definir un Set de numeros añadiendo 5 números
//        Set s1 = new HashSet();
//        for (int i = 0; i < 5; i++) {
//            s1.add(i*5);
//        }
//        System.out.println("Elementos del set " + s1);
//        
//        //Denir un List de numeros añadiendo 5 números - indices 
//        List l1 = new ArrayList();
//        for (int i = 0; i < 5; i++) {
//            l1.add(i, i*5);
//        }
//        System.out.println("Elementos del List " + l1);
//    }
//        
   }
    
}
