package org.example;

import java.util.ArrayList;
import java.util.List;

public class Substancia {

    private EstadoSistema estado;
    private List<EstadoSistema> memento = new ArrayList<EstadoSistema>();

    public EstadoSistema getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoSistema estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<EstadoSistema> getEstados() {
        return this.memento;
    }
}
