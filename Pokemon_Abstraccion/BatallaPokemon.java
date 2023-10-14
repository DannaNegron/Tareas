import pokemon.PokemonDragon;
import pokemon.PokemonFantasma;
import pokemon.Tipo;
/**
 *
 * @author danna
 */

public class BatallaPokemon {
    
    public static void main(String[] args) {
        PokemonDragon pokemonDragon = new PokemonDragon("Dragonite", Tipo.DRAGON, 10);
        PokemonFantasma pokemonFantasma =  new PokemonFantasma ("Gengar", Tipo.FANTASMA, 10);
        
        pokemonDragon.atacar(1, pokemonFantasma);
        System.out.println("Hp = " + pokemonFantasma.getHp());
        pokemonFantasma.atacar(2, pokemonDragon);
        System.out.println("Hp = " + pokemonDragon.getHp());
    }
    
}