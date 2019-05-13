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

    public float gettemp1()
    {   
      tempnow  =this.majTemperature();   //  teste experimantale 
        
      return  this.tempnow ;
    	 
    }
    
    /*
    public void settemp(float temp)
    {
    	this.tempnow=temp;
    }
 */
    
 
    
    /**
     * @param args
     */
 
    public static void  main (String [] args)
    {  
        Thermometre a  = new Thermometre("alpha");
        Thermometre beta = new Thermometre("beta");

      for (int i = 0; i < 10; i++) {
        a.majTemperature();
        System.out.println(a.gettemp1());    
     
        
        
        
    }
     
    
    
    }

}
