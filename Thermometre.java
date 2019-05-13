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
    }
    
    public float majTemperature()
    {
        return (float) rdm.nextInt(100)-50; 
    }
    
    public float gettemp()
    {
    	return this.tempnow;
    }
 
    
 
    
    /**
     * @param args
     */
    public static void  main (String [] args)
    {  
        Thermometre tp = new Thermometre("alpha");
        
        Thermometre a ;
        a=new Thermometre("beta");
       for(int i =0 ; i<10 ; i++ )
    	{   
        
    	System.out.println(a.gettemp());
    	}
    }

}
