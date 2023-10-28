package pokemon;
/**
 *
 * @author danna
 */
import java.util.ArrayList;

public class ListaMovimientos {
    private ArrayList< Movimiento> movimientos = new ArrayList<>();
   
    public ListaMovimientos () {
        //Movimientos de tipo siniestro
        movimientos.add(new Movimiento("Picotazo", 35, 35, Tipo.SINIESTRO, Clase.FISICO));
        movimientos.add(new Movimiento("Persecucion", 40, 15, Tipo.SINIESTRO, Clase.FISICO));
        movimientos.add(new Movimiento("Buena baza", 60, 10, Tipo.SINIESTRO, Clase.FISICO));
        movimientos.add(new Movimiento("Finta", 60, 20, Tipo.SINIESTRO, Clase.FISICO));
         
        //Movimientos de tipo DragonFantasma
        movimientos.add(new Movimiento("Acrobata", 55, 5, Tipo.DRAGONFANTASMA, Clase.FISICO));
        movimientos.add(new Movimiento("Agarre", 55, 30, Tipo.DRAGONFANTASMA, Clase.FISICO)); 
        movimientos.add(new Movimiento("Ala bis", 40, 10, Tipo.DRAGONFANTASMA, Clase.FISICO));
        movimientos.add(new Movimiento("Ala de acero", 70, 25, Tipo.DRAGONFANTASMA, Clase.FISICO));
    }

    public Movimiento buscarMovimientoPorNombre(String nombre){
        for( Movimiento movimiento : movimientos){
            if(movimiento.getNombre().equals(nombre)){
                return movimiento;
            }
        }
        return null;
    }
}