package tp4;
import java.util.*;

public class main {
	
	public static void main(String[] args) {
		int dé=0;
		int a=0;
		int l=0;
		int k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre n:");
		int n = sc.nextInt();
		
		//Simuler le lancer de dé « n » fois	
		while(n!=l){
		dé=1+(int)(Math.random()*6);
		System.out.println("le résulta de lancé le  dé est:"+ dé);
			
			l=l+1;
			//On veut maintenant chercher le nombre d’apparitions de la face 6
			if(dé==6){
				a=a+1;
				
			}System.out.println("le nombre de face 6 est:" +a);
			
			
		}
		
		
		
	}
		
	}
	
	



