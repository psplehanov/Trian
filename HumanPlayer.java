public class HumanPlayer extends Player
{
	@Override
	public void entering(Room room)
	{
			System.out.println("Вы попали в комнату " + room.getName());
	}
}