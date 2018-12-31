//Comments for study drills
public class Fish {
	//private String color;
	private String name;
	private int id;
	private static int count = 0;
	
	public Fish( String name/*, String color*/) {
		this.name = name;
		count++;
		id = count;
		//this.color = color;
	}
	
	public String toString() {
		//return name + ", a " + color +  " fish #" + id + " of " + count;
		return name + ", fish #" + id + " of " + count;
	}
	
	public static int numCreated() {
		return count;
	}
}
