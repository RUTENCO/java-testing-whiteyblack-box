package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LoopServiceTest {

    private final LoopService loopService = new LoopService();

    @Test
    void sumarDeberiaRetornarCeroCuandoElArregloEstaVacio() {
        // Arrange
        int[] numeros = {};

        // Act
        int resultado = loopService.sumar(numeros);

        // Assert
        assertEquals(0, resultado);
    }

    @Test
    void sumarDeberiaRetornarElMismoValorCuandoHayUnSoloElemento() {
        // Arrange
        int[] numeros = {5};

        // Act
        int resultado = loopService.sumar(numeros);

        // Assert
        assertEquals(5, resultado);
    }

    @Test
    void sumarDeberiaRetornarLaSumaCorrectaCuandoHayVariosElementos() {
        // Arrange
        int[] numeros = {2, 3, 5};

        // Act
        int resultado = loopService.sumar(numeros);

        // Assert
        assertEquals(10, resultado);
    }
}
