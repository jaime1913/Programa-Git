public class Principal {

    public static void main(String[] args) {

        Medicamento med1 = new Medicamento(
                "MED001",
                "Acetaminofen",
                5000,
                50);

        med1.mostrarInformacion();

        med1.vender(9);

        med1.mostrarInformacion();
    }
}