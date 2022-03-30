package 두잇자바;

public class Queue_class {

	public static class Queue {
		private int max ;
		private int [] stk;
		private int front;
		private int rear;
		private int num;
		
		
		public Queue(int capacity) {
			max = capacity;
			stk = new int[max];	
		}
		
		public void inqueue(int x) {
			
			stk[rear] = x;
			rear ++;
		}
		public int dequeue() {
			if(front > rear) System.out.println("이 배열은 가득차있습니다. ");
			
			front++;
			return stk[front-1];
		}
		
	}
	public static void main(String[] args) {
		Queue a = new Queue(10);
		
		a.inqueue(100);
		int x = a.dequeue();
		System.out.println(x);

	}

}
