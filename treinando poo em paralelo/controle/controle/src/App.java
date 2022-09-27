import classes.Controle;

public class App {
    public static void main(String[] args) throws Exception {
        Controle ctrl = new Controle();

        ctrl.ligar();
        ctrl.maisVolume();
        ctrl.abrirMenu();
        ctrl.ligarMudo();
        ctrl.pause();
        ctrl.maisVolume();
        ctrl.abrirMenu();
        ctrl.desligar();
        ctrl.maisVolume();

    }
}
