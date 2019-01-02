public class Dude {
	private int age;
	private String name;
	private double weight;
	
	public Dude(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if ( obj == null )
			return false; //if there be no dude
		Dude other = null;
		try {
			other = (Dude)obj;
		}
		catch ( ClassCastException e ) {
			return false; //if the dude is not the 'dude'
		}
		return ( this.age == other.age && this.name.equals(other.name) &&
				 weightEquals(other) );
	}
	
	private boolean weightEquals(Dude other) {
		double a = this.weight;
		double b = other.weight;
		return (Math.abs(a - b) <= 0.01) ? true : false;
	}
	
	@Override
	public String toString() {
		return name + "|" + age + "|" + weight;
	}
}
