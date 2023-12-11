/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenjava.reto_1_java;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Punto2 {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String contraseña = scanner.nextLine();
        
         if (validarContraseña(contraseña)) {
             System.out.println("contraseña valida ");
         } else {
             System.out.println("contraseña invalida ");

         }
     }

    public static boolean validarContraseña(String contraseña) {
            if (contraseña.length() < 8) {
                    return false;
            } 
        
        boolean mayuscula = false;
        boolean numero = false;
        boolean caracterEspecial = false;
            
        for (char c: contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            } else if (Character.isDigit(c)){
                numero = true;
            }
            else if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' || c == '*') {
                caracterEspecial = true;
           }
        }
        
          return mayuscula && numero && caracterEspecial;
    }
}
