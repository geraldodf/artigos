import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipuladorCSV {

    public static List<String[]> lerCSV(String caminhoDoArquivo) {
        List<String[]> dados = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoDoArquivo));
            for (String linha : linhas) {
                String[] valores = linha.split(",");
                dados.add(valores);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo" + e.getMessage());
        }
        return dados;
    }

    public static void main(String[] args) {
        String caminho = "dados.csv";
        List<String[]> dados = lerCSV(caminho);

        for (String[] linha : dados) {
            for (String valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println( );
        }
    }
}
