package iot;

import  java.util.*;



/**
 * @author Ordi
 *
 */
public class Thermometre {     

    private float  tempnow ;       // température actuelle 
    private String name ;         // the name of the thermometer
    
    Random rdm  = new Random();
    
    float a =100.0f;
    public Thermometre(String name)
    {
      this.tempnow = majTemperature();
      this.name = name;
    }
    
    public float majTemperature()
    {
        return (float) rdm.nextInt(100)-50; 
    }
    
    public float gettemp()
    {
    	return this.tempnow;
    }
    
    public void settemp(float temp)
    {
    	this.tempnow=temp;
    }
 
    
 
    
    /**
     * @param args
     */
    public static void  main (String [] args)
    {  
        Thermometre alpha = new Thermometre("alpha");
        Thermometre beta = new Thermometre("beta");
        
        alpha.majTemperature();
        System.out.println(alpha.gettemp());
        alpha.settemp.majTemperature;
        System.out.println(alpha.gettemp());
        alpha.majTemperature();
        System.out.println(alpha.gettemp());
    }

}
