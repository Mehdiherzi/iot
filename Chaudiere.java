package iot;


public class Chaudiere {

    private float tempthreshold; // température seuil 
    
    private  Etat eta;
    
    private enum Etat {
      ALLUMEE,ETEINT
    }
   
    public Chaudiere(float seuil){
       
        this.tempthreshold =seuil;
        
        this.eta = eta.ETEINT;
                 
    }
    
    public void allumer()
    {
    	this.eta = eta.ALLUMEE;
    }
    public void etindre()
    {
    	this.eta = eta.ETEINT;
    }


    public static void main(String[] arg) {
        
    	Chaudiere  a = 	new Chaudiere(10);
        a.allumer();
        System.out.println(a.eta);
        a.etindre();
        System.out.println(a.eta);

    }
}

