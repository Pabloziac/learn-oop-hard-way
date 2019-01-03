// DOES NOT COMPILE
public class BadDoor extends AbstractDoor {
	public BadDoor(boolean b) { super(b); }
	
	@Override
	public String toString() {
		return "The bad door is " + (isOpen ? "open." : "closed.");
	}
}
