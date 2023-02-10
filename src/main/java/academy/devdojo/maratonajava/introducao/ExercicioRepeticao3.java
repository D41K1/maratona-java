/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
/**
 *
 * @author gusta
 */
public class ExercicioRepeticao3 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String valorCarro;
            
            System.out.println("Valor do carro: ");
            valorCarro =  myObj.nextLine();
            
            int valorCarroInt = parseInt(valorCarro);
            int parcela = 0;
            double valorParcela = 0;
            
            for (int i = valorCarroInt; i >= 1000; i -= 1000) {
                parcela = parcela + 1;
                valorParcela = valorCarroInt / parcela;
                System.out.println("Valores das parcelas " + valorParcela + ", vezes : " + parcela);
            }
            
            System.out.println("Número de vezes que o carro pode ser parcelado: " + parcela);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
