import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Clase dron, que extiende de aeronave e implementa la interfaz propulsor
public class Dron extends Aeronave implements Propulsor {
    // Constructor de dron
    public Dron(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        // Llamamos al constructor de la clase aeronave utilizando super()
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    // Método para formatear la fecha de entrega, específico para dron
    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Esta fábrica construyó su primera aeronave, un " + getClass().getSimpleName() + ", el " + Formateo.format(FechaEntrega) + ".";
    }

    // Implementación del método propul() definido en la interfaz propulsor
    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza electricidad.");
    }
}