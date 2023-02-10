/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeFuncionario;

/**
 *
 * @author gusta
 */
public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImprimeFuncionario imprime = new ImprimeFuncionario();
        
        funcionario.setNome("Gustavo");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1000, 2000, 3000});
        
        imprime.imprimeFuncionario(funcionario);
        funcionario.mediaSalario();
    }
}
