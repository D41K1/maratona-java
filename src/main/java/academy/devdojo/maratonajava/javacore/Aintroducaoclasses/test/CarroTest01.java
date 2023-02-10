/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

/**
 *
 * @author gusta
 */
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        
        carro.nome = "Etios";
        carro.modelo = "Hatch";
        carro.ano = 2013;
        
        carro2.nome = "Corolla";
        carro2.modelo = "Sedan";
        carro2.ano = 2017;
        
        System.out.println("Carro: " + carro.nome + ", modelo: " + carro.modelo + ", ano: " + carro.ano);
        System.out.println("Carro: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano: " + carro2.ano);
    }
}
