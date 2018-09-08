import java.util.*;



public class Main {
	//test 2.0
	
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static String cont;
	public static String charName;
	public static String yesNo;
	private static String playAtt;
	static int fightEnemy;
	int tutorial = 1;
	
	
	 //Barbarian
	static int ranhpBar;
	static int hpBar = 0;
	
	
	//Knight
	static int ranhpKnight;
	int hpKnight;
	
	
	//for random attack
	static int setfite;
	//For Player
	final static int maxPlayHp = 15;
	int playHp = 15;
	int playChoice;
	int potionCount = 3;
	
	
	//Player
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
			
			if (playAtt.equalsIgnoreCase("parry")) {
				
				System.out.println("You bring up your sword ready to counter.");
				playChoice = 3;
				break;
			}
			
			
			
			if (playAtt.equalsIgnoreCase("Potion") || playAtt.equalsIgnoreCase("Hp")) {
				
				
				if(playAtt.equalsIgnoreCase("Potion") && potionCount > 0) {
					potionCount = potionCount - 1;
					playHp = playHp + 5; 
					System.out.println("You decide to quickly use a potion and heal 5 hp.");
					playChoice = 5;
					break;
						
				}
				
				if(playAtt.equalsIgnoreCase("Potion") && potionCount <= 0) {
					System.out.println("You do not have any potions!");
				}
				
				if (playAtt.equalsIgnoreCase("hp")) {
					System.out.println("Your current hp is " + playHp + ". Now, What would you like to do?");
					 
				}
				
				
	
				
			}
			
			
			
			else {
				System.out.println("You freeze up at the heat of battle (or just spelled something wrong) is going to cost you!");
				playChoice = 4;
				
				break;
			}
			
			
			
		}
		
		
		
	}
	
	
	
	}
	

	static void ranFite() {
	setfite = ((int )(Math.random() * 100 + 1));
	Random rand = new Random();
	rand.ints();
	
	}
	
	//Barbarian
	static void enemyBar() {
		
		
		
		ranhpBar = hpBar ;
		
		ranFite();
		//Attack
		if(setfite <= 66) {
			System.out.println("The barbarian atempts the bring his powerful club down on your head!!");
			fightEnemy = 1;
			
		}
		//Block
		else if(setfite <= 92 && setfite >= 66 ) {
			System.out.println("Without hesitation the barbarian brings his arms up to block.");
			fightEnemy = 2;
			
		}
		
		//Parry
		else if(setfite > 92){
			System.out.println("The barbarian is expecting an attack. He prepairs to counter!");
			fightEnemy = 3;
			
		}
		//hesitate
		else {
			System.out.println("The barbarian hesitates leaving him wide open for an attack!");
			
			fightEnemy = 4;
		}
		
		
	}
	

	public void playTurnBar() {
		
		
		
		
		if (playChoice == 1 && fightEnemy == 1){
			 playHp = playHp - 2;
			 hpBar = hpBar - 2;				
			System.out.println("You and the Barbarian both deal extream blows to each other. Both take 2 damage. The barbarian has " + hpBar +" Hp remaining.");
		}
		
		if (playChoice == 1 && fightEnemy == 2){
			hpBar = hpBar - 1;
			System.out.println("The Barbarian braces and absorb most of your attack. The barbarian takes 1 damage. The barbarian has " + hpBar +" Hp remaining.");
			
				
		}
		
		if (playChoice == 1 && fightEnemy == 3){
			playHp = playHp - 2;
			System.out.println("The barbarian knocks your sword away and is able to land a blow. You take 2 damage.");
			
			 	
		}
		
		if (playChoice == 1 && fightEnemy == 4){
			hpBar = hpBar - 3;
			System.out.println("Seeing your chance to strike. Making the most of it. Dealing 3 damage to the Barbarian. The barbarian has " + hpBar +" Hp remaining.");
				
		}
		
		if (playChoice == 2 && fightEnemy == 1){
			playHp = playHp - 1;
			System.out.println("You lift your shield, though the powerful strike of the barbarian breaks through. You take 1 damage.");
			
			 
		}
		
		if (playChoice == 2 && fightEnemy == 2){
			
			System.out.println("You both prepair for an attack, yet no one strikes. No damage is taken.");
			
		}
		
		if (playChoice == 2 && fightEnemy == 3){
			System.out.println("The Barbarian atempts to parry an attack. You manage to block his actions. No damage is taken.");
				
		}
		
		if (playChoice == 2 && fightEnemy == 4){
			System.out.println("You Prepair for an attack. Although one does not come. No damage is taken.");
				
		}
		
		if (playChoice == 3 && fightEnemy == 1){
			 hpBar = hpBar - 2; 
			System.out.println("You are able to use the barbarians momentum against him. Dealing 2 damage to the barbariian. The barbarian has " + hpBar + " Hp remaining.");
			
				
		}
		
		if (playChoice == 3 && fightEnemy == 2){
			System.out.println("In your atempt to counter attack you are blocked by the barbarian. Who was bracing himself. No damage is taken.");
				
		}
		
		if (playChoice == 3 && fightEnemy == 3){
			playHp = playHp - 1;
			hpBar = hpBar - 1;
			System.out.println("You and the Barbarian, both atempt to warp off anothers attack. You and the barbarian both take 1 damage. The barbarian has " + hpBar +" Hp remaining.");
			
		}
		
		if (playChoice == 3 && fightEnemy == 4){
			 hpBar = hpBar - 2;
			System.out.println("You see your opurtunity and are able to get a blow off. Dealing 2 damage to the barbarian. The barbarian has " + hpBar +" Hp remaining.");
				
		}
		
		if (playChoice == 4 && fightEnemy == 1){
			playHp = playHp - 3;
			System.out.println("The barbarian does not show mercy and deals a heavy attack. You take 3 damage.");
			
		}
		
		if (playChoice == 4 && fightEnemy == 2){
			System.out.println("Although you do absolutly nothing the barbarian braces for a trick attack. No damage is taken");
			
		}
		
		if (playChoice == 4 && fightEnemy == 3){
			playHp = playHp - 2;
			System.out.println("The barbarian readys to ward off an attack, yet sees his oppurtunity and strikes. You take 2 damage.");
			
		}
		
		if (playChoice == 4 && fightEnemy == 4){
			System.out.println("You and your enemy kinda just look at each other... Awkward.");
			
		}
		
		if (playChoice == 5 && fightEnemy == 1){
			playHp = playHp - 2;
			System.out.println("After using a potion the barbarian strikes you. You take 2 damage.");
			
		}
		
		if (playChoice == 5 && fightEnemy == 2){
			System.out.println("The barbarian atempts to block an attack even though you used a potion. No damage taken.");
			
		}
		
		if (playChoice == 5 && fightEnemy == 3){
			playHp = playHp - 2;
			System.out.println("The barbarian readys to ward off an attack, although you decided to use a potion. No damage taken.");
			
		}
		
		if (playChoice == 5 && fightEnemy == 4){
			System.out.println("You are too busy drinking a potion to take advantage of the situation at hand. No damage taken.");
			
		}
		
		
	}

	public void tutorialFight() {
			
		
		while (tutorial == 1) {
		playFight();
		enemyBar();	
		playTurnBar();
			
		
			while(playHp <= 0) {
				
				tutorial = 0;
				System.out.println("\n\nYour hp has reached 0. You have faced a terrible fate. Lets give it another shot. Type \"continue\" to try again.");
				playHp = 15;
					
				while (userInput.hasNextLine()) {
						this.setcont(userInput.nextLine());
						
							if(cont.equalsIgnoreCase("continue")) {
							tutorial = 1;
							System.out.println("Okay " + charName +" lets try this again! Would you like to Slice, Block, Parry, or use a Potion?");
							break;
					
					}
							else {
							System.out.println("Type \"continue\" to try again.");		
					}
				}
			}
		
			if(hpBar <= 0) {
				System.out.println("The barbarian falls defeated. Congratulations! You have defeated your first enemy.");
				tutorial = 2;
				
			}
		
		
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
				+ "\nSlice, Block, Parry, or use a Potion.\nHere comes your first enemy, a ferocious barbarian.\nWhen in battle you can also type \"Hp\" to see your current hp level. (You start with 50)");
		
		System.out.println("Okay " + charName +" its time to make a battle descicion! Would you like to Slice, Block, Parry, or use a Potion?");
		
		
		
		ranhpBar = ((int )(Math.random() * 25 + 10));
		hpBar = ranhpBar;
		tutorialFight();
		
		
		
		
		
	}




	


	
	
	public String getcont() {
		return cont;
	}
	
	public void setcont(String cont) {
		Main.cont = cont;
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