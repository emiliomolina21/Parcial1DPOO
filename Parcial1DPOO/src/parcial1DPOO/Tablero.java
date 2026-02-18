package parcial1DPOO;

public class Tablero {

    private int tamano = 8;

    public boolean esValida(Posicion posicion) {
        return posicion.getFila() >= 1 && posicion.getFila() <= tamano &&
               posicion.getColumna() >= 1 && posicion.getColumna() <= tamano;
    }

    public int getTamano() {
        return tamano;
    }
}
