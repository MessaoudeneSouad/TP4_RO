package tp4;
import java.util.*;

public class monnaie {
//Simuler le tirage d’une pièce de monnaie « n » fois. Le nombre « n » est entré par l’utilisateur
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nombre n:");
		int n = sc.nextInt();
		int K=0;
		while(n!=K){
		Random random = new Random();
		int pileOuFace = random.nextInt(n);
		if (pileOuFace == 0) {
			System.out.println("le tirage est:Pile");
		    
		} else {
			System.out.println("le tirage est:Face");
		   
		}
		K=K+1;
		}

	}

}
