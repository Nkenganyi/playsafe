/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playsafeassessment;

import com.playsafeassessment.service.MeasurementService;
import java.util.Scanner;

/**
 *
 * @author nkeng
 */
public class Assessment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MeasurementService service = new MeasurementService();
        LOOP: while(true){
        System.out.println("1. Kelvin To Celsius");
        System.out.println("2. Pounds To Kilometer");
        System.out.println("3. Miles To Kilometer");
            System.out.println("0. exit");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
//Kelvin to celsius
                System.out.print("Kelvin: ");
                double kelvin = scanner.nextDouble();
                System.out.println("Celsius: " + service.kelvinToCelsius(kelvin));
                break;

            case 2:
//poundsTOKilograms
                System.out.print("Pound: ");
                double pound = scanner.nextDouble();
                System.out.println("Kilograms: " + service.poundsToKilogram(pound));
                break;
            case 3:
//milesToKIlometers
                System.out.print("Miles: ");
                double miles = scanner.nextDouble();
                System.out.println("Kilometers: " + service.milesToKilometers(miles));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option ");
                break;
        }
        }
    }

}
