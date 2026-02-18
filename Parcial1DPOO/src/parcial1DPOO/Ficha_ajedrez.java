package parcial1DPOO;


import java.util.List;

public abstract class Ficha_ajedrez{

    protected String nombre;

    public Ficha_ajedrez(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract List<Posicion> casillaUsada(Posicion origen, Tablero tablero);
}
