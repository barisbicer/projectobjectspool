package stack;

import java.util.Stack;

public class Test1 {
	
	public static void printNextGreater(int[] arr) {
		if(arr.length==0) {
			System.out.println();
			return;
		}
		Stack<Integer> s=new Stack<>();
		s.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			int next=arr[i];
			if(!s.isEmpty()) {
				int popped=s.pop();
				while(popped<next) {
					System.out.println(popped +"-->"+next);
					if(s.isEmpty()) {
						break;
					}
				
				  popped=s.pop();
				}
				if(popped>next) {
					s.push(popped);
				}
				
			}
			s.push(next);
			
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop() +"-->" + -1);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNextGreater(new int[] {16,7,2,15});

	}

}
