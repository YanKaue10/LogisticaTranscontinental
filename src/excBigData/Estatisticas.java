package excBigData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import excBigData.ContainerStatus.StatusContainer;

public class Estatisticas {

    public static void calcularMediaUmidade(List<Container> containers) {

        Map<StatusContainer, Double> soma = new HashMap<>();

        Map<StatusContainer, Integer> quantidade = new HashMap<>();

        for (Container c : containers) {

            soma.put(c.getStatus(), soma.getOrDefault(c.getStatus(), 0.0) + c.getUmidade()
            );
            quantidade.put(c.getStatus(), quantidade.getOrDefault(c.getStatus(), 0) + 1
            );
        }

        System.out.println("\nMÉDIAS DE UMIDADE:");

        for (StatusContainer status : soma.keySet()) {
            double media = soma.get(status) / quantidade.get(status);

            System.out.println(status + " -> " + media);
        }
    }
}