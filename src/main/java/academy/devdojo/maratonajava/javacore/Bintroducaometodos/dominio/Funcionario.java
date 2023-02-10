/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/**
 *
 * @author gusta
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;
    
    public void mediaSalario(){
        if (salarios != null){
            for(double salario: salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("A média salarial é de: "+media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
