import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Clase cohete, que extiende de aeronave e implementa la interfaz propulsor
public class Cohete extends Aeronave implements Propulsor {
    // Constructor de cohete
    public Cohete(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        // Llamamos al constructor de la clase aeronave utilizando super()
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    // Método para formatear la fecha de entrega, específico para cohete
    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Despues contruyó un " + getClass().getSimpleName() + " el " + Formateo.format(FechaEntrega);
    }

    // Implementación del método propul() definido en la interfaz propulsor
    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza propergol sólido.");
    }
}