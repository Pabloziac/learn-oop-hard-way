public class InterfacePleaser3 implements ArbitraryInterface{
	
	private int num;
	
	public InterfacePleaser3(){
		this(0);
	}
	
	public InterfacePleaser3(int num){
		this.num = num;
	}
	
	public double subNumber(int num){
		double a = this.num - num;
		return a;
	}

	public void doSomething(int n){
		System.out.println("Wew lad");
	}
	
	public double getNumber(){
		return num + 1;
	}
}
