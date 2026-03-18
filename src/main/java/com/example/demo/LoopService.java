package com.example.demo;

public class LoopService {

    public double calcularTotal(double[] precios) {
        double total = 0;

        for (double precio : precios) {

            // Validación
            if (precio < 0) {
                continue; // ignora valores inválidos
            }

            // Regla de negocio: descuento
            if (precio > 100) {
                precio = precio * 0.9; // 10% descuento
            }

            total += precio;
        }

        return total;
    }
}
