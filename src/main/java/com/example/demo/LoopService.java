package com.example.demo;

public class LoopService {

    public int sumar(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

}
