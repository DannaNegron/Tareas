import pokemon.PokemonMurkrow;
import pokemon.PokemonDreepy;
import pokemon.Tipo;
/**
 *
 * @author danna
 */

public class BatallaPokemon {
    
    public static void main(String[] args) {
        PokemonDreepy pokemonDreepy = new PokemonDreepy();
        PokemonMurkrow pokemonMurkrow =  new PokemonMurkrow();
        
        PokemonDreepy.atacar(1, PokemonMurkrow);
        System.out.println("Ps = " + PokemonMurkrow.getPs());
        PokemonMurkrow.atacar(2, PokemonDreepy);
        System.out.println("Ps = " + PokemonDreepy.getPs());
    }
    
}