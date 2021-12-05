package com.vtoebe.temperature_converter;

import com.vtoebe.temperature_converter.enums.TemperatureScales;
import com.vtoebe.temperature_converter.services.ConversionPair;
import com.vtoebe.temperature_converter.services.Converter;
import com.vtoebe.temperature_converter.utils.ContinuityChecker;
import com.vtoebe.temperature_converter.utils.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

        Printer print = new Printer();
        Converter converter = new Converter();
        ContinuityChecker continuity = new ContinuityChecker();
        ConversionPair pair = new ConversionPair();

        Scanner scan = new Scanner(System.in);

        boolean isRunning = true;
        TemperatureScales scale;

        print.printHeader();

        while (isRunning) {
            print.printTemperatureEntrance();
            float celsius = converter.getCelsius(scan.nextFloat());

            do {
                print.printPairSelection();
                scale = pair.selectPair(scan.nextInt());

                if (scale == null){
                    print.printSelectionPairError();
                }
            } while (scale==null);

            print.printConvertedTemperature(scale, celsius, converter.convertTemperatures(scale));

            print.printContinuityCheck();
            isRunning = continuity.checkContinuity(scan.next().toUpperCase().charAt(0));

        }
    }
}
