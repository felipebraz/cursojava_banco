package teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestaManipulacaoArquivo {

	public static void main(String[] args) {

		File arquivo = new File("c:\\totvs\\teste.txt");
		File[] arquivos = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			if (!arquivo.exists()) {
				arquivo.createNewFile();
			}

			arquivos = arquivo.listFiles();
			fw = new FileWriter(arquivo, true);
			bw = new BufferedWriter(fw);

			bw.write("Haaaa!");
			bw.newLine();

			fr = new FileReader(arquivo);
			br = new BufferedReader(fr);

			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
			}
		}

	}

}
