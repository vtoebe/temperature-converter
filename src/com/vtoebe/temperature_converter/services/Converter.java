package com.vtoebe.temperature_converter.services;

import com.vtoebe.temperature_converter.enums.TemperatureScales;

import java.util.Objects;

public class Converter {

    float celsius;
//    float CELSIUS_TO_FAHRENHEIT = ((temperature * 1.8f) + 32);
//    float CELSIUS_TO_KELVIN = celsius + 273.15f;
//    float CELSIUS_TO_REAUMUR = celsius * 0.8f;
//    float CELSIUS_TO_RANKINE = (celsius * 1.8f) + 491.67f;

    public float getCelsius(float temperature) {
        return celsius = temperature;
    }

    public float convertTemperatures(TemperatureScales scale){
        switch (scale){
            case FAHRENHEIT: return ((celsius * 1.8f) + 32);
            case KELVIN: return celsius + 273.15f;
            case REAUMUR: return celsius * 0.8f;
            case RANKINE: return (celsius * 1.8f) + 491.67f;
            default: return 0;
        }
    }

}