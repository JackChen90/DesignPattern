package indi.jackc.designPattern.decorator;
/**
 * 
 * @author JackLab
 *
 */
public class DestAddress extends MessageDecorator {

	public DestAddress(Component component) {
		super(component);
	}

	@Override
	public void addMessage(){
		System.out.print("DestAddress(Decorator)->");
		super.addMessage();
	}
}
