package ed2.femass.teste;

import ed2.femass.NumerosUtil;

public class TesteNumeros {
	
	public static void main(String[] args) {
		
		int[] vetor = NumerosUtil.geraVetorComNumerosAleatorios(100);
		
		System.out.println(NumerosUtil.vetorModoTexto(vetor));
		
//		vetor = NumerosUtil.selectionSortOrdenaVetor(vetor);
		
		vetor = NumerosUtil.bubbleSortOrdenaVetor(vetor);
		
		System.out.println(NumerosUtil.vetorModoTexto(vetor) );
		
//		NumerosUtil.exibeVetor(
//				NumerosUtil.ordenaVetor(
//						NumerosUtil.geraVetorComNumerosAleatorios(10) ) );
		
	}

}
