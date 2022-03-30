package 두잇자바;

public class stack_ex {

	public static class stack {
		private static int max;
		private static int ptr;
		private static int[] stk;
		
		
		
		public stack (int capacity) {
			ptr = 0 ;
			max = capacity;
			
			try {
				stk = new int[max];
			}catch(OutOfMemoryError e) {
				max = 0;
			}
		}
		static void push(int e) {
			stk[ptr] = e;
			ptr++;
			
		}
		static int pop() {
			
			ptr--;
			return stk[ptr+1];
			
		}
		
		static int peek() {
			
			
			return stk[ptr];
		}
		static int indexOf(int ky) {
			
			for(int i = 0 ; i < stk.length; i++) {
				if(ky == stk[i] ) return i;
			}
			return -1;
		}
		static void clear() {
			
			for(int i = 0; i < stk.length; i ++) {
				stk[i] = 0;
			}
			ptr = 0;
			
		}
		static int size() {
			return ptr;
		}
		static boolean IsEmpty() {
			
			if(ptr == 0) return true;
			
			return false;
		}
		static boolean IsFull() {
			
			if(ptr == max) return true;
			return false;
			
		}
		static int capacity() {
			return max;
		}
		
		static void dump() {
			if(ptr <= 0) System.out.println("이 스택은 비어있습니다");
			else {
				for(int i = 0; i < stk.length; i ++) {
					System.out.println(stk[i] + " ");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		stack a = new stack(10);
		
		
		a.push(10);
		a.push(0);
		int x= a.pop();
		System.out.println(x);
		a.push(100);
		a.push(200);
		a.push(300);
		a.dump();
		
		

	}

}
