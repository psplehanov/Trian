import java.util.Scanner;

public class HumanPlayer extends Player{
	@Override
	public void entering(Room room){
		System.out.println("Вы попали в комнату " + room.getName());
	}
	
	@Override
	public int[] fight(){
		
		int[] choice = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите первое действие (1 - атака, 2 - защита, 3 - убежать)");
		choice[0] = scanner.nextInt();

		System.out.println("Введите второе действие (1 - атака, 2 - защита, 3 - убежать)");
		choice[1] = scanner.nextInt();

		System.out.println("Введите третье действие (1 - атака, 2 - защита, 3 - убежать)");
		choice[2] = scanner.nextInt();
		
		return choice;
	}
	
	@Override
	public int selectDoor(){
		System.out.println("Введите номер двери от 1 до 3");
		
		Scanner scanner = new Scanner(System.in);	
		return scanner.nextInt();
	}
}