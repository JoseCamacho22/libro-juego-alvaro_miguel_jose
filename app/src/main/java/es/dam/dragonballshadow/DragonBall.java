package es.dam.dragonballshadow;

/**
 * Created by Alvaro on 8/12/15.
 */
public class DragonBall {

    private int id;
    private String nombre;
    private String sombra;

    public DragonBall(int id, String nombre, String sombra) {
        this.id=id;
        this.nombre=nombre;
        this.sombra=sombra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSombra() {
        return sombra;
    }

    public void setSombra(String sombra) {
        this.sombra = sombra;
    }

}
