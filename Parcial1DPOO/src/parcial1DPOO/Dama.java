package parcial1DPOO;

import java.util.ArrayList;
import java.util.List;

public class Dama extends Ficha_ajedrez {

    public Dama() {
        super("Dama");
    }

    @Override
    public List<Posicion> casillaUsada(Posicion posicion, Tablero tablero) {
        List<Posicion> mov = new ArrayList<>();

        int fila = posicion.getFila();
        int columna = posicion.getColumna();

        for(int i=1;i<=8;i++){

            Posicion[] posibles = {
                new Posicion(fila+i,columna),
                new Posicion(fila-i,columna),
                new Posicion(fila,columna+i),
                new Posicion(fila,columna-i),
                new Posicion(fila+i,columna+i),
                new Posicion(fila-i,columna-i),
                new Posicion(fila+i,columna-i),
                new Posicion(fila-i,columna+i)
            };

            for(Posicion posicion1 : posibles)
                if(tablero.esValida(posicion1))
                    mov.add(posicion1);
        }

        return mov;
    }
}
