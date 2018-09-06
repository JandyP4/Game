import java.util.*;



public class Main {
	
	
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static String charName;
	public static String yesNo;
	private static String playAtt;
	
	 //Barbarian
	static int ranhpBar;
	int hpBar;
	static int fightBar;
	
	
	
	//Knight
	static int hpKnight;

	
	
	
	//for random attack
	static int setfite;
	//For Player
	int playHp = 50;
	static int playChoice;
	
	
	
	
	public void playFight() {
		
	
	
	if (userInput.hasNextLine()) {
		
		
		while (true){
			
			this.setplayAtt(userInput.nextLine());
			
			
			if (playAtt.equalsIgnoreCase("Slice")) {
			
				System.out.println("You swing your sword with such might!");
				playChoice = 1;
				
				break;
			}
		
			if (playAtt.equalsIgnoreCase("block")) {
			
				System.out.println("You bring up your shield in preperation of an attack.");
				
				playChoice = 2;
				
				break;
			}
			
			if (playAtt.equalsIgnoreCase("dodge")) {
				
				System.out.println("You decide to jump out of the way of a possible oncoming attack.");
				playChoice = 3;
				break;
			}
			
			if (playAtt.equalsIgnoreCase("hp")) {
				System.out.println("Your current hp is " + playHp + ". Now, What would you like to do?");
				
			}
			
			
			else {
				System.out.println("You freeze up at the heat of battle (or just spelled something wrong) is going to cost you!");
				playChoice = 4;
				playHp = playHp - 1;
				break;
			}
			
			
			
		}
		
		
		
	}
	
	
	
	}
	

	//line 11
	static void ranFite() {
	setfite = ((int )(Math.random() * 100 + 1));
	Random rand = new Random();
	rand.ints();
	
	}
	
	//Barbarian
	static void enemyBar() {
		
		ranhpBar = ((int )(Math.random() * 25 + 10));
		
		
		ranFite();
		//Attack
		if(setfite <= 66) {
			System.out.println("The barbarian atempts the bring his powerful club down on your head!!");
			fightBar = 1;
			
		}
		//Block
		else if(setfite <= 92 && setfite >= 66 ) {
			System.out.println("Without hesitation the barbarian brings his arms up to block.");
			fightBar = 2;
			
		}
		
		//Dodge
		else if(setfite > 92){
			System.out.println("The barbarian dives out of the way of a possible attack.");
			fightBar = 3;
			
		}
		
		else {
			System.out.println("The barbarian hesitates leaving him wide open for an attack!");
			
			fightBar = 4;
		}
		
		
	}
	


	
	
	
	

	
	
	public Main() {
		
		
		
	
		
		System.out.println("Enter Your Hero's Name");
		
	
		
		
		if(userInput.hasNextLine()) {
			
			this.setCharName(userInput.nextLine());
			
		}
		
		System.out.println("Would you like to begin?");
		
		
		
		
		if (userInput.hasNextLine()) {
			
			while (true) {
				
				this.setYesNo(userInput.nextLine());
				
				
				if (yesNo.equalsIgnoreCase("yes")) {
				
					System.out.println("Then lets begin!");
					break;
				}
			
				if (yesNo.equalsIgnoreCase("no")) {
				
					System.exit(1);
					break;
				}
				
				else {
				
					System.out.println("I said \"Would you like to begin?\" (resond with yes or no)");
				
				}
			}
			
		}

		//Game play Tutorial
		System.out.println("\n\nWelcome to a world filled of evil, " + charName + ". \nYou will face fierce monsters.\nEquipped with a sword and shield, you will have three options within battle."
				+ "\nSlice, Block, and Dodge.\nHere comes your first enemy, a ferocious barbarian.\nWhen in battle you can also type \"Hp\" to see your current hp level. (You start with 50)");
		
		System.out.println("Okay " + charName +" its time to make a battle descicion! Would you like to Slice, Block, or Dogde?");
		
		playFight();
		
		
		
		
		
		
		
		
		
		
	}




	


	
	public String getplayAtt() {
		return playAtt;
	}

	public void setplayAtt(String playAtt) {
		Main.playAtt = playAtt;
	}
	
	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		Main.charName = charName;
	}
	
	public String getYesNo() {
		return yesNo;
		
	}

	private void setYesNo(String yesNo) {
		Main.yesNo = yesNo;

	}
		
		
		
		

	
	
	
	
	public static void main(String[] args) {
		
		
		Main player = new Main();
		
		
		}
	
	
	

}