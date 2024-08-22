package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParticulaTest {

    @Test
    void deveArmazenarEstados() {
        Substancia substancia = new Substancia();
        substancia.setEstado(EstadoSolido.getInstance());
        substancia.setEstado(EstadoLiquido.getInstance());
        assertEquals(2, substancia.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Substancia substancia = new Substancia();
        substancia.setEstado(EstadoSolido.getInstance());
        substancia.setEstado(EstadoLiquido.getInstance());
        substancia.restauraEstado(0);
        assertEquals(EstadoSolido.getInstance(), substancia.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Substancia substancia = new Substancia();
        substancia.setEstado(EstadoSolido.getInstance());
        substancia.setEstado(EstadoGasoso.getInstance());
        substancia.setEstado(EstadoLiquido.getInstance());
        substancia.setEstado(EstadoPlasma.getInstance());
        substancia.restauraEstado(2);
        assertEquals(EstadoLiquido.getInstance(), substancia.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Substancia substancia = new Substancia();
            substancia.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}