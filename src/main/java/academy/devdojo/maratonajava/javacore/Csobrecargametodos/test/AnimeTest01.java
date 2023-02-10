/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

/**
 *
 * @author gusta
 */
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("teste", "tv", 12, "teste23");
        anime.imprime();
    }
}
