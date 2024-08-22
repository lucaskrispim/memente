package org.example;

public class EstadoGasoso implements EstadoSistema {

    private EstadoGasoso() {};
    private static EstadoGasoso instance = new EstadoGasoso();
    public static EstadoGasoso getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Gasoso";
    }

}
