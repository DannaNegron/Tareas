/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Alumno-65
 */
public class BatallaPokemon {

   
    public static void main(String[] args) {
        PokemonDragon Dragonite = new PokemonDragon("Dragonite", 10);
        PokemonFantasma Gengar =  new PokemonFantasma("Gengar", 10);
        
        Dragonite.atacar("ataca",Gengar);
        Gengar.atacar("atacar", Dragonite);
    }
}
 
