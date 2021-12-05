package com.vtoebe.temperature_converter.utils;

import com.vtoebe.temperature_converter.enums.TemperatureScales;
import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Printer {

    final static String OPENING_LINE = "#### TEMPERATURE CONVERTER ####";
    final static String TEMPERATURE_ENTRANCE_LINE = "Enter a Celsius temperature: ";
    final static String PAIR_SELECTION_LINE = "Select a temperature conversion pair: ";
    final static String PAIR_OPTIONS = "1 - FAHRENHEIT | 2 - KELVIN | 3 - REAUMUR | 4 - RANKINE";
    final static String CONTINUITY_CHECK_LINE = "Would you like to make another conversion? (Y/N) ";

    public void printHeader(){
        System.out.println(OPENING_LINE);
    }

    public void printTemperatureEntrance(){
        System.out.print(TEMPERATURE_ENTRANCE_LINE);
    }

    public void printPairSelection(){
        System.out.println(PAIR_OPTIONS);
        System.out.print(PAIR_SELECTION_LINE);

    }

    public void printContinuityCheck(){
        System.out.print("\n" + CONTINUITY_CHECK_LINE);
    }

    public void printSelectionPairError(){
        System.out.println("\n !! Enter a valid Pair Selection !! \n");
    }

    public void printConvertedTemperature(TemperatureScales pair, float celsiusTemp, float convertedTemp){
        System.out.printf("CELSIUS %.2f : %.2f %s", celsiusTemp, convertedTemp, pair.toString().replace('_', ' '));
    }
}
