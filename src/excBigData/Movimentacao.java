package excBigData;

import java.util.List;

import excBigData.ContainerStatus.StatusContainer;

public class Movimentacao {

    public static void listarUrgentes(List<Container> containers) {

        System.out.println("\nCONTÊINERES PARA MOVIMENTAÇÃO IMEDIATA:");
        for (Container c : containers) {
            if (c.getStatus() == StatusContainer.REMANEJAMENTO_PRIORITARIO) {
                System.out.println(
                        "Container: " + c.getId()
                );
            }
        }
    }
}
