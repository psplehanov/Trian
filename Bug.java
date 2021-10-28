public class Bug extends Monster{
	public Bug(){
		this.setName("Таракашка");
		
		this.setHealth(1);
		this.setArmor(0);
		this.setStrength(1);
	}
	
	@Override
	public void looting(Player player){
		int health = player.getHealth();
		health = health + 2;
		if (health > 10) {health = 10;}
		player.setHealth(health); 
		System.out.println("Восстановлено здоровье");
	}
}