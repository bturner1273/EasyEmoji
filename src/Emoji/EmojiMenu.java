package Emoji;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class EmojiMenu {

	// CREATE AN ENUM WITH A TOSTRING() METHOD THAT OUTPUTS EMOJIS FOR EACH
	// ENUMMERATION!!!
	static boolean done = false;
	static String drink = "🍹";
	static String fries = "🍟";
	static String burrito = "🌯";
	static String hotdog = "🌭";
	static String taco = "🌮";
	static String pasta = "🍝";
	static String ramen = "🍜";
	static String egg = "🍳";
	static String flan = "🍮";
	static String burger = "🍔";
	static String pizza = "🍕";
	static String dollars = "💵";
	static String one = "①";
	static String three = "③";
	static String five = "⑤";
	static String seven = "⑦";

	public static void main(String[] args) {
		System.out.println("\n\n\t\t\t\tWelcome to jEats where you can get your Emoji food quick, easy, and cheap:");

		System.out.println("\n\t\t\t\t\t\t\t\t〽️enu:");
		System.out.println("\n\t\t\t\t\t\tFrench Fries " + fries + dollars + one + "\t Drink " + drink + dollars + one);
		System.out
				.println("\t\t\t\t\t\tBurrito " + burrito + dollars + three + "\t\t Hot Dog " + hotdog + dollars + one);
		System.out.println("\t\t\t\t\t\tTaco " + taco + dollars + one + "\t\t Pasta " + pasta + dollars + seven);
		System.out.println("\t\t\t\t\t\tRamen " + ramen + dollars + five + "\t\t Egg " + egg + dollars + one);
		System.out.println("\t\t\t\t\t\tBurger " + burger + dollars + seven + "\t\t Pizza " + pizza + dollars + three);
		System.out.println("\n\t\t\t\t\t\t\t\tDessert:");
		System.out.println("\t\t\t\t\t\t\t      Flan " + flan + dollars + five);

		getUserInput();
	}

	public static void getUserInput() {
		int ffCount = 0, drinkCount = 0, burritoCount = 0, hdCount = 0, tacoCount = 0, pastaCount = 0, ramenCount = 0,
				eggCount = 0, burgerCount = 0, pizzaCount = 0, flanCount = 0;
		Scanner input = new Scanner(System.in);
		ArrayList<String> orders = new ArrayList<String>();
		System.out.println("\n\t\t\t\tFor 🍟 enter (French Fries) and the same goes for all other menu items ");
		System.out.println("\t\t\t\t\tIf you are finished ordering simply enter (done):");
		System.out.println("\n\t\t\t\t\t\t    What would you like to eat?\n");
		while (!done) {
			String x = "";
			while (!(x.equals("french fries") || x.equals("drink") || x.equals("burrito") || x.equals("hot dog")
					|| x.equals("taco") || x.equals("pasta") || x.equals("ramen") || x.equals("egg")
					|| x.equals("burger") || x.equals("pizza") || x.equals("flan") || x.equals("done")
					|| x.equals("fries"))) {
				System.out.print("\t\t\t\t\tPlease enter an item from the menu selection: ");
				x = input.nextLine();
				x = x.toLowerCase();
			}
			if (x.equals("french fries") || x.equals("fries")) {
				orders.add(fries);
				ffCount++;
			}
			if (x.equals("drink")) {
				orders.add(drink);
				drinkCount++;
			}
			if (x.equals("burrito")) {
				orders.add(burrito);
				burritoCount++;
			}
			if (x.equals("hot dog")) {
				orders.add(hotdog);
				hdCount++;
			}
			if (x.equals("taco")) {
				orders.add(taco);
				tacoCount++;
			}
			if (x.equals("pasta")) {
				orders.add(pasta);
				pastaCount++;
			}
			if (x.equals("ramen")) {
				orders.add(ramen);
				ramenCount++;
			}
			if (x.equals("egg")) {
				orders.add(egg);
				eggCount++;
			}
			if (x.equals("burger")) {
				orders.add(burger);
				burgerCount++;
			}
			if (x.equals("pizza")) {
				orders.add(pizza);
				pizzaCount++;
			}
			if (x.equals("flan")) {
				orders.add(flan);
				flanCount++;
			}
			if (x.equals("done")) {
				System.out.println("\n\t\t\t\t\t\t\tYour order:");
				System.out.println("\n\t\t\t\t\t\t\t" + orders + "\n");
				int[] orderCounts = { ffCount, drinkCount, burritoCount, hdCount, tacoCount, pastaCount, ramenCount,
						eggCount, burgerCount, pizzaCount, flanCount };
				int total = 0;
				for (int i = 0; i < orderCounts.length; i++) {
					if (orderCounts[i] != 0) {
						if (i == 0) {
							System.out.println("\t\t\t\t\t\t\t" + fries + " x" + ffCount + " $" + (ffCount));
							total += 1;
						}
						if (i == 1) {
							System.out.println("\t\t\t\t\t\t\t" + drink + " x" + drinkCount + " $" + (drinkCount));
							total += 1;
						}
						if (i == 2) {
							System.out.println(
									"\t\t\t\t\t\t\t" + burrito + " x" + burritoCount + " $" + (burritoCount * 3));
							total += 3;
						}
						if (i == 3) {
							System.out.println("\t\t\t\t\t\t\t" + hotdog + " x" + hdCount + " $" + (hdCount));
							total += 1;
						}
						if (i == 4) {
							System.out.println("\t\t\t\t\t\t\t" + taco + " x" + tacoCount + " $" + (tacoCount));
							total += 1;
						}
						if (i == 5) {
							System.out.println("\t\t\t\t\t\t\t" + pasta + " x" + pastaCount + " $" + (pastaCount * 7));
							total += 7;
						}
						if (i == 6) {
							System.out.println("\t\t\t\t\t\t\t" + ramen + " x" + ramenCount + " $" + (ramenCount * 5));
							total += 5;
						}
						if (i == 7) {
							System.out.println("\t\t\t\t\t\t\t" + egg + " x" + eggCount + " $" + (eggCount));
							total += 1;
						}
						if (i == 8) {
							System.out
									.println("\t\t\t\t\t\t\t" + burger + " x" + burgerCount + " $" + (burgerCount * 7));
							total += 7;
						}
						if (i == 9) {
							System.out.println("\t\t\t\t\t\t\t" + pizza + " x" + pizzaCount + " $" + (pizzaCount * 3));
							total += 3;
						}
						if (i == 10) {
							System.out.println("\t\t\t\t\t\t\t" + flan + " x" + flanCount + " $" + (flanCount * 5));
							total += 5;
						}
					}
				}
				System.out.println("\t\t\t\t\t\t\tYour total is: $" + total);
				total = 0;
				orders.clear();
				ffCount = 0;
				drinkCount = 0;
				burritoCount = 0;
				hdCount = 0;
				tacoCount = 0;
				pastaCount = 0;
				ramenCount = 0;
				eggCount = 0;
				burgerCount = 0;
				pizzaCount = 0;
				flanCount = 0;
				try {
					TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("\n\t\t\t\t\t\t\t\tNEXT!!!\n");

			}
		}

	}

}
