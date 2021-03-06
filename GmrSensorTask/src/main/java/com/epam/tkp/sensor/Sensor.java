package com.epam.tkp.sensor;


public class Sensor {
    
    private double supplyVoltage = 5;
    
    private double angle = 0; 
    
    public void sentAngle(double angle){
        System.out.println("LOG: Angle="+ angle);
        this.angle = Math.toRadians(angle);
    }
    
    public double getSensorSinData(){
        double sine = Math.sin(angle);
        System.out.println("LOG: Sin=" + sine);
        double resultVoltage = supplyVoltage * sine;
        return resultVoltage;
    }
    
    public double getSensorCosData(){
        double cosine = Math.cos(angle);
        System.out.println("LOG: Cosine=" + cosine);
        double resultVoltage = supplyVoltage * cosine;
        return resultVoltage;
    }
    
    
}
