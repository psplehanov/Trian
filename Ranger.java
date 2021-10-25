import java.util.Scanner;

public class Ranger extends Player
{
	@Override
	public void UseTalent(Room[] rooms)
	{
		if (this.getCharge() == true)
		{
			System.out.println("Выберите дверь от 1 до 3 для использования способности");
			Scanner scanner = new Scanner(System.in);	
			int choise = scanner.nextInt();
			System.out.println(rooms[choise].getWay());		
			this.setCharge(false);
		} else
		{
			System.out.println("Способность не заряжена");
		}
	}
}