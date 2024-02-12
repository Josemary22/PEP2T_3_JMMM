import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Clase avioneta, que extiende de aeronave e implementa la interfaz propulsor
public class Avioneta extends Aeronave implements Propulsor {
    // Constructor de avioneta
    public Avioneta(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        // Llamamos al constructor de la clase aeronave utilizando super()
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    // Método para formatear la fecha de entrega, específico para avioneta
    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Después construyó una " + getClass().getSimpleName() +  " el " + Formateo.format(FechaEntrega) + " para " + NumeroPasajeros + " pasajeros";
    }

    // Metodo para calcular el total de horas de todas las avionetas
    @Override
    public void TotalHoras(Aeronave[] aeronaves) {
        int totalHorasAvionetas = 0;
        for (Aeronave aeronave : aeronaves) {
            if (aeronave instanceof Avioneta) {
                totalHorasAvionetas += aeronave.HorasTrabajoEmpleadas;
            }
        }
        System.out.println("El total de horas de trabajo empleadas en el tipo "+ getClass().getSimpleName() + " fueron: " + totalHorasAvionetas);
    }

    // Implementación del método propul() definido en la interfaz propulsor
    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza diesel.");
    }
}
