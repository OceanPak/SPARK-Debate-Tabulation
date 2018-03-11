import java.util.ArrayList;

public class Indiv {

	String name;
	ArrayList<Indiv> teammates = new ArrayList<Indiv>();
	ArrayList<Indiv> foes = new ArrayList<Indiv>();
	double accumulatedPoints;
	ArrayList<Double> speakerPoints = new ArrayList<Double>();
	ArrayList<Integer> addWinScores = new ArrayList<Integer>();
	ArrayList<Integer> additionalRoomScores = new ArrayList<Integer>();
	double finalScore;
	double finalSpeakerScore;
	
	public Indiv(String name1) {
		name = name1;
		accumulatedPoints = 0;
		finalScore = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void addAccumulatedPoints(double score) {
		accumulatedPoints+=score;
	}
	
	public double getAccumulatedPoints() {
		return accumulatedPoints;
	}
	
	public void addSpeakerScore(double score) {
		speakerPoints.add(score);
	}
	
	public double getAvgSpeakerScore() {
		double total = 0;
		for (Double score : speakerPoints) {
			total += score;
		}
		finalSpeakerScore = total / speakerPoints.size();
		return finalSpeakerScore;
	}
	
	public void addWinScore(String setScore) {
		if (setScore.equals("1")) {
			addWinScores.add(1);
			double speakerScore = Double.parseDouble(setScore);
			addAccumulatedPoints(speakerScore);
		}
		else if (setScore.equals("0")) {
			addWinScores.add(0);
			double speakerScore = Double.parseDouble(setScore);
			addAccumulatedPoints(speakerScore);
		}
	}
	
	public void addRoomPoints(int personNumber) {
		if (personNumber >= 0 && personNumber <= 17) {
			additionalRoomScores.add((int) 2);
			accumulatedPoints = accumulatedPoints + 2;
		}
		else if (personNumber >= 18 && personNumber <= 35) {
			additionalRoomScores.add((int) 1.5);
			accumulatedPoints = accumulatedPoints + 1.5;
		} 
		else if (personNumber >= 36 && personNumber <= 53) {
			additionalRoomScores.add((int) 1);
			accumulatedPoints = accumulatedPoints + 1;
		}
		else if (personNumber >= 54 && personNumber <= 71) {
			additionalRoomScores.add((int) 0.5);
			accumulatedPoints = accumulatedPoints + 0.5;
		}
		else {
			additionalRoomScores.add((int) 0);
		}
	}
	
	public void additionalRoomPoints(int roomID) {
		if (roomID >= 0 && roomID <= 2) {
			additionalRoomScores.add((int) 1.5);
			accumulatedPoints = accumulatedPoints + 1.5;
		}
		else if (roomID >= 3 && roomID <= 5) {
			additionalRoomScores.add((int) 1);
			accumulatedPoints = accumulatedPoints + 1;
		} 
		else if (roomID >= 6 && roomID <= 8) {
			additionalRoomScores.add((int) 0.5);
			accumulatedPoints = accumulatedPoints + 0.5;
		}
		else {
			additionalRoomScores.add((int) 0);
		}
	} 
	
	public String toString() {
		//return name;
		finalScore = getAccumulatedPoints();
		if (speakerPoints.size() == 0) {
			return name + "- Accumulated Score: " + finalScore;
		}
		return name + " - Accumulated Score: " + finalScore + ", Speaker Points: " + getAvgSpeakerScore();
	}
	
}
