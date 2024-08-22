package org.example;

public class EstadoSolido implements EstadoSistema {

    private EstadoSolido() {};
    private static EstadoSolido instance = new EstadoSolido();
    public static EstadoSolido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Sólido";
    }

}
