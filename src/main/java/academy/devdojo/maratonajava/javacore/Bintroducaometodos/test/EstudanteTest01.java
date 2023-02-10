/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

/**
 *
 * @author gusta
 */
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimeEstudante imprimir = new ImprimeEstudante();
        
        estudante1.nome = "Gustavo";
        estudante1.idade = 22;
        estudante1.sexo = 'M';
        
        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';
        
        imprimir.imprime(estudante1);
        imprimir.imprime(estudante2);
        
        System.out.println("####################");
        
        imprimir.imprime(estudante1);
        imprimir.imprime(estudante2);
    }
}
