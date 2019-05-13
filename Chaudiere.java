package iot;


public class Chaudiere implements EvttemperatureListener {

    private float tempthreshold; // température seuil 
    
    private  Etat eta;  // etat en cours 
    
    private enum Etat {  //ON/OFF
      ALLUMEE,ETEINT
    }
   


    public Chaudiere(float seuil){
        this.tempthreshold =seuil;
        this.eta = eta.ETEINT;              
    }
    public void allumer()
    {
    	this.eta= eta.ALLUMEE;
    }
    public void etindre()
    {
    	this.eta=eta.ETEINT;
    }
    public String  mEtat()
    {
      String test;

         if (this.tempthreshold>20) {
             
             this.allumer();
         }
         else if(this.tempthreshold<20)
         {
        	   this.etindre();
         }
  
         return "la Chaudiere " + this.eta;

    }
    public void set(int temp)
    {
        this.tempthreshold =temp; 
    }
    
    public void reagie(EvtTemperature evt)
    {    
    	if(evt.gettemp()>20)
    	{
    		this.etindre();
    	}
    	else if(evt.gettemp()<20)
    	{
    		this.allumer();
    	}
    }
    
    public static void main(String[] arg) {
        
        Chaudiere  a = 	new Chaudiere(10);
        
      for(int i =-50;i<50 ;i++)
      {    a.set(i);   
        System.out.println(a.mEtat()+"   "+i);
      }
        

    }
	 
 
}

