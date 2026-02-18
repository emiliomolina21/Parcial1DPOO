package parcial1DPOO;

import java.util.ArrayList;
import java.util.List;

public class Alfil extends Ficha_ajedrez { 
	
    public Alfil() {
        super("Alfil");
    }

    @Override
    public List<Posicion> casillaUsada(Posicion origen, Tablero tablero) {
        List<Posicion> mov = new ArrayList<>();

        int fila = origen.getFila();
        int columna = origen.getColumna();

        for(int i=1;i<=8;i++){
            Posicion posicion1 = new Posicion(fila+i,columna+i);
            Posicion posicion2 = new Posicion(fila-i,columna-i);
            Posicion posicion3 = new Posicion(fila+i,columna-i);
            Posicion posicion4 = new Posicion(fila-i,columna+i);

            if(tablero.esValida(posicion1)) mov.add(posicion1);
            if(tablero.esValida(posicion2)) mov.add(posicion2);
            if(tablero.esValida(posicion3)) mov.add(posicion3);
            if(tablero.esValida(posicion4)) mov.add(posicion4);
        }

        return mov;
    }
}
