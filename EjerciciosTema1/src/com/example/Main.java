package com.example;

public class Main {
    public static void main(String[] args) {
        //numeros
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 2147483647;
        float num5 = 1.2f;
        double num6 = 1.2d;

        //boolean
        boolean boolean1 = true;

        //caracteres
        char caracter = 'a';
        String palabra = "Patricio Estrella";

        //salidas
        System.out.println("Soy un byte: " + num1);
        System.out.println("Soy un short: " + num2);
        System.out.println("Soy un int: " + num3);
        System.out.println("Soy un long: " + num4);
        System.out.println("Soy un float: " + num5);
        System.out.println("Soy un double: " + num6);
        System.out.println("Soy un boolean y puedo ser true o false: " + boolean1);
        System.out.println("Soy un char y contengo un caracter: " + caracter);
        System.out.println("Soy un String y contengo una cadena de caracteres: " + palabra);

    }
}