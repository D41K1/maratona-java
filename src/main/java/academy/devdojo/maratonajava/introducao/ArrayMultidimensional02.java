/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.introducao;

/**
 *
 * @author gusta
 */
public class ArrayMultidimensional02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        int[][] arrayInt = new int[3][];
        
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};
        
        int[][] arrayInt2 = {{1,2},{3,4,5},{6,7,8,9,10,11,12}};
        
        for (int[] arrayBase : arrayInt2){
            System.out.println("\n-------");
            for (int num : arrayBase) {
                System.out.println(num+ " ");
            }
        }
    }
}
