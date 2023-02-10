/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/**
 *
 * @author gusta
 */
public class ImprimeFuncionario {
    public void imprimeFuncionario(Funcionario funcionario){
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        if (funcionario.getSalarios() != null) {
            for(double salario: funcionario.getSalarios()){
                System.out.println(salario +" ");
            } 
        }
    }
}
