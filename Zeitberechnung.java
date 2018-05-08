//Zeitberechnung


package zeitberechnung;

import java.util.Scanner;

public class Zeitberechnung {
    public static void main(String[] args) {
		
        Scanner eingabe = new Scanner(System.in);
        
		System.out.println("Bitte gib eine ganze Zahl für Sekunden ein:");
        
		int sekundenanzahl = eingabe.nextInt();
        
        int stunden = sekundenanzahl/3600;
        
        int rest1 = sekundenanzahl%3600;
        
        int minuten = rest1/60;
        
        int restsekunden = rest1%60;
        
        System.out.println(sekundenanzahl + " Sekunden sind insgesamt " 
                + stunden + " Stunde/n, " 
                + minuten + " Minute/n und " 
                + restsekunden + " Restsekunde/n!");
    }
}