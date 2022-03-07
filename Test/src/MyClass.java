
abstract class Bike{
	
   public abstract void run();
	
	public void fast() {
		System.out.println("Test");
	}
}



class Singleton extends Bike implements TestI{

	private static Singleton  singleton = new Singleton();
	
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
	
	private  Singleton() {
		
	}
	  

	@Override
	public void run() {
		System.out.println("Test Main");
		
	}

	
}

public class MyClass  extends Bike {
	
	private int a;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike a=new MyClass();

			
			
			
		};
		

	}



	


