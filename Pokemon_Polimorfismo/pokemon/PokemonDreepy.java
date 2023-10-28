package pokemon;

public class PokemonDreepy extends Pokemon{
    public PokemonDreepy(){
         super(Tipo.DRAGONFANTASMA, Clase.FISICO, "Dreepy", 50, 28, 60, 30, 40, 30, 82);
    }
    
    ListaMovimientos listaMovimientos = new ListaMovimientos();{
         setMovimiento(0, listaMovimientos.buscarMovimientoPorNombre("Acrobata"));
         setMovimiento(1,listaMovimientos.buscarMovimientoPorNombre("Agarre"));
         setMovimiento(2,listaMovimientos.buscarMovimientoPorNombre("Ala bis"));
         setMovimiento(3,listaMovimientos.buscarMovimientoPorNombre("Ala de acero"));
    }
    
        @Override
        public double obtenerEfectividad(Pokemon pokemon){
            double efectividad = 1.0;
            if(pokemon.getTipo() == Tipo.DRAGON) efectividad = 1;
            if(pokemon.getTipo() == Tipo.SINIESTRO) efectividad = 2;
    
            return efectividad;
        }
}
    
    
