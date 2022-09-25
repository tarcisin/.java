import classes.Banco;

public class App {
    public static void main(String[] args) throws Exception {
        Banco user1 = new Banco();
        user1.setNumConta(00001);
        user1.setDono("Mosc4");
        user1.abrirConta("CC");
        System.out.println(user1.getSaldo());
        
        Banco user2 = new Banco();
        user2.setNumConta(00002);
        user2.setDono("Cel0");
        user2.abrirConta("CP");
        System.out.println(user2.getSaldo());

        user1.pagarMensal();
        user2.pagarMensal();

        System.out.println(user1.getSaldo());
        System.out.println(user2.getSaldo());

        user1.depositar(300);
        user2.depositar(120);

        System.out.println(user1.getSaldo());
        System.out.println(user2.getSaldo());

        user1.sacar(500);
        user2.sacar(500);

        user1.sacar(50);
        user2.sacar(50);

        System.out.println(user1.getSaldo());
        System.out.println(user2.getSaldo());

        user1.sacar(258);
        user2.sacar(200);

        user1.fecharConta();
        user2.fecharConta();

        System.out.println(user1.getSaldo());
        System.out.println(user2.getSaldo());
    }
}
