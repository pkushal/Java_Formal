
public class OverridingDemo {

	public static void main(String[] args) {
		Area area = new Area(); //This is Super class Object
		
		Rectangle rec = new Rectangle(); //This is a Sub Class Object
		Square sq = new Square(); //This is a Sub CLass Object
		
		rec.calculateArea(); //The calculateArea method of Rectangle class is called
		sq.calculateArea(); //The result is Good
	}
}
