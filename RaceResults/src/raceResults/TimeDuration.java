package raceResults;

public class TimeDuration {

	private static int seconds;

	public TimeDuration(int i) {
		// TODO Auto-generated constructor stub
		seconds = i;
	}

	public String toString() {
		return TimeDuration.seconds/3600 + " h " + TimeDuration.seconds%3600/60 + " m " + TimeDuration.seconds%60 + " s";
	}
	
}
