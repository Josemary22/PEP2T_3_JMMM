import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
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

    public void FechaEntrega() {
        System.out.println(FormaDate());
    }

    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Después construyó una " + getClass().getSimpleName() +  " el " + Formateo.format(FechaEntrega) + " para " + NumeroPasajeros + " pasajeros";
    }

    public void HorasBeneficio() {
        float diferencia = CosteVenta - PrecioVenta;
        Locale Euro = new Locale("es", "ES");
        NumberFormat Format = NumberFormat.getCurrencyInstance(Euro);
        Format.setMaximumFractionDigits(0);
        String cambio = Format.format(diferencia);
        System.out.println("\t Esto supuso " + HorasTrabajoEmpleadas + " horas de trabajo generando un beneficio de " + cambio);
    }

    public void TotalHoras(Aeronave[] aeronaves) {
        int totalHorasAvionetas = 0;
        for (Aeronave aeronave : aeronaves) {
            if (aeronave instanceof Avioneta) {
                totalHorasAvionetas += aeronave.HorasTrabajoEmpleadas;
            }
        }
        System.out.println("El total de horas de trabajo empleadas en el tipo Avioneta fueron: " + totalHorasAvionetas);
    }

    public double CalcularBeneficio() {
        return PrecioVenta;
    }

    public void Facturacion(Aeronave[] aeronaves) {
        double totalCoste = 0.0;
        for (Aeronave aeronave : aeronaves) {
            totalCoste += aeronave.CalcularBeneficio();
        }
        Locale Euro = new Locale("es", "ES");
        NumberFormat Format = NumberFormat.getCurrencyInstance(Euro);
        Format.setMaximumFractionDigits(0);
        String cambioFacturacion = Format.format(totalCoste);
        System.out.println("La facturación total de la compañia a día de hoy: " + cambioFacturacion);
    }

    public static void main(String[] args) {
        LocalDate FechaAe = LocalDate.of(2024, 2, 11);
        Aeronave aero = new Aeronave("DR1", FechaAe, "L2GA",205, 205, 0, 0, 0);

        LocalDate FechaDr = LocalDate.of(2008, 2, 2);
        Dron dron = new Dron("DR1", FechaDr, "L2GA",205, 205, 0, 5400, 2700);
        LocalDate FechaDr2 = LocalDate.of(2008, 4, 9);
        Dron dron2 = new Dron("DR2", FechaDr2, "L2GA",205, 205, 0, 5900, 3200);

        LocalDate FechaAv = LocalDate.of(2008, 3, 10);
        Avioneta avioneta = new Avioneta("AV1", FechaAv, "L2GA",2500, 2500, 8, 250000, 125000);
        LocalDate FechaAv2 = LocalDate.of(2008, 4, 15);
        Avioneta avioneta2 = new Avioneta("AV2", FechaAv2, "L2GA",2500, 2500, 10, 250000, 125000);

        LocalDate FechaJet = LocalDate.of(2008, 5, 22);
        Jet jet = new Jet("JE1", FechaJet, "L2GA",10550, 10550, 6, 1500000, 750000);
        LocalDate FechaJet2 = LocalDate.of(2008, 7, 27);
        Jet jet2 = new Jet("JE2", FechaJet2, "L2GA",10550, 10550, 8, 1500000, 750000);

        LocalDate FechaAcm = LocalDate.of(2008, 10, 28);
        AvComMed avcommed = new AvComMed("AVM1", FechaAcm, "L2GA",22785, 22785, 120, 5000000, 2500000);
        LocalDate FechaAcm2 = LocalDate.of(2008, 11, 6);
        AvComMed avcommed2 = new AvComMed("AVM2", FechaAcm2, "L2GA",22785, 22785, 140, 5000000, 2500000);

        LocalDate FechaAcg = LocalDate.of(2009, 7, 28);
        AvComGran avcomgran = new AvComGran("AVG1", FechaAcg, "L2GA",30000, 30000, 200, 10000000, 5000000);
        LocalDate FechaAcg2 = LocalDate.of(2009, 7, 28);
        AvComGran avcomgran2 = new AvComGran("AVG2", FechaAcg2, "L2GA",30000, 30000, 220, 10000000, 5000000);

        LocalDate FechaCo = LocalDate.of(2022, 9, 14);
        Cohete cohete = new Cohete("CH1", FechaCo, "L2GA",22785, 22785, 0, 5000000, 2500000);
        LocalDate FechaCo2 = LocalDate.of(2022, 12, 30);
        Cohete cohete2 = new Cohete("CH2", FechaCo2, "L2GA",22785, 22785, 0, 5000000, 2500000);

        Aeronave[] aeronaves = {avcomgran, avcomgran2, avcommed, avcommed2, avioneta, avioneta2, cohete, cohete2, dron, dron2, jet, jet2};

        Arrays.sort(aeronaves, Comparator.comparing(Aeronave -> Aeronave.FechaEntrega));

        System.out.println("\t \t \t \t \t \t PROGRAMA AERONAVES");

        for (Aeronave aeronave : aeronaves) {
            aeronave.FechaEntrega();
            aeronave.HorasBeneficio();
            ((Propulsor) aeronave).propul();
            System.out.println();
        }
        aero.TotalHoras(aeronaves);
        aero.Facturacion(aeronaves);
    }
}