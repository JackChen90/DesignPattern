package indi.jackc.designPattern.template;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class TestStack {

	LinkedList<Integer> testList = new LinkedList<Integer>();

	@Before
	public void setValue() {
		for (int i = 1; i <= 10; i++)
			this.testList.add(i);
	}

	@Test
	public void evenFilter() {
		Stack s = new Stack(this.testList);
		s=s.filter(new StackFilter() {
			@Override
			public boolean isValid(int i) {
				if (i % 2 == 0)
					return true;
				else
					return false;
			}
		});
		
		assertEquals(10,s.pop());
		assertEquals(8,s.pop());
	}
	
	@Test
	public void oddFilter() {
		Stack s = new Stack(this.testList);
		s=s.filter(new StackFilter() {
			@Override
			public boolean isValid(int i) {
				if (i % 2 == 1)
					return true;
				else
					return false;
			}
		});
		
		assertEquals(9,s.pop());
		assertEquals(7,s.pop());
	}
}
