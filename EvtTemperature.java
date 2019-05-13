package iot;

import java.util.Random;

public class EvtTemperature {
     
    private float newtemp;
    
    public  EvtTemperature(float temp)
    {
    	this.newtemp =temp;
    }
	
    public float gettemp()
    {
    	return this.newtemp; 
    }
	
	
	
	
}
