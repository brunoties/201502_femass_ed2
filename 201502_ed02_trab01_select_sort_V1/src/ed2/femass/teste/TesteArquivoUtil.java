package ed2.femass.teste;

import ed2.femass.ArquivoUtil;
import ed2.femass.NumerosUtil;

public class TesteArquivoUtil {
	
	public static void main(String[] args) {
		
		ArquivoUtil arquivoUtil = new ArquivoUtil();
		
		int[] vetor = NumerosUtil.geraVetorComNumerosAleatorios(1000);
		
		System.out.println("Vetor que acabou de ser gerado");
		
		System.out.println(NumerosUtil.vetorModoTexto(vetor));
		
		vetor = NumerosUtil.ordenaVetor(vetor);
		
		System.out.println("Vetor depois de ser ordenado");
		
		System.out.println(NumerosUtil.vetorModoTexto(vetor));
		
		String[] vetorTexto = NumerosUtil.vetorModoTextoComQuebraDeLinha(
				NumerosUtil.vetorModoTexto(vetor) );
		
		arquivoUtil.escreve(vetorTexto);
		
	}

}
