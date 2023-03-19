import dir.Funcionario;
import dir.Pessoa;
import dir.Time;

public class App {
    public static void main(String[] args) throws Exception {
        Time equipe = new Time("Tecnologia", null);
        equipe.adicionar(new Funcionario("Fábio"));
        equipe.adicionar(new Funcionario("Julio"));
        equipe.adicionar(new Funcionario("Lucas"));
        equipe.adicionar(new Funcionario("Marcelo"));
        equipe.adicionar(new Time("Desenvolvimento", null));
    }
}
