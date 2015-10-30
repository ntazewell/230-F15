package submission;

import adt.Stack;

public class ArrayStack<T> implements Stack<T> {
	private T[] data;
	private int top;

	@Override
	public void push(T newEntry) {
			bag[data] = newEntry;
			top++;
			}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		T temp = bag[data];
		bag[data] = null;
		top--;
		return temp;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return bag[top];
	}

	@Override
	public boolean isEmpty() {
		 if(top != 0) {
		// TODO Auto-generated method stub
		return false;
		 }
		 return true
	}

	@Override
	public void clear() {
		for(int i = top; i>=0; i--)
			bag[top] = null;
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		String s = "";
		for (int i = top; i >= 0; i--)
			s += "| " + data[i] + " |\n";
		s+= "+++++\n";
		return s;
	}

}
