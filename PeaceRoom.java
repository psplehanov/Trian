public class PeaceRoom extends Room
{
	public PeaceRoom()
	{
		super("Peace room");
	}
	
	@Override
	public void execute(Player player)
	{
		player.entering(this);
		player.setCharge(true);
	}
}