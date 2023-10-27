package pokemon;

import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList< Movimiento> movimientos = new ArrayList<>();
   
    public ListaMovimientos () {
        //Movimientos de tipo dragon
        movimientos.add(new Movimiento("Ataque ala", 60, Tipo.DRAGON, 35));
        movimientos.add(new Movimiento("Atizar", 80, Tipo.DRAGON, 20));
        movimientos.add(new Movimiento("Construccio", 15, Tipo.DRAGON, 20));
        movimientos.add(new Movimiento("Cola Dragon", 60, Tipo.DRAGON, 10));

        //Movimientos de tipo fantasma
        movimientos.add(new Movimiento("Lenguetazo", 30, Tipo.FANTASMA, 30));
        movimientos.add(new Movimiento("Golpe bajo", 70, Tipo.FANTASMA, 5));
        movimientos.add(new Movimiento("Puño Sombra", 60, Tipo.FANTASA, 20));
        movimientos.add(new Movimiento("Vendetta", 50, Tipo.FANTASMA, 10));
    }
    public Movimiento buscarMovimientosPorNombre(String nombre){
        for( Movimiento movimiento : movimientos){
            if(movimieto.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
}
