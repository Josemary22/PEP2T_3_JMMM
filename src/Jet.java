import java.time.LocalDate;

public class Jet extends Aeronave implements Propulsor {
    public Jet(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza queroxeno.");
    }
}
