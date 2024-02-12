import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Aeronave {
    // Atributos que vamos a utilizar
    protected String CodigoAparato;
    protected LocalDate FechaEntrega;
    protected String LineaMontaje;
    protected int HorasTrabajoPrevistas;
    protected int HorasTrabajoEmpleadas;
    protected int NumeroPasajeros;
    protected float CosteVenta;
    protected float PrecioVenta;

    // Metodo constructor
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

    // Metodo para mostrar la fecha de entrega
    public void FechaEntrega() {
        System.out.println(FormaDate());
    }

    // Metodo para formatear la fecha de entrega
    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Después construyó un " + getClass().getSimpleName() +  " el " + Formateo.format(FechaEntrega) + " para " + NumeroPasajeros + " pasajeros.";
    }

    // Metodo para calcular las horas de beneficio de la aeronave
    public void HorasBeneficio() {
        float diferencia = PrecioVenta - CosteVenta;
        Locale Euro = new Locale("es", "ES");
        NumberFormat Format = NumberFormat.getCurrencyInstance(Euro);
        Format.setMaximumFractionDigits(0);
        String cambio = Format.format(diferencia);
        System.out.println("\t Esto supuso " + HorasTrabajoEmpleadas + " horas de trabajo generando un beneficio de " + cambio);
    }

    // Metodo propulsor
    public void propul() {

    }

    // Metodo para calcular el total de horas de todas las avionetas
    public void TotalHoras(Aeronave[] aeronaves) {
        int totalHorasAvionetas = 0;
        for (Aeronave aeronave : aeronaves) {
            if (aeronave instanceof Avioneta) {
                totalHorasAvionetas += aeronave.HorasTrabajoEmpleadas;
            }
        }
    }

    // Metodo para calcular el beneficio total de todas las aeronaves
    public double CalcularBeneficio() {
        return PrecioVenta;
    }

    // Metodo para calcular la facturación total
    public void Facturacion(Aeronave[] aeronaves) {
        double totalCoste = 0.0;
        for (Aeronave aeronave : aeronaves) {
            totalCoste += aeronave.CalcularBeneficio();
        }
        Locale Euro = new Locale("es", "ES");
        NumberFormat Format = NumberFormat.getCurrencyInstance(Euro);
        String cambioFacturacion = Format.format(totalCoste);
        System.out.println("La facturación total de la compañia a día de hoy: " + cambioFacturacion);
    }

    // Metodo main
    public static void main(String[] args) {
        // Formato de fecha
        DateTimeFormatter Formato = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        Aeronave aero = new Aeronave("DR1", LocalDate.parse("02-11-2024", Formato), "L2GA",205, 205, 0, 0, 0);

        // Creamos las instancias de dron
        Dron dron = new Dron("DR1", LocalDate.parse("02-02-2008", Formato), "L2GA",205, 205, 0, 2700, 5400);
        Dron dron2 = new Dron("DR2", LocalDate.parse("03-09-2008", Formato), "L2GA",250, 250, 0, 2400, 5600);

        // Creamos las instancias de avioneta
        Avioneta avioneta = new Avioneta("AV1", LocalDate.parse("03-10-2008", Formato), "L2GA",2500, 2500, 8, 125000, 250000);
        Avioneta avioneta2 = new Avioneta("AV2", LocalDate.parse("04-15-2008", Formato), "L2GA",2700, 2800, 10, 130000, 260000);

        // Creamos las instancias de jet
        Jet jet = new Jet("JE1", LocalDate.parse("05-22-2008", Formato), "L2GA",10550, 10550, 6, 750000, 1500000);
        Jet jet2 = new Jet("JE2", LocalDate.parse("06-25-2008", Formato), "L2GA",11000, 11000, 8, 970000, 1600000);

        // Creamos las instancias de avcommed
        AvComMed avcommed = new AvComMed("AVM1", LocalDate.parse("07-28-2008", Formato), "L2GA",22785, 22785, 120, 2500000, 5000000);
        AvComMed avcommed2 = new AvComMed("AVM2", LocalDate.parse("11-06-2008", Formato), "L2GA",24000, 24000, 140, 5500000, 7000000);

        // Creamos las instancias de avcomgran
        AvComGran avcomgran = new AvComGran("AVG1", LocalDate.parse("07-28-2009", Formato), "L2GA",30000, 30000, 200, 5000000, 10000000);
        AvComGran avcomgran2 = new AvComGran("AVG2", LocalDate.parse("08-22-2009", Formato), "L2GA",35000, 35000, 220, 10000000, 20000000);

        // Creamos las instancias de cohete
        Cohete cohete = new Cohete("CH1", LocalDate.parse("09-14-2022", Formato), "L2GA",22785, 22785, 0,2500000, 5000000 );
        Cohete cohete2 = new Cohete("CH2", LocalDate.parse("12-30-2022", Formato), "L2GA",24000, 24000, 0, 5500000, 7000000);

        // Creación de la tabla con las instancias creadas
        Aeronave[] aeronaves = {avcomgran, avcomgran2, avcommed, avcommed2, avioneta, avioneta2, cohete, cohete2, dron, dron2, jet, jet2};

        // Ordenamos esa tabla según fecha de entrega
        Arrays.sort(aeronaves, Comparator.comparing(Aeronave -> Aeronave.FechaEntrega));

        System.out.println("\t \t \t PROGRAMA AERONAVES");

        // Llamando a todas las aeronaves para imprimir por pantalla
        for (Aeronave aeronave : aeronaves) {
            aeronave.FechaEntrega();
            aeronave.HorasBeneficio();
            aeronave.propul();
            System.out.println();
        }
        // Llamando del total de horas de avioneta y la facturación de la compañia para imprimir por pantalla
        avioneta.TotalHoras(aeronaves);
        aero.Facturacion(aeronaves);
    }
}