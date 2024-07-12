package ilp037.creational.builder;

public class Hero {
	private Armor armor;
	private Profession profession;
	
	public Hero() { }
	public Hero(Armor armor, Profession profession) {
		this.armor = armor;
		this.profession = profession;
	}
	@Override
	public String toString() {
		return new StringBuilder()
					.append((profession != null)? this.profession : "")
					.append((armor != null)? this.armor : "")
					.toString();
	}
	
	public static Builder newBuilder() {
		return new Hero().new Builder(); //Melhorar
	}
	
 	class Builder {
		private Armor a;
		private Profession p;
		
		public Builder withArmor(Armor armor) {
			this.a = armor;
			return this;
		}
		public Builder withProfession(Profession profession) {
			this.p = profession;
			return this;
		}
		public Hero build() {
			return new Hero(a, p);
		}
	}
}
