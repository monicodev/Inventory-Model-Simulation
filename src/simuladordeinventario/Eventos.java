package simuladordeinventario;
public class Eventos {
	int dia;
	int invInc;
	double numAleatorioDemanda;
	int demanda;
	int invFinal;
	double invPromedio;
	int Faltante;
	int numOrden;
	double numAleatorioTiempoDeEntrega;
	int tiempoDeEntrega;
	double numAleatorioTiempoDeEspera;
	int tiempoDeEspera;

	public Eventos(int dia, int invInc, Double numAleatorioDemanda, int demanda, int invFinal, Double invPromedio, int Faltante, int numOrden, Double numAleatorioTiempoDeEntrega, int tiempoDeEntrega, Double numAleatorioTiempoDeEspera, int tiempoDeEspera) {
		this.dia = dia;
		this.invInc = invInc;
		this.numAleatorioDemanda = numAleatorioDemanda;
		this.demanda = demanda;
		this.invFinal = invFinal;
		this.invPromedio = invPromedio;
		this.Faltante = Faltante;
		this.numOrden = numOrden;
		this.numAleatorioTiempoDeEntrega = numAleatorioTiempoDeEntrega;
		this.tiempoDeEntrega = tiempoDeEntrega;
		this.numAleatorioTiempoDeEspera = numAleatorioTiempoDeEspera;
		this.tiempoDeEspera = tiempoDeEspera;
	}

	public Eventos(int dia, int invInc, int invFinal) {
		this.dia = dia;
		this.invInc = invInc;
		this.invFinal = invFinal;
	}

	public Eventos() {

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getInvInc() {
		return invInc;
	}

	public void setInvInc(int invInc) {
		this.invInc = invInc;
	}

	public double getNumAleatorioDemanda() {
		return numAleatorioDemanda;
	}

	public void setNumAleatorioDemanda(Double numAleatorioDemanda) {
		this.numAleatorioDemanda = numAleatorioDemanda;
	}

	public int getDemanda() {
		return demanda;
	}

	public void setDemanda(int demanda) {
		this.demanda = demanda;
	}

	public int getInvFinal() {
		return invFinal;
	}

	public void setInvFinal(int invFinal) {
		this.invFinal = invFinal;
	}

	public double getInvPromedio() {
		return invPromedio;
	}

	public void setInvPromedio(Double invPromedio) {
		this.invPromedio = invPromedio;
	}

	public int getFaltante() {
		return Faltante;
	}

	public void setFaltante(int Faltante) {
		this.Faltante = Faltante;
	}

	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public double getNumAleatorioTiempoDeEntrega() {
		return numAleatorioTiempoDeEntrega;
	}

	public void setNumAleatorioTiempoDeEntrega(Double numAleatorioTiempoDeEntrega) {
		this.numAleatorioTiempoDeEntrega = numAleatorioTiempoDeEntrega;
	}

	public int getTiempoDeEntrega() {
		return tiempoDeEntrega;
	}

	public void setTiempoDeEntrega(int tiempoDeEntrega) {
		this.tiempoDeEntrega = tiempoDeEntrega;
	}

	public double getNumAleatorioTiempoDeEspera() {
		return numAleatorioTiempoDeEspera;
	}

	public void setNumAleatorioTiempoDeEspera(Double numAleatorioTiempoDeEspera) {
		this.numAleatorioTiempoDeEspera = numAleatorioTiempoDeEspera;
	}

	public int getTiempoDeEspera() {
		return tiempoDeEspera;
	}

	public void setTiempoDeEspera(int tiempoDeEspera) {
		this.tiempoDeEspera = tiempoDeEspera;
	}
}
