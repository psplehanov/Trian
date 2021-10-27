public class FightRoom extends Room
{
	public FightRoom()
	{
		super("Fight room");
	}
	
	@Override
	public void execute(Player player)
	{
		player.entering(this);
		
		Monster monster = new Monster();
	}
}