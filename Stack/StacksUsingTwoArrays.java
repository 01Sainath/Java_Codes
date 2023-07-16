import java.util.Scanner;

public class StacksUsingTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		stackArray sa = new stackArray(n);
		int stack1=input.nextInt();
		int stack2=input.nextInt();
		int ele;
		for(int i=0; i<stack1; i++) {
			ele=input.nextInt();
			sa.push1(ele);
		}
		for(int i=0; i<stack2; i++) {
			ele=input.nextInt();
			sa.push2(ele);
		}
		
		System.out.println("Stack1: ");
		sa.print1();
		System.out.println("Stack2: ");
		sa.print2();
		
		sa.push1(15);
		
		int num=sa.top1+1;
		
		while(num!=0) {
			sa.pop1();
			num--;
		}
		sa.pop1();
	}
	
	
	static class stackArray {
		
		public int size;
		public int top1;
		public int top2;
		public int arr[];
		
		stackArray(int n){
			size=n;
			top1=-1;
			top2=size;
			arr=new int[n];
		}
		
		void push1 (int data) {
			if(top2>top1+1) {
				arr[++top1]=data;
			}
			else
				System.out.println("Stack1 overflow.");
		}
		
		void push2 (int data) {
			if(top2>top1+1) {
				arr[--top2]=data;
			}
			else
				System.out.println("Stack2 overflow.");
		}
		
		void pop1() {
			if(top1>-1) {
				int poppedElement = arr[top1--];
				System.out.println("Popped element: "+poppedElement);
			}
			else
				System.out.println("Stack 1 is empty.");
		}
		
		void pop2() {
			if(top2<size) {
				int poppedElement = arr[top2++];
				System.out.println("Popped element: "+poppedElement);
			}
			else
				System.out.println("Stack 2 is empty.");
		}
		
		void print1() {
			for(int i=top1; i>=0; i--) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		void print2() {
			for(int i=top2; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}
