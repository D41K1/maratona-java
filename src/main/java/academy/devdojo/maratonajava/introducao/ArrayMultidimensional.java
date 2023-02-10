/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class ArrayMultidimensional {
    public static void main(String[] args) {
        int [][] dias = new int [3][3];
        
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        
        dias[1][0] = 29;
        dias[1][1] = 30;
        dias[1][2] = 32;
        
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        
        for (int[] dia : dias) {
            for (int num: dia) {
                System.out.println(num);
            }
        }
    }
}
