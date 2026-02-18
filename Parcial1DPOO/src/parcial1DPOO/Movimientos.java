package parcial1DPOO;

import java.util.List;

public class Movimientos {

    private Tablero tablero;

    public Movimientos(Tablero tablero) {
        this.tablero = tablero;
    }

    public int contarMov(Ficha_ajedrez ficha, Posicion origen) {
        List<Posicion> lista = ficha.casillaUsada(origen, tablero);
        return lista.size();
    }
}

