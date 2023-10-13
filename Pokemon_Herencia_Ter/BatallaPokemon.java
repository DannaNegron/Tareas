/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alumno-64
 */
public class BatallaPokemon {

   
    public static void main(String[] args) {
        PokemonDragon pokemonDragon = new PokemonDragon("Dragonite","PokemonElectrico", 10);
        PokemonFantasma pokemonFantasma =  new PokemonFantasma ("Gengar", "PokemonFantasma", 10);
        
        pokemonDragon.atacar("garra dragon", pokemonFantasma);
        //pokemonFantasma.recibirAtaque("garra dragon");
        System.out.println("hp = " + pokemonFantasma.getHp());
        pokemonFantasma.atacar("puño sombra", pokemonDragon);
        //pokemonDragon.recibirAtaque("puño sombra");
        System.out.println("hp = " + pokemonDragon.getHp());
    }
    
}
   

