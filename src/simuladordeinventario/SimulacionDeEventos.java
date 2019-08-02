package simuladordeinventario;

import java.util.ArrayList;

public class SimulacionDeEventos {
	int q;
	int r;
        ArrayList<Eventos> event = new ArrayList<>();
        double costoInventario;
        double costoDeOrden;
        double costoEscasez;
        double costoTotal;

	public SimulacionDeEventos(int q, int r, ArrayList<Eventos> event, double costoInventario,
                                   Double costoDeOrden, Double costoEscasez) {
		this.q = q;
		this.r = r;
		this.event = event;
		this.costoInventario = costoInventario;
                this.costoDeOrden = costoDeOrden;
                this.costoEscasez = costoEscasez;
                this.costoTotal = this.costoEscasez+this.costoDeOrden+this.costoInventario;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public ArrayList<Eventos> getEvent() {
		return event;
	}

	public void setEvent(ArrayList<Eventos> event) {
		this.event = event;
	}

        public double getCostoInventario() {
            return costoInventario;
        }

        public void setCostoInventario(Double costoInventario) {
            this.costoInventario = costoInventario;
        }

        public double getCostoDeOrden() {
            return costoDeOrden;
        }

        public void setCostoDeOrden(Double costoDeOrden) {
            this.costoDeOrden = costoDeOrden;
        }

        public double getCostoEscasez() {
            return costoEscasez;
        }

        public void setCostoEscasez(Double costoEscasez) {
            this.costoEscasez = costoEscasez;
        }

        public double getCostoTotal() {
            return costoTotal;
        }

        public void setCostoTotal(Double costoTotal) {
            this.costoTotal = costoTotal;
        }
}