package simuladordeinventario;

public class ListaDeProbabilidad{
    public int indicador;
    public double probabilidad;

    public ListaDeProbabilidad(int nombre, Double probabilidad) {
        this.indicador = nombre;
        this.probabilidad = probabilidad;
    }
    
    public int getNombre() {
        return indicador;
    }

    public void setNombre(int nombre) {
        this.indicador = nombre;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(Double probabilidad) {
        this.probabilidad = probabilidad;
    } 
}
