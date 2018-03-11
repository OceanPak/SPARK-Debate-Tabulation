import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		ArrayList<Indiv> allContestants = new ArrayList<Indiv>();
		ArrayList<ArrayList<Indiv>> currentTeams = new ArrayList<ArrayList<Indiv>>();
		Scanner reader = new Scanner(System.in);
		int round = 0;
		
		allContestants.add(new Indiv("Yung Chun Hin"));
		allContestants.add(new Indiv("Sebastian Ching"));
		allContestants.add(new Indiv("Gabrielle Luk"));
		allContestants.add(new Indiv("Lam Tung Kiu"));
		allContestants.add(new Indiv("Joy Chi"));
		allContestants.add(new Indiv("Thomas So"));
		
		allContestants.add(new Indiv("Nida Khan"));
		allContestants.add(new Indiv("Simon Yung"));
		allContestants.add(new Indiv("See Tin Wing Jamie"));
		allContestants.add(new Indiv("Eunice Chong"));
		allContestants.add(new Indiv("So Hin Ka"));
		allContestants.add(new Indiv("Belle Ho"));
		
		allContestants.add(new Indiv("Nicole Lam"));
		allContestants.add(new Indiv("Gianna Lai"));
		allContestants.add(new Indiv("Abdullah Shek Yiu Lun Benjamin"));
		allContestants.add(new Indiv("Choi Yuk Chai Vito"));
		allContestants.add(new Indiv("Yeung Kit Yee Lilian"));
		allContestants.add(new Indiv("Gloria Ly"));
		
		allContestants.add(new Indiv("Bill Kot"));
		allContestants.add(new Indiv("Matthew Chiu"));
		allContestants.add(new Indiv("Christina Kwok"));
		allContestants.add(new Indiv("Christie Cheng"));
		allContestants.add(new Indiv("Esther Tam")); 
		allContestants.add(new Indiv("Sarrah Ebrahim"));
		
		allContestants.add(new Indiv("Jason Cheng Chi Ho"));
		allContestants.add(new Indiv("Chan Ching Muk"));
		allContestants.add(new Indiv("Aimen Nadeem"));
		allContestants.add(new Indiv("Choi Yuet Chai Tiger"));
		allContestants.add(new Indiv("Mark Wong Long Hin"));
		allContestants.add(new Indiv("Emi Otsuki"));
		
		allContestants.add(new Indiv("Lucas Szeto"));
		allContestants.add(new Indiv("Lam Gloria"));
		allContestants.add(new Indiv("Lam Yeung Ching"));
		allContestants.add(new Indiv("Wesley Wong"));
		allContestants.add(new Indiv("Angie Wong Hui Ching"));
		allContestants.add(new Indiv("Douglas Yang"));
		
		allContestants.add(new Indiv("Anila Shah"));
		allContestants.add(new Indiv("Justin Cheng"));
		allContestants.add(new Indiv("Tina Wong"));
		allContestants.add(new Indiv("Rachel Lu"));
		allContestants.add(new Indiv("Ethan Nicholas Chan"));
		allContestants.add(new Indiv("Tony Hon"));
		
		allContestants.add(new Indiv("Carolyn Chan"));
		allContestants.add(new Indiv("Yuen Ho Yi Holly"));
		allContestants.add(new Indiv("Kalista Lam"));
		allContestants.add(new Indiv("Sam Tsang"));
		allContestants.add(new Indiv("Mandy (ISF)"));
		allContestants.add(new Indiv("Simranprit Kaur"));
		
		allContestants.add(new Indiv("Vanessa Woo"));
		allContestants.add(new Indiv("Audrey Chow"));
		allContestants.add(new Indiv("Jenkin Yuen"));
		allContestants.add(new Indiv("Ng Yuen Man"));
		allContestants.add(new Indiv("Eiscen Caagbay"));
		allContestants.add(new Indiv("Madeleine Wu"));
		
		allContestants.add(new Indiv("Harsh Jaluka"));
		allContestants.add(new Indiv("Christy Lui"));
		allContestants.add(new Indiv("Khan Ammarah"));
		allContestants.add(new Indiv("Wong Yui Him"));
		allContestants.add(new Indiv("Peter Li"));
		allContestants.add(new Indiv("Matthew Fung"));
		
		allContestants.add(new Indiv("Yoyo Fong"));
		allContestants.add(new Indiv("Amber Yeung"));
		allContestants.add(new Indiv("Angela Yiu Chi Yuet"));
		allContestants.add(new Indiv("Wong King Sang Tommy"));
		allContestants.add(new Indiv("Aaditya Vora"));
		allContestants.add(new Indiv("Nicole Ho Lok Yin"));
		
		allContestants.add(new Indiv("Chan Daniel Lian"));
		allContestants.add(new Indiv("Wong Sing Yu Cyrus"));
		allContestants.add(new Indiv("Cheung Tsz Yau Samuel"));
		allContestants.add(new Indiv("Eunice Ng Hei Yin"));
		allContestants.add(new Indiv("Caitlin Chung"));
		allContestants.add(new Indiv("Genevieve Yeung"));

		allContestants.add(new Indiv("Alicia Lam"));
		allContestants.add(new Indiv("Leo Lai"));
		allContestants.add(new Indiv("Abigail Wong"));
		allContestants.add(new Indiv("Tony Tam"));
		allContestants.add(new Indiv("Amelia Lee"));
		allContestants.add(new Indiv("Lorraine Tan"));
		
		allContestants.add(new Indiv("Franco Lau"));
		allContestants.add(new Indiv("Yu Han Daisy Wang"));
		allContestants.add(new Indiv("Helen Chau"));
		allContestants.add(new Indiv("Gloria Leung"));
		allContestants.add(new Indiv("Xinyi Li"));
		allContestants.add(new Indiv("Marcus Tong"));

		currentTeams.add(new ArrayList<Indiv>());
		int teamNum = 0;
		
		System.out.println("Round "+ round);
		for (Indiv debater : allContestants) {
			System.out.println("Team " + teamNum);
			currentTeams.get(teamNum).add(debater);
			System.out.println(debater);
			if (currentTeams.get(teamNum).size() == 3) {
				teamNum++;
				currentTeams.add(new ArrayList<Indiv>());
				System.out.println("");
			}
		}
		
		for (int b = 0; b < 4; b++) {
			for (Indiv person : allContestants) {
				System.out.println("Did " + person.getName() + " win this round? 0 or 1.");
				String setScore = reader.nextLine();
				person.addWinScore(setScore);
				System.out.println("");
				System.out.println("What is the Accumulated Score for " + person.getName() + "? (0 - 5)");
				setScore = reader.nextLine();
				int score = Integer.parseInt(setScore);
				person.addAccumulatedPoints(score);
				System.out.println("");
				System.out.println("What is the Speaker Score for " + person.getName() + "? (60 - 85)");
				setScore = reader.nextLine();
				double speakerScore = Double.parseDouble(setScore);
				person.addSpeakerScore(speakerScore);
				System.out.println("");
			}
			
			Indiv temp;
			for (int c = 0; c < allContestants.size(); c++) {
				for (int d = c; d > 0; d--) {
					if(allContestants.get(d).getAccumulatedPoints() > allContestants.get(d-1).getAccumulatedPoints()) {
						temp = allContestants.get(d);
						allContestants.set(d, allContestants.get(d-1));
						allContestants.set(d-1, temp);
					}
				}
			}
			//System.out.println(allContestants);
			
			int beginIndex = 0;
			
			for (int e = 0; e < allContestants.size() - 1; e++) {
				if (allContestants.get(e).getAccumulatedPoints() != allContestants.get(e+1).getAccumulatedPoints()) {
					for (int f = beginIndex; f < e + 1; f++) {
						for (int g = f; g > beginIndex; g--) {
							if(allContestants.get(g).getAvgSpeakerScore() > allContestants.get(g-1).getAvgSpeakerScore()) {
								temp = allContestants.get(g);
								allContestants.set(g, allContestants.get(g-1));
								allContestants.set(g-1, temp);
							}
						}
					}
					beginIndex = e+1;
				}
			}
			
			currentTeams = new ArrayList<ArrayList<Indiv>>();
			currentTeams.add(new ArrayList<Indiv>());
			teamNum = 0;
			int roomID = 0;
			
			for (Indiv debater : allContestants) {
				System.out.println("Team " + teamNum);
				currentTeams.get(teamNum).add(debater);
				System.out.println(debater);
				debater.additionalRoomPoints(roomID);
				if (currentTeams.get(teamNum).size() == 3) {
					teamNum++;
					currentTeams.add(new ArrayList<Indiv>());
					if (currentTeams.size() % 2 != 0 && currentTeams.size() != 1) {
						roomID++;
					}
					System.out.println("");
				}
			}
			
		}
		
	}

}