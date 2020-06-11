/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playsafeassessment.service;

/**
 *
 * @author nkeng
 */
public class MeasurementService {
    
    //Kelvin (K) to Celsius (°C) temperature conversion.
//The temperature T in degrees Celsius (°C) is equal to the temperature T in Kelvin (K) minus 273.15:
    public double kelvinToCelsius(double kelvin){
        double celsius = kelvin - 273.15;
    return celsius;
    }
    
  
    
   public double poundsToKilogram(double pound){
          double kilogram = pound / 2.2046;
     return kilogram; 
   }
   
   //The kilometre is unit of length in the metric system equivalent to one thousand metres.
    //1Km is equivalent to 0.6214 miles.
   public double milesToKilometers(double miles){
        double kilometer = miles / 0.6214;
       return kilometer;
   }
    
}
