package abstractprograms;

public class Duke extends Bike {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duke obj = new Duke();
		obj.seat();
		obj.handle();
		obj.engine();
		obj.wheels();
		}
	
	@Override
	public void wheels() {
	        System.out.println("Bikes have wheels");
		
	}

	@Override
	public void engine () {
	        System.out.println("Bikes have engine");
		
	}
	
}


