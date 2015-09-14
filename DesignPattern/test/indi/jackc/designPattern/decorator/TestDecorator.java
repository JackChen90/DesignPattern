package indi.jackc.designPattern.decorator;

import org.junit.Test;
public class TestDecorator {

	@Test
	public void test(){
		MessageDecorator md=new DestAddress(new SourAddress(new IPMsg()));
		md.addMessage();
	}
}
