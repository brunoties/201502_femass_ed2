package ed2.femass;
import java.util.Random;

public class NumerosUtil {

	public static int[] geraVetorComNumerosAleatorios(int tamanho) {

		int [] vetor = new int[tamanho];

		Random random = new Random();

		for (int i = 0; i < tamanho; i++) {
			vetor[i] = random.nextInt(tamanho);
		}
		return vetor;
	}

	public static void exibeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
			if(String.valueOf(i).endsWith("9")) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static int[] ordenaVetor(int[] vetor) {
		
		int aux = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			
			for(int j = i + 1; j < vetor.length; j++) {
				
				if(vetor[i] > vetor[j]) {
					
					aux = vetor[i];
					
					vetor[i] = vetor[j];
					
					vetor[j] = aux;
					
				}
				
			}
			
		}
		
		return vetor;
	}

}
