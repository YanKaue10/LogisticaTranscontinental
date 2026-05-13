package excBigData;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){

        List<Container> containers = new ArrayList<>();

        containers.add(new Container("Container01", 40, 55f, 50, 12));
        containers.add(new Container("Container02", 30, 20f, 85, 15));
        containers.add(new Container("Contaier03", 100, 55f, 70, 40));
        containers.add(new Container("Container04", 150, 70f, 45, 5));

        for (Container c : containers){
            c.setStatus(Relatorio.auditoria(c));
            CalcularDias.calculo(c);
        }
        ContainerCSV.exportarCSV(containers);

        Estatisticas.calcularMediaUmidade(containers);

        Movimentacao.listarUrgentes(containers);
    }
}
