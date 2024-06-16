package Juego.Carta.Accion;

import Juego.Controlador.Juego;

public class CartaMasDos extends CartaAccion {
    private static final String tipo = "T2";

    /**
     * Constructor de la carta mas dos
     */
    public CartaMasDos() {
    }

    /**
     * Constructor de la carta mas dos
     *
     * @param color color de la carta
     */
    public CartaMasDos(char color) {
        super(color, CartaMasDos.tipo);
    }

    /**
     * Ejecuta la accion de la carta mas dos
     */
    @Override
    public void ejecutarAccion() {
        Juego.setCartasATomar(Juego.getCartasATomar() + 2);
    }

    /**
     * Obtiene el tipo de la carta mas dos
     *
     * @return tipo de la carta
     */
    @Override
    public String getTipo() {
        return tipo;
    }

    /**
     * Muestra la carta mas dos
     */
    @Override
    public void mostrarCarta() {
        System.out.print(this.color + tipo + "  ");
    }
}
