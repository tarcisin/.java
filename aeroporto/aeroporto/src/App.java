import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

import Aeronave.Aeronave;
import Aeronave.Assentos;
import Aeronave.Tipo;
import Pessoas.Comissario;
import Pessoas.Passageiro;
import Pessoas.Piloto;
import Pessoas.TipoServico;
import Voo.Voo;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Assentos> seats = new ArrayList<>();
        seats.add(new Assentos("A-1", false));
        seats.add(new Assentos("B-1", false));
        seats.add(new Assentos("C-1", false));

        //---------------------------------------------- 
        //PERMISSÕES
        ArrayList<String> permitions1 = new ArrayList<>();
        permitions1.add(Tipo.AIRBUS319.getType());
        permitions1.add(Tipo.BOEING787.getType());
        permitions1.add(Tipo.BOEING707.getType());
        permitions1.add(Tipo.ATR42500.getType());

        ArrayList<String> permitions2 = new ArrayList<>();
        permitions2.add(Tipo.AIRBUS309.getType());
        permitions2.add(Tipo.BOEING727.getType());
        permitions2.add(Tipo.EMBRAER175.getType());
        permitions2.add(Tipo.ATR72.getType());
        
        //---------------------------------------------- 
        //AERONAVE
        ArrayList<Aeronave> aircraft = new ArrayList<>();
        aircraft.add(new Aeronave(101, Tipo.BOEING787.getType(), Tipo.BOEING787, seats, 20, "Disponível", "Azul", false));
        
        //---------------------------------------------- 
        //PASSAGEIROS
        ArrayList<Passageiro> passengers1 = new ArrayList<>();
        passengers1.add(new Passageiro("Lucas", "23/02/1992", "000.000.000-01", TipoServico.FIRST.getType(), false));
        passengers1.add(new Passageiro("André", "12/12/1994", "000.000.000-02", TipoServico.FIRST.getType(), false));
        passengers1.add(new Passageiro("Marcelo", "04/02/1993", "000.000.000-03", TipoServico.FIRST.getType(), false));


        //---------------------------------------------- 
        //PILOTO
        ArrayList<Piloto> pilots = new ArrayList<>();
        pilots.add(new Piloto("Eduardo", "15/09/1980", "000.000.000-04", 1, false, 2000, permitions1));
        pilots.add(new Piloto("Afonso", "05/10/1982", "000.000.000-05", 2, true, 1200, permitions1));

        //---------------------------------------------- 
        //AEROMOCA
        ArrayList<Comissario> attendant = new ArrayList<>();
        attendant.add(new Comissario("Alessandra", "21/07/1995", "000.000.000-06", 5, 480, 92, "Aeromoça"));
        attendant.add(new Comissario("Juliana", "22/11/1985", "000.000.000-07", 7, 3200, 650, "Chefe de Voo"));

        //---------------------------------------------- 
        //VOO
        ArrayList<Voo> flights = new ArrayList<>();
        flights.add(new Voo(1, pilots.get(0), pilots.get(1), attendant.get(0), passengers1, aircraft.get(0), "Goiânia", "Recife", "18:00", "20:30", "14/12/2022"));
        flights.add(new Voo(2, pilots.get(0), pilots.get(1), attendant.get(0), passengers1, aircraft.get(0), "Goiânia", "Recife", "16:00", "18:30", "15/12/2022"));


        //System.out.println(pilots.get(0).prepareAircraft(true)); pilot check
        //System.out.println(passengers1.get(0).pray()); passenger check
        //System.out.println(steward.get(0).toString()); steward check
        //System.out.println(aircraf.get(0).toString()); aircraft check
        
        flights.get(0).hist("14/12/2022", flights);
    }
}
