import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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

    public void fechaEntrega() {
        System.out.println(formaDate());
    }

    public void horasBeneficio() {
        float Benefi = PrecioVenta - CosteVenta;
        Locale Euro = new Locale("es", "ES");
        NumberFormat Format = NumberFormat.getCurrencyInstance(Euro);
        System.out.println("Esto supuso " + HorasTrabajoEmpleadas + " horas de trabajo generando un beneficio de " + (CosteVenta - PrecioVenta));
    }

    public String formaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Después construyó una " + getClass().getSimpleName() +  " el " + Formateo.format(FechaEntrega) + " para " + NumeroPasajeros + " pasajeros";
    }

    public void totalHoras() {
        System.out.println("El total de horas de trabajo empleadas en el tipo Avioneta fueron:" + HorasTrabajoEmpleadas);
    }

    public void facturacion() {

    }
}