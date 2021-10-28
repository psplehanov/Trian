import java.util.ArrayList;
import java.lang.Math;

public class GameMaster{
	int[][] arrVariableDoor = new int[6][3];
	int[][] arrVariableWay = new int[6][3];
	
	public GameMaster(){
		arrVariableDoor[0] = new int[] {1,2,3};
		arrVariableDoor[1] = new int[] {1,3,2};
		arrVariableDoor[2] = new int[] {2,1,3};
		arrVariableDoor[3] = new int[] {2,3,1};
		arrVariableDoor[4] = new int[] {3,2,1};
		arrVariableDoor[5] = new int[] {3,1,2};
		
		arrVariableWay[0] = new int[] {-1,0,1};
		arrVariableWay[1] = new int[] {-1,1,0};
		arrVariableWay[2] = new int[] {0,-1,1};
		arrVariableWay[3] = new int[] {0,1,-1};
		arrVariableWay[4] = new int[] {1,0,-1};
		arrVariableWay[5] = new int[] {1,-1,0};
	}
	
	public void StartGame(ArrayList<Player> players){	
		boolean resumegame = true;
		int choice = 0;
		
		System.out.println("Начинается игра:");
		
		while (resumegame  == true){
			GetStatusGame(players);
			
			for (Player player : players){
				
				System.out.println("ход игрока " + player.getName());
				
				ArrayList<Room> rooms = CreateRooms();
				
				player.UseTalent(rooms);
				
				choice = player.selectDoor();
				
				rooms.get(choice - 1).execute(player);
				
				rooms.get(choice - 1).exit(player);
				
				if (player.getWaycount() == 0){
					resumegame = false;
					System.out.println("игрок " + player.getName() + " выиграл!");
					break;
				}				
			}			
		}
		
	}
	
	public void GetStatusGame(ArrayList<Player> players){
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		System.out.println("Новый ход:");
		
		for (Player player : players){
			System.out.println("" + player.getName() + " до центра: " + player.getWaycount() + " здоровье: " + player.getHealth());
		}
		
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}
	
	private ArrayList<Room> CreateRooms(){
		int resran = 0;
		
		//Подготовка комнат
		PeaceRoom pr = new PeaceRoom();
		QuestRoom qr = new QuestRoom();
		FightRoom fr = new FightRoom();
		
		//распределение порядкового номера дверей
		resran = (int)(Math.random()*6);
		ArrayList<Room> rooms = new ArrayList<Room>();
		int[] vardoors = arrVariableDoor[resran];
		for (int i = 0; i < 3; i++){
			if (vardoors[i] == 1) {rooms.add(pr);}
			if (vardoors[i] == 2) {rooms.add(qr);}
			if (vardoors[i] == 3) {rooms.add(fr);}
		}
			
		//распределение прохождения пути
		resran = (int)(Math.random()*6);
		pr.setWay(arrVariableWay[resran][0]);
		qr.setWay(arrVariableWay[resran][1]);
		fr.setWay(arrVariableWay[resran][2]);
		
	

		return rooms;
	}
	
}