/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class EstruturaRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        
        //do sempre executa uma vez, diferente do while
        
        for (int i=0; i<10; i++) {
            System.out.println("for " +i);
        }
    }
}
