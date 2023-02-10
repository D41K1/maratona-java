/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class Arrays01 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Ichigo";
        nomes[2] = "Byakuya";
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        int[] numeros = {1,2,3};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
