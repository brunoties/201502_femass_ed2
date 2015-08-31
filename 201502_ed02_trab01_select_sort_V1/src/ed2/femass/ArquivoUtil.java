package ed2.femass;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoUtil {
	
	private final String CAMINHO_ARQUIVO = "C:\\Users\\Bruno\\Desktop\\vetor_numeros.txt";
	
	private final String NOME_ARQUIVO = "vetor_numeros.txt";
	
	private File arquivo;
	
	public ArquivoUtil() {
		this.criaArquivo();
	}
	
	private void criaArquivo() {
		
		this.arquivo = new File(CAMINHO_ARQUIVO);
		
		if (!this.arquivo.exists()) {
	
			try {
				
				this.arquivo.createNewFile();
				
			} catch (IOException e) {
				
				System.out.println("Falha ao tentar criar o arquivo " + NOME_ARQUIVO 
						+ " no diretório " + CAMINHO_ARQUIVO + "!");
				
				e.printStackTrace();
			}
		}
	}
	
	public void escreve(String[] texto) {
		
		try {
			
			BufferedWriter escritor = new BufferedWriter(new FileWriter(this.arquivo));
			
			for(int i = 0; i < texto.length; i++) {
				
				escritor.write(texto[i]);
				
				escritor.newLine();
			}
			
			escritor.close();
		
		} catch (IOException e) {
			
			System.out.println("Falha ao abrir o arquivo " + this.NOME_ARQUIVO
					+ " no diretório " + CAMINHO_ARQUIVO + " para escrita!");
			
			e.printStackTrace();
		}
	}
	
	public String leArquivo() throws IOException {
		
		Scanner leitor = new Scanner(this.arquivo);
		
		String vetorTexto = "";
		
		while(leitor.hasNextLine()) {
			vetorTexto += leitor.nextLine();
		}
		
		leitor.close();
		
		return vetorTexto;
	}
	
	public int[] importaVetor(String texto) throws IOException {
				
		String [] vetorTexto = texto.split(" ");
		
		int[] vetor = new int[vetorTexto.length];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(vetorTexto[i]);
		}
		
		return vetor;
	}
	
//	public void escreve(String texto) {
//	
//try {
//
//BufferedWriter escritor = new BufferedWriter(new FileWriter(this.arquivo));
//
//escritor.write(texto);
//
//escritor.close();
//
//} catch (IOException e) {
//
//System.out.println("Falha ao abrir o arquivo " + this.NOME_ARQUIVO
//		+ " no diretório " + CAMINHO_ARQUIVO + " para escrita!");
//
//e.printStackTrace();
//}
//}


}
