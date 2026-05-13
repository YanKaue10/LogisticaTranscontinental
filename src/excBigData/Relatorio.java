package excBigData;

import excBigData.ContainerStatus.StatusContainer;

public class Relatorio {
	
	public static StatusContainer auditoria(Container container) {
		
		if (container.getPeso() > 25 &&  container.getTemperatura() > 30 ) {
			return StatusContainer.ALTO_RISCO_ESTRUTURAL;
		} else if (container.getPeso() < 5 && container.getUmidade() < 80 || container.getDiasPatio() > 10 ) {
			return StatusContainer.RISCO_AVARIA_BOLOR; 
		} else if (container.getDiasPatio() >= 30 || container.getUmidade() <= 40 || container.getUmidade() >=40) {
			return StatusContainer.REMANEJAMENTO_PRIORITARIO;	
		}
			return StatusContainer.NORMAL;
	}
	
}
