import classes.Campeonato;
import classes.TipoCampeonato;

public class App {
    public static void main(String[] args) throws Exception {
        Campeonato camp = new Campeonato(0001, 2022, "CAMPEONATO 1", TipoCampeonato.REGIONAL);
        String tipoDoCamp = new String();
        tipoDoCamp = camp.getTipoC().getTipo();

        System.out.println(tipoDoCamp);
    }
}
