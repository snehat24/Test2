package sne;
import java.util.Stack;
// dis pgm is for implementing stack for int
public class stack {
char C[] = new char[5];
int s[]=new int[5];
int tos;
stack() {
	tos=-1;
}
void push(int item) {
	if(tos==4) {
		System.out.println("stack is full");
	}
	else
		s[++tos]=item;
}
int pop() {
	if(tos==0) {
		return s[tos--];
	}
		else {
		System.out.println("stack is empty");
	    return -1;
}
}
	public static void main(String[] args) {
		Stack s1=new Stack();
		Stack s2=new Stack();
		s1.push(8);
		s1.push(3);
		s2.push("t");
		s2.push("s");
		s2.push("b");
		
		System.out.println(s1.pop());
		System.out.println(s2.pop());
		}
}
