import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dron extends Aeronave implements Propulsor {
    public Dron(String CA, LocalDate FE, String LM, int HTP, int HTE, int NP, float CV, float PV) {
        super(CA, FE, LM, HTP, HTE, NP, CV, PV);
    }

    public String FormaDate() {
        DateTimeFormatter Formateo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Esta fábrica construyó su primera aeronave, un " + getClass().getSimpleName() + ", el " + Formateo.format(FechaEntrega);
    }

    @Override
    public void propul() {
        System.out.println("\t \t Esta aeronave utiliza electricidad.");
    }
}
