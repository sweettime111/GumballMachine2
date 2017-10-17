
public class SoldOutState implements State {
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballmachine){
		
	}
	public void insertQuarter(){
		System.out.println("You inserted a quarter");
	}
	public void ejectQuarter(){
		System.out.println("You haven't inserted a quarter");
	}
	public void turnCrank(){
		System.out.println("You turned, but there's no quarter");
	}
	public void dispense(){
		System.out.println("No gumball dispensed");
	}
	

}
