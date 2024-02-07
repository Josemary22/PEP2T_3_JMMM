import java.time.*;
public class Aeronave {
    LocalDate FechaEntrega;
    String LineaMontaje;
    int HorasTrabajoPrevistas;
    int HorasTrabajoEmpleadas;
    int NumeroPasajeros;
    float CosteVenta;
    float PrecioVenta;

    public Aeronave (LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        FechaEntrega = FE;
        LineaMontaje = LM;
        HorasTrabajoPrevistas = HTP;
        HorasTrabajoEmpleadas = HTE;
        NumeroPasajeros = NP;
        CosteVenta = CV;
        PrecioVenta = PV;
    }


}
