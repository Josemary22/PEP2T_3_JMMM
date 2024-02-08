import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cohete extends Aeronave implements Propulsor {
    public Cohete(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    public String formaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Despues contruyó un " + getClass().getSimpleName() + " el " + Formateo.format(FechaEntrega);
    }

    @Override
    public void propul() {
        System.out.println("Esta aeronave utiliza propergol sólido.");
    }
}
