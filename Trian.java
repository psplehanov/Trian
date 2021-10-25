import java.util.ArrayList;

public class Trian 
{
	public static void main(String[] arg)
	{
		Player p1 = new Ranger();
		p1.setWaycount(2);
		p1.setCharge(true);
		p1.setName("Геймер");
		
		Player p2 = new AIRanger();
		p2.setWaycount(2);
		p2.setCharge(true);
		p2.setName("Болванчик");
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);		
		players.add(p2);		
		
		GameMaster gm = new GameMaster();
		gm.StartGame(players);
	}	
}
