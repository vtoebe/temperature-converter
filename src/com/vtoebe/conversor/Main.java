package com.vtoebe.conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /**
         * Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em
         * Kelvin (K), Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
         * F = (C * 1.8) + 32
         * K = C + 273.15
         * Re = C * 0.8
         * Ra = (C * 1.8) + 491
         *
         * Considere a conversão de 18 ºC e a precisão de duas casas decimais
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("#### TEMPERATURE CONVERTER ####");
        System.out.print("Enter a Celsius temperature: ");
        float temperature = scan.nextFloat();

        final float CELSIUS_TO_FAHRENHEIT = ((temperature * 1.8f) + 32);
        final float CELSIUS_TO_KELVIN = temperature + 273.15f;
        final float CELSIUS_TO_REAUMUR = temperature * 0.8f;
        final float CELSIUS_TO_RANKINE = (temperature * 1.8f) + 491.67f;


        System.out.printf("Temperature in Celsius: %.2f degrees" +
                "%nCelsius to Fahrenheit(F): %.2f degrees" +
                "%nCelsius to Kelvin(K): %.2f degrees" +
                "%nCelsius to Reaumur(Re): %.2f degrees" +
                "%nCelsius to Rankine(Ra): %.2f degrees",
                temperature, CELSIUS_TO_FAHRENHEIT, CELSIUS_TO_KELVIN, CELSIUS_TO_REAUMUR, CELSIUS_TO_RANKINE);
    }
}
