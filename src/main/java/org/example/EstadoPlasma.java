package org.example;

public class EstadoPlasma implements EstadoSistema {

    private EstadoPlasma() {};
    private static EstadoPlasma instance = new EstadoPlasma();
    public static EstadoPlasma getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Plasma";
    }

}
