package indi.jackc.designPattern.decorator;
/**
 * 
 * @author JackLab
 *
 */
public class SourAddress extends MessageDecorator {

	public SourAddress(Component component) {
		super(component);
	}

	@Override
	public void addMessage(){
		System.out.print("SourAddress(Decorator)->");
		super.addMessage();
	}
}
