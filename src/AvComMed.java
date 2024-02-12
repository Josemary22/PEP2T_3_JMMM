import java.time.LocalDate;

// Clase avcommed, que extiende de aeronave e implementa la interfaz propulsor
public class AvComMed extends Aeronave implements Propulsor {
    // Constructor de avcommed
    public AvComMed(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        // Llamamos al constructor de la clase aeronave utilizando super()
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    // Implementación del método propul() definido en la interfaz propulsor
    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza queroxeno.");
    }
}