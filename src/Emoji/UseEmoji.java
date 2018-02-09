package Emoji;

public class UseEmoji {

	public static void main(String[] args){
		System.out.println(Emoji.BURGER + " and a " + Emoji.DRINK + " is " + Emoji.DOLLARS + Emoji.SEVEN);
	}

public enum Emoji {
	BURGER, BURRITO, DOLLARS, DRINK, EGG, FIVE, FLAN, FRIES, HOTDOG, ONE, PASTA, PIZZA, RAMEN, SEVEN, TACO, THREE;

	@Override
	public String toString(){
		switch(this){
		case BURGER:
			return "🍔";
		case BURRITO:
			return "🌯";
		case DOLLARS:
			return "💵";
		case DRINK:
			return "🍹";
		case EGG:
			return "🍳";
		case FIVE:
			return "⑤";
		case FLAN:
			return "🍮";
		case FRIES:
			return "🍟";
		case HOTDOG:
			return "🌭";
		case ONE:
			return "①";
		case PASTA:
			return "🍝";
		case PIZZA:
			return "🍕";
		case RAMEN:
			return "🍜";
		case SEVEN:
			return "⑦";
		case TACO:
			return "🌮";
		case THREE:
			return "③";
		default:
			return "";
		}
	}
}


}
