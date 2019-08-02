package simuladordeinventario;
import java.util.ArrayList;

public class SimuladorDeInventario {
    public static int diasASimular;
    public static int invInicial;
    public static int qmin;
    public static int qmax;
    public static int rmin;
    public static int rmax;
    public static double costoInv;
    public static double costoOrd;	
    public static double costoEscConEspera;
    public static double costoEscSinEspera;

    public static ArrayList<ListaDeProbabilidad> listaDemanda = new ArrayList<>();
    public static ArrayList<ListaDeProbabilidad> listaTiempoDeEntrega = new ArrayList<>();
    public static ArrayList<ListaDeProbabilidad> listaTiempoDeEspera = new ArrayList<>();

    public static ArrayList<SimulacionDeEventos> tablaDeEventos = new ArrayList<>();

    public static ArrayList<ArticulosEnEspera> listaArticulosEnEspera = new ArrayList<>();

    public static void main(String[] args) {
        new HomePage().setVisible(true);
    }
}
