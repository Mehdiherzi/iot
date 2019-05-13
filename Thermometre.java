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

    ArrayList <EvttemperatureListener> abonner;

    public Thermometre(String name)
    {
      /*this.tempnow = majTemperature();*/
      this.name = name;
      this.tempnow =   (float) rdm.nextInt(100)-50;
    }
    
    public void majTemperature()
    {   
        //return (float) rdm.nextInt(100)-50;
    	EvtTemperature Evt = new EvtTemperature(this.tempnow);
    	
    	for(EvttemperatureListener l : this.abonner)
    	{
    		l.reagie(Evt);
    	}
    	
    }
    
    public float gettemp()
    {
    	return this.tempnow;
    }
/*
    public float gettemp1()
    {   
      tempnow  =this.majTemperature();   //  teste experimantale 
        
      return  this.tempnow ;
    	 
    }
    */
    
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
       // a.majTemperature();
        System.out.println("test");    

    }
     
    
    
    }

}
