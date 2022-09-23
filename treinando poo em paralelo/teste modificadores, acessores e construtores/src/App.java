import classes.Caneta;

public class App {
    public static void main(String[] args) throws Exception {
        Caneta cnt = new Caneta("Montblanc", 0.5f);

        System.out.println(cnt.getModelo());
        System.out.println(cnt.getPonta());

        System.out.println();

        cnt.setModelo("BIC");
        cnt.setPonta(0.7f);

        System.out.println(cnt.getModelo());
        System.out.println(cnt.getPonta());
    }
}
