/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter x and y"); 
        calculadora.x = Double.parseDouble(myObj.nextLine());
        calculadora.y = Double.parseDouble(myObj.nextLine());
        
        System.out.println("Enter num1 and num2"); 
        var num1 = Double.parseDouble(myObj.nextLine());
        var num2 = Double.parseDouble(myObj.nextLine());
        
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumero(num1, num2);
    }
    
    public static double getDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (Exception ex) {
            // qualquer coisa
            return -1;
        }
    }
}
