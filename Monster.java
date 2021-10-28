public class Monster{
	private String name;
	
	private int health;
	private int armor;
	private int strength;
	
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
	
	public void setName(String mname){
		name = mname;
	}
	
	public String getName(){
		return name;
	}
	
	public void looting(Player player){
	}
	
	public void hit(int damage){
		health = health - damage;
		if (health < 0) {health = 0;}
	}
	
	public int[] fight(){
		int[] choice = new int[3];
		
		choice[0] = 1;
		choice[1] = 1;
		choice[2] = 1;

		return choice;
	}
}