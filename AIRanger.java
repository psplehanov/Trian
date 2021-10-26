import java.lang.Math;
import java.util.ArrayList;

public class AIRanger extends Player
{
	@Override
	public int SelectDoor()
	{
		//Если переопределять, необходимо учитывать, что в дверях может быть меньше 3-х элементов
		//1 - первая дверь
		return 1;
	}
	
	@Override
	public void UseTalent(ArrayList<Room> rooms)
	{
		//Выбор двери для применения таланта
		if (this.getCharge() == true)
		{
			int choice = (int)(Math.random()*3);
			int way = rooms.get(choice).getWay();
			//Удаляю дверь из выбора
			if (way != 1) 
			{
				rooms.remove(choice);
			};
		}
	}	
}