package raceResults;

public class TimeDuration {

	public TimeDuration(int second) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return this.seconds/3600 + " h " + this.seconds/60 + " m " + this.seconds%60 + " s";
	}
	
}
