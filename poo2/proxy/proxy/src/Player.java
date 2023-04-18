import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player implements Interface{

  List<String> list = new ArrayList<String>();
  Scanner sc = new Scanner(System.in);

  @Override
  public void add() {
    String song;
    String name;
    String artist;
    System.out.println("Insira o nome do artista: ");
    artist = sc.nextLine();
    System.out.println("Insira o nome do música: ");
    name = sc.nextLine();
    song = name + " - " + artist;
    list.add(song);
  }

  @Override
  public void play(int Index) {
    System.out.println("Tocando: " + list.get(Index));
  }
}
