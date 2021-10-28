public class AIPlayer extends Player{
	@Override
	public int[] fight(){
		int[] choice = new int[3];
		
		choice[0] = 1;
		choice[1] = 1;
		choice[2] = 1;

		return choice;
	}
	
	@Override
	public int selectDoor()	{
		//Если переопределять, необходимо учитывать, что в дверях может быть меньше 3-х элементов
		//1 - первая дверь
		return 1;
	}
}