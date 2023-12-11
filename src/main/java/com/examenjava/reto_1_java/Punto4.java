/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenjava.reto_1_java;

/**
 *
 * @author user
 */

// este codigo en java es la serie fibonacci 
// dentro del metodo main, declaramos las variables "a" y "b" e 
// inicializamos "a" como 0 y "b" como 1, luego, usamos un bucle "for" para 
// iterar 10 veces en cada iteracion imprimimos el valor de "a" y luego
// actualizamos los valores de "a" y "b" para el siguiente numero en la
// secuencia 

public class Punto4 {
        public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(a);
            int valor = a;
            a = b;
            b = valor + b;
        }
    }
}
