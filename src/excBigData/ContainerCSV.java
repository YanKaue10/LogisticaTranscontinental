package excBigData;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContainerCSV {
    public static void exportarCSV(List<Container> containers) {

        try {

            FileWriter writer = new FileWriter("csv/relatorio_portuario.csv");

            writer.append("ID,PESO,TEMPERATURA,UMIDADE,DIAS,STATUS,CUSTO\n");

            for (Container c : containers) {
                writer.append(c.getId()).append(",");
                writer.append(String.valueOf(c.getPeso())).append(",");
                writer.append(String.valueOf(c.getTemperatura())).append(",");
                writer.append(String.valueOf(c.getUmidade())).append(",");
                writer.append(String.valueOf(c.getDiasPatio())).append(",");
                writer.append(c.getStatus().toString()).append(",");
                writer.append(String.valueOf(c.getCustoArmazenamento())).append("\n");
            }

            writer.flush();
            writer.close();

            System.out.println("CSV gerado com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao gerar CSV");
        }
    }
}
