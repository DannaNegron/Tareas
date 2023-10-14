package pokemon;
/**
 *
 * @author danna
 */
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList< Movimiento> movimientos = new ArrayList<>();
   
    public ListaMovimientos () {
        //Movimientos de tipo dragon
        movimientos.add(new Movimiento("Ataque ala", 60, Tipo.DRAGON, 35));
        movimientos.add(new Movimiento("Atizar", 80, Tipo.DRAGON, 20));
        movimientos.add(new Movimiento("Construccion", 15, Tipo.DRAGON, 20));
        movimientos.add(new Movimiento("Cola dragon", 60, Tipo.DRAGON, 10));

        //Movimientos de tipo fantasma
        movimientos.add(new Movimiento("Lenguetazo", 30, Tipo.FANTASMA, 30));
        movimientos.add(new Movimiento("Golpe bajo", 70, Tipo.FANTASMA, 5));
        movimientos.add(new Movimiento("Puño sombra", 60, Tipo.FANTASA, 20));
        movimientos.add(new Movimiento("Vendetta", 50, Tipo.FANTASMA, 10));
        
        //Movimientos de tipo electrico
        movimientos.add(new Movimiento("Puño fuego", 75, Tipo.ELECTRICO, 15));
        movimientos.add(new Movimiento("Ataque rapido", 40, Tipo.ELECTRICO, 30));
        movimientos.add(new Movimiento("Patada baja", 1, Tipo.ELECTRICO, 20));
        movimientos.add(new Movimiento("Giga impacto", 150, Tipo.ELECTRICO, 5));

        //Movimientos de tipo tierra
        movimientos.add(new Movimiento("Araño", 40, Tipo.TIERRA, 35));
        movimientos.add(new Movimiento("Impresionar", 30, Tipo.TIERRA, 15));
        movimientos.add(new Movimiento("Magnitud", 1, Tipo.TIERRA, 30));
        movimientos.add(new Movimiento("Terratemblor", 60, Tipo.TIERRA, 20));
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