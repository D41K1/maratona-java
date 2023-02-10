/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class EstruturaSwitch {
    public static void main(String[] args) {
        byte dia = 5;
        
        switch (dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Seg");
            case 3 -> System.out.println("Ter");
            case 4 -> System.out.println("Qua");
            case 5 -> System.out.println("Qui");
            case 6 -> System.out.println("Sex");
            case 7 -> System.out.println("Sab");
            default -> System.out.println("Erro numero entre 1 a 7");
        }
    }
}
