import java.util.List;

import classes.*;
import classes.Pessoas.Arbitro;
import classes.Pessoas.Equipe;
import classes.Pessoas.Jogador;
import classes.Pessoas.Pessoa;
import classes.Rodada.Rodada;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
        Campeonato camp = new Campeonato(0001, 2022, "CAMPEONATO 1", TipoCampeonato.PRIMEIRA_DIVISAO, null);
        String tipoDoCamp = new String();
        tipoDoCamp = camp.getTipoC().getTipo();
        List<Rodada> a = camp.getRodadas();

        Arbitro adilson = new Arbitro("Adilson", "Juiz");
        Jogador mosca = new Jogador("Lucas Moscardini", "Jogador", "Brasileiro", "Atacante", false);

        adilson.apitar();
        adilson.aplicarPenalidade(mosca);
        adilson.aplicarPenalidade(mosca);
        adilson.aplicarPenalidade(mosca);
        
        Equipe manchester = new Equipe("Manchester City", TipoCampeonato.PRIMEIRA_DIVISAO, 0, 2, 3);
        manchester.adicionarTecnico("robinho");
        */

        Equipe noedo = new Equipe("ODEON", TipoCampeonato.REGIONAL, 0, 0, 0);
        noedo.adicionarTecnico("Edgar CIA.");
        noedo.adicionarJogador("Mosca", "BR", "ZAGA", true);
    }
}
