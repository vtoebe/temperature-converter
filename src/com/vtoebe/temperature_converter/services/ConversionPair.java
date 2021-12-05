package com.vtoebe.temperature_converter.services;

import com.vtoebe.temperature_converter.enums.TemperatureScales;

public class ConversionPair {

    public TemperatureScales selectPair(int choice){
       switch(choice){
           case 1: return TemperatureScales.FAHRENHEIT;
           case 2: return TemperatureScales.KELVIN;
           case 3: return TemperatureScales.REAUMUR;
           case 4: return TemperatureScales.RANKINE;
       }
       return null;
    }
}
