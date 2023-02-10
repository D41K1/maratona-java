/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class ExercicioOperadores {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String salario;
            
            System.out.println("Salario anual: ");
            salario =  myObj.nextLine();
            
            double salarioDouble = getDouble(salario);
            //or double salarioDouble = Double.parseDouble(salario);
            
            if (salarioDouble <= 34000) {
                var porcentagem = (salarioDouble * 9) / 100;
                System.out.println("Taxas de 9%, portanto: R$ " + porcentagem);
            } else if (salarioDouble > 34000 && salarioDouble <= 68000) {
                var porcentagem = (salarioDouble * 37) / 100;
                System.out.println("Taxas de 37%, portanto: R$ " + porcentagem);
            } else {
                var porcentagem = (salarioDouble * 49) / 100;
                System.out.println("Taxas de 49%, portanto: R$ " + porcentagem);
            }
        }
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
