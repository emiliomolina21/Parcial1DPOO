package parcial1DPOO;

import java.util.ArrayList;
import java.util.List;

public class Peon extends Ficha_ajedrez {

    public Peon() {
        super("Peon");
    }

    @Override
    public List<Posicion> casillasOcupables(Posicion origen, Tablero tablero) {
        List<Posicion> movimientos = new ArrayList<>();

        int fila = origen.getFila();
        int columna = origen.getColumna();

        Posicion adelante = new Posicion(fila + 1, columna);
        if (tablero.esValida(adelante))
            movimientos.add(adelante);

        if (fila == 2) {
            Posicion doble = new Posicion(fila + 2, columna);
            if (tablero.esValida(doble))
                movimientos.add(doble);
        }

        return movimientos;
    }
}
