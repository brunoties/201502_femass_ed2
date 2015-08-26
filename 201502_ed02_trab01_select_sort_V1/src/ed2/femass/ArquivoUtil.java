package ed2.femass;
import java.io.File;
import java.io.IOException;


public class ArquivoUtil {
	
	public static String CAMINHO_ARQUIVO = "C:\\Users\\Bruno\\Desktop";
	
	public static String NOME_ARQUIVO = "vetor_numeros.txt";
	
	public static void salvaArquivo() {
		
		File arquivo = new File(CAMINHO_ARQUIVO + File.separator + NOME_ARQUIVO);
		
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Falha ao tentar criar o arquivo " + NOME_ARQUIVO 
						+ " no diretório " + CAMINHO_ARQUIVO);
				e.printStackTrace();
			}
		}
	}

}
