package iot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chaudiere ch1 = new Chaudiere(8);
	    Thermometre th  = new Thermometre("alpha");
       
        
        th.majTemperature();
        
        th.abonner(ch1);
        
        System.out.print(th.gettemp());
	    
		
		
		
	}

}
