/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Alumno-65
 */
public class Pokemon {
  private int hp;
  private int nivel;
  private String nombre;
  private String tipo;

    public Pokemon(int hp, int nivel, String nombre, String tipo) {
        this.hp = hp;
        this.nivel = nivel;
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = 100;
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
    
    private void calculaDanio(int danio) {
        this.hp -= danio;
        System.out.printf("%s recibe %d puntos de danio\n", this.getNombre(),
                danio);
    }
    
    public void recibirAtaque(String movimiento) {
        System.out.printf("%s recibe ATK %s\n", this.getNombre(), movimiento);
        calculaDanio((int) Math.random() * 10 + 1);
    }
    
    public void atacar(String movimiento, Pokemon pokemon) {
        System.out.printf("%s ataca a %s con %s\n", this.getNombre(),
                pokemon.getNombre(), movimiento);
        pokemon.recibirAtaque(movimiento);
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
