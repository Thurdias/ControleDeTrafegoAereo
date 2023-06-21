import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Desenho {
	public ArrayList<Rota> lerArquivo() throws Exception {
		ArrayList<Rota> colecao = new ArrayList<Rota>();
		BufferedReader leitor = new BufferedReader(
								new InputStreamReader(
								new FileInputStream(
								new File("rotas.txt"))));
		String linha = "";
		
		while ((linha = leitor.readLine()) != null) {
			String[] arrayLinha = linha.split(",");
			
			colecao.add(new Rota(new Aeroporto(arrayLinha[0],
									Integer.parseInt(arrayLinha[2]),
									Integer.parseInt(arrayLinha[3])),
								 new Aeroporto(arrayLinha[1],
									Integer.parseInt(arrayLinha[4]),
									Integer.parseInt(arrayLinha[5])),
								 new Aviao(
									Integer.parseInt(arrayLinha[2]),
									Integer.parseInt(arrayLinha[3]))));
		}
		
		return colecao;
	}
}