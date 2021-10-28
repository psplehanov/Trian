import java.lang.Math;
import java.util.ArrayList;

public class AIRanger extends AIPlayer{
	public AIRanger(){
		this.setAi(true);
	}
	
	@Override
	public void UseTalent(ArrayList<Room> rooms){
		//Выбор двери для применения таланта
		if (this.getCharge() == true){
			int choice = (int)(Math.random()*3);
			int way = rooms.get(choice).getWay();
			//Удаляю дверь из выбора
			if (way != 1){
				rooms.remove(choice);
			};
		}
	}	
}