package Arboles;

public class Nodo {

    Nodo izquierda, derecho;
    int dato;

    public Nodo(int dato) {
        this.izquierda = this.derecho = null;
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }


}
