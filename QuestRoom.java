public class QuestRoom extends Room{
	public QuestRoom(){
		super("Quest room");
	}
	
	@Override
	public void execute(Player player){
		player.entering(this);
	}
}