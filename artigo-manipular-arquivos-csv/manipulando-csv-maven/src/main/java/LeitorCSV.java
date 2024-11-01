import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorCSV {

    public static List<String> lerColunaPorNome(String caminhoDoArquivo, String nomeColuna) {
        List<String> colunaDados = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(caminhoDoArquivo))) {
            System.out.println(reader);
            String[] cabecalho = reader.readNext();
            int indiceColuna = -1;

            for (int i = 0; i < cabecalho.length; i++) {
                if (cabecalho[i].equalsIgnoreCase(nomeColuna)) {
                    indiceColuna = i;
                    break;
                }
            }

            String[] linha;
            while ((linha = reader.readNext()) != null) {
                if (indiceColuna < linha.length) {
                    colunaDados.add(linha[indiceColuna]);
                }
            }

        } catch (IOException | CsvException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return colunaDados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminho = "dados.csv";

        System.out.println("Digite o nome da coluna que deseja ler:");
        String nomeColuna = scanner.nextLine();

        List<String> dadosColuna = lerColunaPorNome(caminho, nomeColuna);

        System.out.println("Dados da coluna '" + nomeColuna + "':");
        for (String valor : dadosColuna) {
            System.out.println(valor);
        }
    }
}
