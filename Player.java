import java.util.ArrayList;
import java.lang.Math;

import java.util.Scanner;

public class Player
{
	private int waycount;
	private boolean charge;
	private String name;
	

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
	
	public int SelectDoor()
	{
		System.out.println("Введите номер двери от 1 до 3");
		
		Scanner scanner = new Scanner(System.in);	
		return scanner.nextInt();
	}
	
	public void UseTalent(Room[] rooms)
	{
	}
	
}