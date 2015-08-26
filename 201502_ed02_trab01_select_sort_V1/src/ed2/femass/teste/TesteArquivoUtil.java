package ed2.femass.teste;

import java.io.IOException;

import ed2.femass.ArquivoUtil;
import ed2.femass.NumerosUtil;

public class TesteArquivoUtil {
	
	public static void main(String[] args) {
		
		ArquivoUtil arquivoUtil = new ArquivoUtil();
		

		/* 
		 * 
		 * PRIMEIRA PARTE
		 * 
		 * */
		
//		int[] vetor = NumerosUtil.geraVetorComNumerosAleatorios(1000);
//		
//		System.out.println("Vetor que acabou de ser gerado");
//		
//		System.out.println(NumerosUtil.vetorModoTexto(vetor));
//		
//		vetor = NumerosUtil.ordenaVetor(vetor);
//		
//		System.out.println("Vetor depois de ser ordenado");
//		
//		System.out.println(NumerosUtil.vetorModoTexto(vetor));
//		
//		String[] vetorTexto = NumerosUtil.vetorModoTextoComQuebraDeLinha(
//				NumerosUtil.vetorModoTexto(vetor) );
//		
//		arquivoUtil.escreve(vetorTexto);
		
		/* 
		 * 
		 * SEGUNDA PARTE
		 * 
		 * */
		
		int[] vetor = null;
		
		try {
			vetor = arquivoUtil.importaVetor(arquivoUtil.leArquivo());
		} catch (IOException e) {
			System.out.println("Falha ao abrir o arquivo para leitura!");
			e.printStackTrace();
		}
		
		System.out.println(NumerosUtil.vetorModoTexto(vetor));
		
	}

}
