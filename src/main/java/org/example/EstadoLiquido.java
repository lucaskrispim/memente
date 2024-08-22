package org.example;

public class EstadoLiquido implements EstadoSistema {

    private EstadoLiquido() {};
    private static EstadoLiquido instance = new EstadoLiquido();
    public static EstadoLiquido getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Líquido";
    }

}
