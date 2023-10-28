package pokemon;

public class PokemonMurkrow extends Pokemon{
    public PokemonMurkrow(){
        super(Tipo.SINIESTRO, Clase.FISICO, "Murkrow", 50, 60, 85, 42, 85, 46, 91);
    }

    ListaMovimientos listaMovimientos = new ListaMovimientos();{

    setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Picotazo"));
    setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Persecucion"));
    setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Buena baza"));
    setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Finta"));
}

    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;
        if(pokemon.getTipo() == Tipo.FANTASMA) efectividad = 1;
        if(pokemon.getTipo() == Tipo.DRAGONFANTASMA) efectividad = 2;

        return efectividad;
    }
}
