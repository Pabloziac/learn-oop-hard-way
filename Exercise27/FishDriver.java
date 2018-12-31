import java.util.ArrayList;

//Commented out sections are for Study Drills
public class FishDriver {
	public static void main( String[] args ) {
	
		String[] names = { "Wanda", "Dory", "Bruce", "Qwerty", "Blinky", "Lenny",
			"Flounder", "Mr. Limpet", "Mrs. Puff", "Moby Dick", "Freddi" };
			
		ArrayList<Fish> school = new ArrayList<Fish>();
		
		//int i = 0;
		for ( String n : names ) {
			/*if(i % 2 == 0) {
				Fish f = new Fish(n, "red");
				school.add(f);
			}
			else {
				Fish f = new Fish(n, "blue");
				school.add(f);
			}
			i++;*/
			Fish f = new Fish(n);
			school.add(f);
		}
		
		for ( Fish f : school ) {
			System.out.println(f);
		}
		
		System.out.println();
		System.out.println(Fish.numCreated() + " Fish objects were created.");
		
	}
}
