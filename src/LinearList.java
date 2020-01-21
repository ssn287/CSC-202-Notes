import java.util.Scanner;
import javax.swing.JOptionPane;
public class LinearList {
	class Node {
		int data;
		Node next;
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
//	public void initializeList(int item) {
//		Node current = head;
//		while(item > 0) {
//			current.data = (int)(Math.random() * 100);
//			current = current.next;
//			item--;
//		}
//	}
	public void InsertNode(int d) {
		//create a new Node
		Node newNode = new Node(d);
		//check if the list is empty
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			//if list is not empty, tail and head will point to newNode
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("\n\tThe List is Empty");
			return;
		}
		System.out.print("\n\tThese are the Nodes of the Singly Linked List: ");
		while(current != null) {
			System.out.print(" " + current.data);
			current = current.next;
		}
	}
	public double sum() {
		Node current = head; double sum = 0;
		if(head == null) {
			System.out.print("\n\tThe List is Empty");
			return 0;
		}
		while(current != null) {
			sum += current.data;
			current = current.next;
		}
		System.out.println();
		return sum;
	}
	public int largest() {
		Node current = head;
		int large = current.data;
		if(head == null) {
			System.out.print("\n\tThe List is Empty");
			return 0;
		}
		while(current != null) {
			if(current.data >= large) {
				large = current.data;
			}
			current = current.next;
		}
		System.out.println();
		return large;
	}
	public static void main(String[] args) {
		LinearList slist = new LinearList();
		int num; Scanner kybd = new Scanner(System.in);
//		slist.initializeList(5);
		while(true) {
			int choice = Integer.parseInt(JOptionPane.showInputDialog("\n\tMake a Selection from the following: "
					+ "\n\t\t1 to Insert into the List"
					+ "\n\t\t2 to Print the Linear List"
					+ "\n\t\t3 to Calculate the Sum"
					+ "\n\t\t4 to Find the Largest Element"
					+ "\n\t\t5 to Exit Program"));
			switch(choice) {
			case 1:
				System.out.print("\n\tEnter an Integer Number (e.g. 34): ");
				num = kybd.nextInt();
				slist.InsertNode(num);
				break;
			case 2:
				slist.display();
				break;
			case 3:
				System.out.print("\n\tThe Sum of the List Elements is: " + slist.sum());
				break;
			case 4:
				System.out.print("\n\tThe Largest Element is: " + slist.largest());
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("\n\tInvalid Input (Re-Enter Value): ");
			}
		}
	}
}