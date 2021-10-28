import java.util.Scanner;
import java.util.ArrayList;

public class Ranger extends HumanPlayer{
	public Ranger(){
		this.setAi(false);
	}
	@Override
	public void UseTalent(ArrayList<Room> rooms){
		if (this.getCharge() == true){
			System.out.println("Выберите дверь от 1 до 3 для использования способности");
			Scanner scanner = new Scanner(System.in);	
			int choice = scanner.nextInt();
			System.out.println(rooms.get(choice - 1).getWay());		
			this.setCharge(false);
		} else	{
			System.out.println("Способность не заряжена");
		}
	}
}