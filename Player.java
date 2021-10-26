import java.util.ArrayList;
import java.lang.Math;

import java.util.Scanner;

public class Player
{
	private int waycount;
	private boolean charge;
	private String name;
	private boolean ai;
	
	private int health;
	private int armor;
	private int strength;
	
	public Player()
	{
		health = 10;
		armor = 0;
		strength = 1;
	}

	public void setWaycount(int mwaycount)
	{
		waycount = mwaycount;
	}
	
	public int getWaycount()
	{
		return waycount;
	}
	
	public void setCharge(boolean mcharge)
	{
		charge = mcharge;
	}
	
	public boolean getCharge()
	{
		return charge;
	}
	
	public void setName(String mname)
	{
		name = mname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAi(boolean mai)
	{
		ai = mai;
	}
	
	public boolean getAi()
	{
		return ai;
	}
	
	public int SelectDoor()
	{
		System.out.println("Введите номер двери от 1 до 3");
		
		Scanner scanner = new Scanner(System.in);	
		return scanner.nextInt();
	}
	
	public void UseTalent(ArrayList<Room> rooms)
	{
	}
	
	public void Entering(Room room)
	{
		if (ai == false)
		{
			System.out.println("Вы попали в комнату " + room.getName());
		}
		
		if (room.getName() == "Peace room")
		{
			charge = true;
		}
	}
	
	public void onExit(Room room)
	{
		setWaycount(getWaycount() - room.getWay());
	}
	
}