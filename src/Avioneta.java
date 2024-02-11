import java.time.LocalDate;

public class Avioneta extends Aeronave implements Propulsor{
    public Avioneta(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza diesel.");
    }
}
