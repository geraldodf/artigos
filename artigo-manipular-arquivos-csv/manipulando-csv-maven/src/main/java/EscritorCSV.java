import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritorCSV {

    public static void escreverComOpenCSV(String caminhoDoArquivo) {
        String[] cabecalho = { "Nome", "Idade", "Cidade" };
        String[] linha1 = { "Mateus", "25", "Pará" };
        String[] linha2 = { "Lia", "30", "Paraná" };

        try (CSVWriter writer = new CSVWriter(new FileWriter(caminhoDoArquivo))) {
            writer.writeNext(cabecalho);
            writer.writeNext(linha1);
            writer.writeNext(linha2);
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String caminho = "dadosEscritos.csv";
        escreverComOpenCSV(caminho);
    }
}
