package week2;

public class Stack_imp {
	static class Stack{
		int size;
		int arr[];
		public Stack(int n) {
			arr=new int[n];
			size=-1;
		}
		public void push(int ele) {
			if(size==arr.length-1) {
				System.out.println("Overflow");
			}
			else {
				arr[size+1]=ele;
				size++;
			}
		}
		public int pop() {
			if(size==-1) {
				System.out.println("Underflow");
				return -1;
			}
			int p= arr[size];
			size--;
			return p;
		}
		public int peek() {
			if(size==-1 ) {
				System.out.println("Underflow");
				return -1;
			}
			return arr[size];
		}
		public boolean isEmpty() {
			if(size==-1) {
				return true;
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack(3);
		System.out.println(st.isEmpty());
		st.push(100);
		st.push(109);
		st.push(101);
		st.push(101);
		System.out.println(st.isEmpty());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}
	
}
