package ilp037.creational.builder;

public class App {

	public static void main(String[] args) {
		Hero hero = Hero.newBuilder()
						.withArmor(new Armor())
						.withProfession(new Profession())
						.build();
		
		System.out.println(hero);
	}

}
