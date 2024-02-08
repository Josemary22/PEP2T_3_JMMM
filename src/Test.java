import java.time.*;
public class Test {
    public static void main(String[] args) {
        LocalDate FechaDr = LocalDate.of(2008, 2, 2);
        Dron dron = new Dron("DR1", FechaDr, "L2DR",205, 205, 0, 5400, 2700);

        LocalDate FechaAv = LocalDate.of(2008, 3, 10);
        Avioneta avioneta = new Avioneta("AV1", FechaAv, "L2AV",2500, 2500, 8, 250000, 125000);

        LocalDate FechaJet = LocalDate.of(2008, 5, 22);
        Jet jet = new Jet("JE1", FechaJet, "L2JE",10550, 10550, 6, 1500000, 750000);

        LocalDate FechaAcm = LocalDate.of(2008, 10, 28);
        AvComMed avcommed = new AvComMed("AVM1", FechaAcm, "L2AVM",22785, 22785, 120, 5000000, 2500000);

        LocalDate FechaCo = LocalDate.of(2022, 9, 14);
        Cohete cohete = new Cohete("CH1", FechaCo, "L2CH",22785, 22785, 0, 5000000, 2500000);


        System.out.println("\t \t \t \t \t PROGRAMA AERONAVES");

        dron.fechaEntrega();
        dron.horasBeneficio();
        dron.propul();

        avioneta.fechaEntrega();
        avioneta.horasBeneficio();
        avioneta.propul();

        jet.fechaEntrega();
        jet.horasBeneficio();
        jet.propul();

        avcommed.fechaEntrega();
        avcommed.horasBeneficio();
        avcommed.propul();

        cohete.fechaEntrega();
        cohete.horasBeneficio();
        cohete.propul();
    }
}
