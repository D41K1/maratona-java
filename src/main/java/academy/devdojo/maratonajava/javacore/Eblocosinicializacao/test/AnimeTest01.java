/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

/**
 *
 * @author gusta
 */
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
