/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class ExercicioSwitchCase {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        String diaDaSemana;
        
        System.out.println("1 a 7(1 = domingo): ");
        diaDaSemana =  myObj.nextLine();
        
        int diaDaSemanaInt = parseInt(diaDaSemana);
            
        switch (diaDaSemanaInt) {
            case 1, 7 -> System.out.println("Fim de semana");
            case 2,3,4,5,6 -> System.out.println("Semana");
            default -> System.out.println("Erro, numero entre 1 a 7");
        }
    }
}
