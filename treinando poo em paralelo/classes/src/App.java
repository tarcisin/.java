import classes.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic";
        c1.tampada = true;

        c1.status();
        c1.rabiscar();

    }
}
