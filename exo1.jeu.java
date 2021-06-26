package tp4;

public class jeu {
	//Calculez et affichez le nombre de lancers avant d'obtenir le premier ‘6’
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dé=0;
		int k=0;

		
			while(dé!=6){
				
			
			
			dé=1+(int)(Math.random()*6);
			
			System.out.println("le résulta de lancé le  dé est:" +dé);
			
			k=k+1;
	}
	
			System.out.println("le nombre de lancers avant d'obtenir le premier ‘6 est: "+ k);
	

	}
}
