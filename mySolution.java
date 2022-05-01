package machine;
import java.util.Scanner;
import static java.lang.Math.min;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// For the espresso, 
// the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.

// And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
// At the start, the coffee machine has $550, 400 ml of water, 540 ml of milk, 120 g of coffee beans, and 9 disposable cups.
        int mlOfWater = 400;
        int mlOfMilk = 540;
        int gOfCoffeeBeans = 120;
        int disposableCups = 9;
        int money = 550;
        boolean yes = true; 
				
				while(yes) {
					System.out.println("Write action(buy, fill, take, remaining, exit)");
					String action = scanner.nextLine();
					boolean other = true;
					
					while(other) {
						if (action.equals("buy")) {
								System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
								String coffeeType = scanner.next();

								if (coffeeType.equals("1")) {
										if (mlOfWater >= 250 && gOfCoffeeBeans >= 16 && money >= 4) {
											System.out.println("I have enough resources, making you a coffee!");
										} else if (mlOfWater < 250) {
											System.out.println("Sorry, not enough water!");
										} else if (gOfCoffeeBeans < 16) {
											System.out.println("Sorry, not enough coffee beans!");
										} else if (money < 4) {
											System.out.println("Sorry, not enough money!");
										}
	// For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.

								} else if (coffeeType.equals("2")) {
										if (mlOfWater >= 350 && mlOfMilk >= 75 && gOfCoffeeBeans >= 20 && money >= 7) {
											System.out.println("I have enough resources, making you a coffee!");
										} else if (mlOfWater < 350) {
											System.out.println("Sorry, not enough water!");
										} else if (mlOfMilk < 75) {
											System.out.println("Sorry, not enough milk!");
										} else if (gOfCoffeeBeans < 20) {
											System.out.println("Sorry, not enough coffee beans!");
										} else if (money < 7) {
											System.out.println("Sorry, not enough money!");
										}
										// And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6.
								} else if (coffeeType.equals("3")) {
										if (mlOfWater >= 200 && mlOfMilk >= 100 && gOfCoffeeBeans >= 12 && money >= 6) {
											System.out.println("I have enough resources, making you a coffee!");
										} else if (mlOfWater < 200) {
											System.out.println("Sorry, not enough water!");
										} else if (mlOfMilk < 100) {
											System.out.println("Sorry, not enough milk!");
										} else if (gOfCoffeeBeans < 12) {
											System.out.println("Sorry, not enough coffee beans!");
										} else if (money < 6) {
											System.out.println("Sorry, not enough money!");
										}
								} else if (coffeeType.equals("back")) {
								//blah
									break; 
								}
						} else if (action.equals("fill")) {
								System.out.println("Write how many ml of water you want to add: ");
								int addWater = scanner.nextInt();
								System.out.println("Write how many ml of milk you want to add: ");
								int addMilk = scanner.nextInt();
								System.out.println("Write how many grams of coffee beans you want to add: ");
								int addCoffeeBeans = scanner.nextInt();
								System.out.println("Write how many disposable cups of coffee you want to add: ");
								int addCups = scanner.nextInt();

								mlOfWater = mlOfWater + addWater;
								mlOfMilk = mlOfMilk + addMilk;
								gOfCoffeeBeans = gOfCoffeeBeans + addCoffeeBeans;
								disposableCups = disposableCups + addCups; 

								System.out.println("The coffee machine has: ");
								System.out.println( mlOfWater + " ml of water");
								System.out.println( mlOfMilk + " ml of milk");
								System.out.println( gOfCoffeeBeans + " g of coffee beans");
								System.out.println( disposableCups + " disposable cups");
								System.out.println("$" + money + " of money");

						} else if (action.equals("take")) {
								System.out.println("\nI gave you $" + money);
								money = 0;
						} else if (action.equals("remaining")) {
								System.out.println("The coffee machine has: ");
								System.out.println( mlOfWater + " ml of water");
								System.out.println( mlOfMilk + " ml of milk");
								System.out.println( gOfCoffeeBeans + " g of coffee beans");
								System.out.println( disposableCups + " disposable cups");
								System.out.println("$" + money + " of money");
						} else if (action.equals("exit")) {
							yes = false; 
							break;
						}
						
					} // other while loop
					
				} //yes while loop
    }
}
 //200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.
