/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.examenjava.reto_1_java;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto1 {

    public static void main(String[] args) {
        
        Scanner  scanner = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
         
        int n =  scanner.nextInt();
        scanner.close();
        
        int  suma = 0;
        
        for (int i =1; i < n ;i++) {
            if (i % 3 ==  0 || i % 5 == 0 ) {
                if (i % 3 !=0 || i % 5 != 0 ) {
                    suma += i ;
                }
            }
        }
        System.out.println("la suma de lo multiplos de 3 y 5  menores que : " + n + " es : " +suma);
    }
}
