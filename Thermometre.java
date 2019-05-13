package iot;

import  java.util.Random;



/**
 * @author Ordi
 *
 */
public class Thermometre {     

    private float  tempnow ;       // température actuelle 
    private String name ;         // the name of the thermometer
    
    Random rdm  = new Random();

    public Thermometre(String name)
    {
      this.tempnow = majTemperature();
    }
    
    public float majTemperature()
    {
        return (float)rdm.nextInt(100)-50; 
    }
    
 
    public static void  main (String [] args)
    {
    	System.out.print(" ");
    }

}
