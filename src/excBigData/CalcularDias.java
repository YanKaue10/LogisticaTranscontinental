package excBigData;
import excBigData.ContainerStatus.StatusContainer;

public class CalcularDias {
	
	
	public static void calculo(Container container) {
		double custo = container.getDiasPatio() * 50.0; 
		
		if (container.getStatus() != StatusContainer.NORMAL) {
		    custo = custo *  1.15;
		}
		container.setCustoArmazenamento(custo);
	}
}
