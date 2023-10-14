package pokemon;
/**
 *
 * @author danna
 */
public class PokemonDragon extends Pokemon {
    public PokemonDragon(String nombre, Tipo tipo, int nivel){
        super(nombre, Tipo.DRAGON, nivel);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Ataque ala"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Atizar"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Construccion"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Cola dragon"));
    }

    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo() == Tipo.FANTASMA) efectividad = 1;
        if(pokemon.getTipo() == Tipo.ELECTRICO) efectividad = 2;

        return efectividad;
    }
}