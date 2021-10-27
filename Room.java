public class Room
{
	private int door;
	private int way;
	private String name;
	
	public Room(String mname)
	{
		name = mname;
	}
	public void setDoor(int mdoor)
	{
		door = mdoor;		
	}
	
	public int getDoor()
	{
		return door;
	}
	
	public void setWay(int mway)
	{
		way = mway;		
	}
	
	public int getWay()
	{
		return way;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void execute(Player player)
	{
	}
	
	public void exit(Player player)
	{
		player.setWaycount(player.getWaycount() - getWay());
	}
}