package ed2.femass;

public class TesteNumeros {
	
	public static void main(String[] args) {
		
		int[] vetor = NumerosUtil.geraVetorComNumerosAleatorios(10);
		
		NumerosUtil.exibeVetor(vetor);
		
		vetor = NumerosUtil.ordenaVetor(vetor);
		
		NumerosUtil.exibeVetor(vetor);
		
//		NumerosUtil.exibeVetor(
//				NumerosUtil.ordenaVetor(
//						NumerosUtil.geraVetorComNumerosAleatorios(10) ) );
		
	}

}
