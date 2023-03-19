import java.util.ArrayList;

import dir.Funcionario;
import dir.Pessoa;
import dir.Time;

public class App {
    public static void main(String[] args) throws Exception {
        Time equipe = new Time("Tecnologia", new ArrayList<Pessoa>());
        equipe.adicionar(new Funcionario("Lucas"));
        equipe.adicionar(new Funcionario("Fábio"));
        equipe.adicionar(new Funcionario("João"));
        equipe.adicionar(new Funcionario("Pedro"));
        equipe.adicionar(new Funcionario("Luís"));

        Time dev = new Time("Desenvolvimento", new ArrayList<Pessoa>());
        dev.adicionar(new Funcionario("Thiago"));
        dev.adicionar(new Funcionario("Leo"));
        dev.adicionar(new Funcionario("Augusto"));

        Time devOps = new Time("DevOps", new ArrayList<Pessoa>());
        devOps.adicionar(new Funcionario("Marcos"));
        devOps.adicionar(new Funcionario("Paulo"));

        dev.adicionar(devOps);
        equipe.adicionar(dev);
        
        equipe.imprimirNomes();
    }
}