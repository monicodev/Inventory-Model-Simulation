
package simuladordeinventario;

public class ArticulosEnEspera {
    public int dias;
    public int cantidadArticulos;

    public ArticulosEnEspera(int dias, int cantidadArticulos) {
        this.dias = dias;
        this.cantidadArticulos = cantidadArticulos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }    
}
