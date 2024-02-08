import java.time.LocalDate;

public class AvComGran extends Aeronave implements Propulsor {
    public AvComGran(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    @Override
    public void propul() {
        System.out.println("Esta aeronave utiliza queroxeno.");
    }
}
