package indi.jackc.designPattern.strategy;

public class Client {
	public Logging logging;
	public Client(Logging logging){
		this.logging=logging;
	}
	
	public void doWork(final int number){
		if(number%2==0)
			logging.write("Even number: "+number);
	}
}
