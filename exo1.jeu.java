package tp4;

public class jeu {
	//Calculez et affichez le nombre de lancers avant d'obtenir le premier �6�
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d�=0;
		int k=0;

		
			while(d�!=6){
				
			
			
			d�=1+(int)(Math.random()*6);
			
			System.out.println("le r�sulta de lanc� le  d� est:" +d�);
			
			k=k+1;
	}
	
			System.out.println("le nombre de lancers avant d'obtenir le premier �6 est: "+ k);
	

	}
}
