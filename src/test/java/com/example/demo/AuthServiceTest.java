package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AuthServiceTest {

    private final AuthService authService = new AuthService();

    @Test
    void loginDeberiaPermitirAccesoCuandoUsuarioYPasswordSonValidos() {
        // Arrange
        boolean usuarioValido = true;
        boolean passwordValida = true;

        // Act
        boolean resultado = authService.login(usuarioValido, passwordValida);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void loginDeberiaDenegarAccesoCuandoPasswordEsInvalida() {
        // Arrange
        boolean usuarioValido = true;
        boolean passwordValida = false;

        // Act
        boolean resultado = authService.login(usuarioValido, passwordValida);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void loginDeberiaDenegarAccesoCuandoUsuarioEsInvalido() {
        // Arrange
        boolean usuarioValido = false;
        boolean passwordValida = true;

        // Act
        boolean resultado = authService.login(usuarioValido, passwordValida);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void loginDeberiaDenegarAccesoCuandoUsuarioYPasswordSonInvalidos() {
        // Arrange
        boolean usuarioValido = false;
        boolean passwordValida = false;

        // Act
        boolean resultado = authService.login(usuarioValido, passwordValida);

        // Assert
        assertFalse(resultado);
    }
}
