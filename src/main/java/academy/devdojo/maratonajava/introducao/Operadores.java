/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        
        System.out.println(resultado);
        
        // < > <= >= == !=
        
        // && (and) || (or)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        
        double conta1 = 200;
        double conta2 = 1000;
        int valorPs5 = 500;
        
        boolean ps5 = conta1 >= valorPs5 || conta2 >= valorPs5;
        System.out.println("Da de comprar ps5 " + ps5);
        
        //var++ (var = var + 1)
    }
}
