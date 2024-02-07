import java.time.*;
import java.time.format.DateTimeFormatter;

public class Aeronave {
    String CodigoAparato;
    LocalDate FechaEntrega;
    String LineaMontaje;
    int HorasTrabajoPrevistas;
    int HorasTrabajoEmpleadas;
    int NumeroPasajeros;
    float CosteVenta;
    float PrecioVenta;

    public Aeronave (String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        CodigoAparato = CA;
        FechaEntrega = FE;
        LineaMontaje = LM;
        HorasTrabajoPrevistas = HTP;
        HorasTrabajoEmpleadas = HTE;
        NumeroPasajeros = NP;
        CosteVenta = CV;
        PrecioVenta = PV;
    }

    public LocalDate FechaEntrega(LocalDate FechaEntrega) {
        return FechaEntrega;
    }

    public void horasBeneficio() {
        System.out.println("Esto supuso" + HorasTrabajoEmpleadas + "horas de trabajo generando un beneficio de" + (CosteVenta - PrecioVenta));
    }

    public String propul() {

    }

    public String formadate() {
        LocalDate Traido = FechaEntrega(FechaEntrega);
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return Traido.format(Formateo);
    }

    public int totalHoras() {

    }

    public double facturacion() {

    }

    public static void main(String[] args) {

        };
    }
}
