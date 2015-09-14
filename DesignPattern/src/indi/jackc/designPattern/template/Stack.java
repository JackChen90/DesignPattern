package indi.jackc.designPattern.template;

import java.util.LinkedList;

public class Stack {

	private final LinkedList<Integer> stack;
	
	public Stack(){
		this.stack=new LinkedList<Integer>();
	}
	
	public Stack(LinkedList<Integer> stack){
		this.stack=stack;
	}
	
	public void push(Integer value){
		stack.add(0, value);
	}
	
	public int pop(){
		return stack.remove(0);
	}
	
	public Stack filter(final StackFilter filter){
		final LinkedList<Integer> initialStack=new LinkedList<Integer>();
		for(Integer i: this.stack){
			if(filter.isValid(i))
				initialStack.add(0, i);
		}
		return new Stack(initialStack);
	}
}
