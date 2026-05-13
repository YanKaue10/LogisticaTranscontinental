package excBigData;

import excBigData.ContainerStatus.StatusContainer;
public class Container {
	
	private String id;
	private double peso;
	private Float temperatura;
	public double umidade; 
	private double custoArmazenamento;
	private int diasPatio;
	
	
	private StatusContainer status;

	public Container(String id,double peso,Float temperatura, double umidade, int diasPatio) {
		this.id = id;
		this.peso = peso;
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.diasPatio = diasPatio;

		this.status = StatusContainer.NORMAL;
	}

	public String getId() {
		return id;
	}

	public double getPeso() {
		return peso;
	}

	public Float getTemperatura() {
		return temperatura;
	}

	public double getUmidade() {
		return umidade;
	}

	public int getDiasPatio() {
		return diasPatio;
	}

	public double getCustoArmazenamento() {
		return custoArmazenamento;
	}

	public void setCustoArmazenamento(double custoArmazenamento) {
		this.custoArmazenamento = custoArmazenamento;
	}

	public StatusContainer getStatus() {
		return status;
	}

	public void setStatus(StatusContainer status) {
		this.status = status;
	}
}
