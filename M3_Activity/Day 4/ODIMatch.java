public class ODIMatch extends Match {

	public ODIMatch() {
		super();
		
		
	}



	
	float calculateRunRate() {
		
		return ((getTarget()-getCurrentScore())/(50-getCurrentOver()));
		
	}

	
	float calculateBalls() {
		
		
		return 6*(50-getCurrentOver());
	}
	
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}