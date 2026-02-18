package parcial1DPOO;

public class Main {
    public static void main(String[] args) {

        Tablero t = new Tablero();
        Movimientos calcular = new Movimientos(t);

        Ficha_ajedrez ficha = new Dama();
        Posicion posicion = new Posicion(4,4);

        int cantidad = calcular.contarMov(ficha, posicion);

        System.out.println("La cantidad de movimeintos de esta pieza es de: " + cantidad);
    }
}
