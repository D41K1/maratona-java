/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class EstruturasCoondicionais {
    public static void main(String[] args) {
        System.out.println("falso");
        
        int idade = 6;
        String categoria;
        
        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        
        System.out.println(categoria);
    }
}
