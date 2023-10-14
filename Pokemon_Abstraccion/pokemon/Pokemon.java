
package pokemon;

/**
 *
 * @author danna
 */
public abstract class Pokemon {
  private int hp;
  private int nivel;
  private String nombre;
  private Tipo tipo;
  private Movimiento movimientos[];

    public Pokemon(int nivel, String nombre, Tipo tipo) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 250;
        this.movimientos = new Movimientos [4];
        
    }

    public int getHp() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setMovimiento(int indice, Movimiento movimientos) {
        this.movimientos[indice] = movimientos;
    }

    public Movimiento getMovimiento(int indice) {
        return movimientos[indice];
    }
    
    private void calculaDanio(int danio, double efectividad) {
        double puntosRestados = danio * efectividad;
        this.hp -= puntosRestados;
        System.out.printf("%s recibe %.2f puntos de danio\n", this.getNombre(),
                puntosRestados);
    }
    
    public void recibirAtaque(Movimiento movimiento, double efectividad) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento.getNombre());
        calculaDanio(movimiento.getPuntosdeAtaque(), efectividad);
    }
    
    protected boolean seHaConcretadoAtaque(Movimiento movimiento, Pokemon pokemon){
        System.out.printf("%s ataca a %s\n", this.getNombre(), pokemon.getNombre(), movimiento.getNombre());
        double efectividad = obtenerEfectividad(pokemon);
        
        if(movimiento.getPp()>0){
            pokemon.recibirAtaque(movimiento, efectividad);
            return true;
        }else{
            System.err.println("El movimiento no tiene punto de pp");
            return false;
        }
    }

    public void atacar(int m, Pokemon pokemon) {
        Movimiento movimiento = getMovimiento(m);
        boolean seHaConcretadoAtaque = seHaConcretadoAtaque(movimiento, pokemon);
        if (seHaConcretadoAtaque){
            pokemon.getMovimiento(m).setPp(movimiento.getPp()-1);
        }
    }

    public abstract double obtenerEfectividad(Pokemon pokemon);
}

