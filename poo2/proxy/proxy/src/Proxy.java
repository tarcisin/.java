public class Proxy implements Interface{

  private Player player;

  @Override
  public void add() {
    if (player == null) {
            player = new Player();
        }
        player.add();
  }

  @Override
  public void play(int Index) {
    if (player == null) {
      player = new Player();
    }
    player.play(Index);
  }

}
