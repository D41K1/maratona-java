/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/**
 *
 * @author gusta
 */
public class Calculadora {
    public double x;
    public double y;
    
    public void somaDoisNumeros() {
        System.out.println(x + y);
    }
    
    public void subtraiDoisNumeros() {
        System.out.println(x - y);
    }
    
    public void multiplicaDoisNumero(double num1, double num2) {
        System.out.println(num1 * num2);
    }
    
    public double divideDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return (num1 / num2);
    }
    
    public void imprimeDivisaoDeDoisNumero(double num1, double num2) {
        if(num2 == 0){
            System.out.println("Não existe divisao por zero");
        } else{
            System.out.println(num1/num2);
        } 
    }
    
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " +num1);
        System.out.println("num2 "+num2);
    }
    
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    
    public void somaVarArgs(double... numeros){
        double soma = 0;
        for(var num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
