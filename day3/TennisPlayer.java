package day3;

public class TennisPlayer extends Player {
   private int aces;

public TennisPlayer() {
	System.out.println("In TennisPlayer()");
}

public int getAces() {
	return aces;
}

public void setAces(int aces) {
	this.aces = aces;
}
}
