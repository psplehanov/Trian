import java.lang.Math;

public class FightRoom extends Room{
	
	public FightRoom(){
		super("Fight room");
	}
	
	@Override
	public void execute(Player player){
		int playerCountFleet = 0;
		
		player.entering(this);
				
		Monster monster = new Bug();
		
		System.out.println("На бой выходит " + monster.getName());
	
		for (int i = 0; i < 5; i++){
			int[] monsterChoice = monster.fight();
			int[] playerChoice = player.fight();
			
			for (int x = 0; x < 3; x++){
				
				//удар по монстру
				if (this.resultHit(playerChoice[x], monsterChoice[x]) == true) {
					int damage = player.getStrength() - monster.getArmor();
					if (damage < 0) {damage = 0;}
					
					monster.hit(damage);
					
					System.out.println("" + monster.getName() + " получает " + damage + " урона");
				}
				
				//удар по игроку
				if (this.resultHit(monsterChoice[x], playerChoice[x]) == true) {
					int damage = monster.getStrength() - player.getArmor();
					if (damage < 0) {damage = 0;}
					
					player.hit(damage);
					
					System.out.println("" + player.getName() + " получает " + damage + " урона");
				}
				
				if (playerChoice[x] == 3) {playerCountFleet++;}
				
				if (player.getHealth() == 0){
					System.out.println("" + player.getName() + " умер.");
					return;
				}

				 if (monster.getHealth() == 0){
					System.out.println("" + monster.getName() + " умер.");
					monster.looting(player);
					return;
				 }
				 
				 if (playerCountFleet == 3) {
					System.out.println("" + player.getName() + " позорно бежал.");
					return;
				 }
				
			}
		}
		
		System.out.println("" + monster.getName() + " заскучал и ушел");
	}
	
	private boolean resultHit(int choice, int enemychoice){
		//atack = 1; defence = 2; fleet = 3
		
		double chancehit = 0;
		double chancefleet = 0;
			
		if (enemychoice == 1){
			chancefleet = 0;
		}	
			
		if (enemychoice == 2){
			chancefleet = 0.5;
		}	
			
		if (enemychoice == 3){
			chancefleet = 0.75;
		}	

		if (choice == 1){
			chancehit = 1;
		}

		if (choice == 2){
			chancehit = 0.5;
		}

		if (choice == 3){
			chancehit = 0;
		}	
		
		return chancehit * (1 - chancefleet) >= Math.random();
	}
	
}