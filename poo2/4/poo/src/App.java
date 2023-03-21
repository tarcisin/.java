import java.util.ArrayList;

import dir.Cliente;
import dir.Funcionario;
import dir.Pessoa;
import dir.Grupo;

public class App {
    public static void main(String[] args) throws Exception {
        Grupo equipe = new Grupo("Tecnologia", new ArrayList<Pessoa>());
        equipe.adicionar(new Funcionario("Lucas", "Gestor da Equipe Dev"));
        equipe.adicionar(new Funcionario("Fábio", "Diretor de Tecnologia da Informação"));
        equipe.adicionar(new Funcionario("João", "Analista de Requisitos"));
        equipe.adicionar(new Funcionario("Pedro", "Analista de Qualidade"));
        equipe.adicionar(new Funcionario("Luís", "P.O."));

        Grupo dev = new Grupo("Desenvolvimento", new ArrayList<Pessoa>());
        dev.adicionar(new Funcionario("Thiago", "Dev Júnior"));
        dev.adicionar(new Funcionario("Leo", "Dev Pleno"));
        dev.adicionar(new Funcionario("Augusto", "Dev Senior"));

        Grupo devOps = new Grupo("DevOps", new ArrayList<Pessoa>());
        devOps.adicionar(new Funcionario("Marcos", "DevOps Pleno"));
        devOps.adicionar(new Funcionario("Paulo", "DevSecOps"));

        dev.adicionar(devOps);
        equipe.adicionar(dev);


        Grupo clientes = new Grupo("Clientes do financiamento", new ArrayList<Pessoa>());
        clientes.adicionar(new Cliente("David", "PRODUTO 1.0"));
        clientes.adicionar(new Cliente("Richard", "PRODUTO 2.0"));
        clientes.adicionar(new Cliente("Nick", "PRODUTO 1.0"));

        equipe.adicionar(clientes);

        clientes.imprimirNomes();
        clientes.getPessoas().get(2).imprimirNomes();

        equipe.getPessoas().get(2).imprimirNomes();
        equipe.imprimirNomes();
    }
}