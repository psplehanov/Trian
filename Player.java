import java.util.ArrayList;

import java.util.Scanner;

public class Player{
	private int waycount;
	private boolean charge;
	private String name;
	private boolean ai;
	
	private int health;
	private int armor;
	private int strength;
	
	public Player(){
		health = 10;
		armor = 0;
		strength = 1;
	}

	public void setWaycount(int mwaycount){
		waycount = mwaycount;
	}
	
	public int getWaycount(){
		return waycount;
	}
	
	public void setCharge(boolean mcharge){
		charge = mcharge;
	}
	
	public boolean getCharge(){
		return charge;
	}
	
	public void setName(String mname){
		name = mname;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAi(boolean mai){
		ai = mai;
	}
	
	public boolean getAi(){
		return ai;
	}
	
	public void setHealth(int mhealth){
		health = mhealth;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void setArmor(int marmor){
		armor = marmor;
	}
	
	public int getArmor(){
		return armor;
	}
	
	public void setStrength(int mstrength){
		strength = mstrength;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public int selectDoor(){
		return 1;
	}
	
	public void UseTalent(ArrayList<Room> rooms){
	}
	
	public void entering(Room room){
	}
	
	public void hit(int damage){
		health = health - damage;
		if (health < 0) {health = 0;}
	}
	
	public int[] fight(){
		return new int[3];
	}
	
}