import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Avioneta extends Aeronave implements Propulsor{
    public Avioneta(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    @Override
    public void propul() {
        System.out.println("Esta aeronave utiliza diesel.");
    }
}
