package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LoopServiceTest {

    private final LoopService loopService = new LoopService();

    @Test
    void deberiaRetornarCeroCuandoNoHayElementos() {
        // Arrange
        double[] precios = {};

        // Act
        double resultado = loopService.calcularTotal(precios);

        // Assert
        assertEquals(0, resultado);
    }

    @Test
    void deberiaIgnorarValoresInvalidos() {
        // Arrange
        double[] precios = {-10, -5};

        // Act
        double resultado = loopService.calcularTotal(precios);

        // Assert
        assertEquals(0, resultado);
    }

    @Test
    void deberiaProcesarCorrectamenteElUltimoElemento() {
        // Arrange
        double[] precios = {100, 200};

        // Act
        double resultado = loopService.calcularTotal(precios);

        // Assert
        assertEquals(100 + 180, resultado);
    }

    @Test
    void deberiaAplicarDescuentoCuandoElPrecioEsAlto() {
        // Arrange
        double[] precios = {200};

        // Act
        double resultado = loopService.calcularTotal(precios);

        // Assert
        assertEquals(180, resultado);
    }

    @Test
    void deberiaCalcularCorrectamenteConValoresMixtos() {
        // Arrange
        double[] precios = {50, 200, -10};

        // Act
        double resultado = loopService.calcularTotal(precios);

        // Assert
        assertEquals(230, resultado);
    }
}
