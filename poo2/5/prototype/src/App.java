import dir.Dualshock;

public class App {
    public static void main(String[] args) throws Exception {
        Dualshock ds = new Dualshock(null, 0, null);
        ds.definirConfig();
        Dualshock dt = ds.clone();
        System.out.println(dt.getCor());
        System.out.println(dt.getBateria());
        System.out.println(dt.getModelo());

        dt.reset();
    }
}
