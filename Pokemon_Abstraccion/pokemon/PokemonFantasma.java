package pokemon;
/**
 *
 * @author danna
 */
public class PokemonFantasma extends Pokemon {
    public PokemonFantasma(String nombre, Tipo tipo, int nivel) {
        super(nombre, Tipo.FANTASMA, nivel);

        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimiento(0,listaMovimientos.buscarMovimientoPorNombre("Lenguetazo"));
        setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Golpe bajo"));
        setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Puño sombra"));
        setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Vendetta"));
    }

    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo() == Tipo.DRAGON) efectividad = 1;
        if(pokemon.getTipo() == Tipo.TIERRA) efectividad = 2;

        return efectividad;
    }
}
