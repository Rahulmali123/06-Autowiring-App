package in.ashokait;

public class Car {
	// variable
	private DieselEngine dieselEngine;

	public Car() 
	{
		System.out.println("Car::Constructor default ");
	}
	
	  public Car(DieselEngine dieselEngine) 
	  {
			 this.dieselEngine = dieselEngine; 
	        System.out.println("Car::Constructor Param ");
	    }

	public void setDieselEngine(DieselEngine dieselEngine) 
	{
		System.out.println("SetdieselEngine:: excuted...");
		this.dieselEngine = dieselEngine;
	}

	public void drive() 
	{
		int start = dieselEngine.start();
		if (start >= 1) {
			System.out.println("Journey Started");
		} else {
			System.out.println("Engine Failed to start..!!");
		}

	}

}
