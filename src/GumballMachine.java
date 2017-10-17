
public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldState;
	int count = 0;
	
	public GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if (numberGumballs > 0) {
				state = noQuarterState;
		}
	}
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	void setState(State state){
		this.state = state;
	}
	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot ...");
		if (count != 0){
			count = count - 1;
		}
	}
	public State getSoldOutState(){
		return soldOutState;
	}
	public State getHasQuarterState(){
		return hasQuarterState;
	}
	public State  getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}
	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}
	public int getCount(){
		return count;
	}
	public String toString(){
		String status = "GumballMachine";
		if (state == hasQuarterState){
	  status = status+ "\n status : HAS QUARTER";
		}
		 else if(state == noQuarterState){
			 status =status+ "\n status : No QUARTER";
		 } 
		 else if(state == soldOutState){
			 status =status+ "\n status : SOLD";
		 }
		 else if(state == soldOutState){
			 status =status+ "\n status : SOLD OUT";
		 } 
		status = status+ "\n status : "+this.count;
		 return status;
	
	}

}
