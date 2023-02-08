public class SuperDie{
	public int sides;
	public int roll;

	//Constructor
	public SuperDie(){
		sides = 6;
	}

	public SuperDie(int selectedSides){
		sides = selectedSides;
	}

	public void setSides(int changedSides){
		sides = changedSides;
	}

	public int getSides(){
		return sides;
	}

	public int rollDie(){
		roll = (int)Math.floor(Math.random()*(sides+1)+0);
		return roll;
	}

}