package indi.jackc.designPattern.decorator;
/**
 * 
 * @author JackLab
 *
 */
public abstract class MessageDecorator extends Component {

	private final Component component;
	
	public MessageDecorator(Component component){
		this.component=component;
	}
	@Override
	public void addMessage() {
		this.component.addMessage();
	}

}
