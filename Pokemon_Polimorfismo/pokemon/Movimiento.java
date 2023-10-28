package pokemon;
/**
 *
 * @author danna
 */
public class Movimiento{
    private String nombre;
    private int puntosDeAtaque,pp;
    private Tipo tipo;
    private Clase clase;

    public Movimiento(String nombre, int puntosDeAtaque,int pp, Tipo tipo, Clase clase) {
        this.nombre = nombre;
        this.puntosDeAtaque = puntosDeAtaque;
        this.pp = pp;
        this.tipo = tipo;
        this.clase = clase;
    }


    public String getNombre() {
        return nombre;
    }
    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }
    public int getPp() {
        return pp;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public Clase getClase() {
        return clase;
    }
    public void setPp(int pp) {
        this.pp = pp;
    }
    
}