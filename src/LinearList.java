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
		System.out.println();
	}
	public static void main(String[] args) {
		LinearList slist = new LinearList();
		int num; Scanner kybd = new Scanner(System.in);
		while(true) {
			int choice = Integer.parseInt(JOptionPane.showInputDialog("\n\tMake a Selection from the following: "
					+ "\n\t\t1 to Insert into the List"
					+ "\n\t\t2 to Print the Linear List"
					+ "\n\t\t3 to Exit Program"));
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
				System.exit(0);
			default:
				System.out.println("\n\tInvalid Input (Re-Enter Value): ");
			}
		}
	}
}