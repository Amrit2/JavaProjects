package game;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Employee implements Comparable<Employee>{
	private String name;
	public Integer idNumber;
	
	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
	}
	
	public String toString() {
		return this.name + ": " + idNumber;
	}
	
	@Override
	public int compareTo(Employee o) {
		return this.idNumber.compareTo(o.idNumber);
	}
	
	public static void main (String[] args) {
		PriorityQueue<Employee> queue = new PriorityQueue<Employee>();
		queue.add(new Employee("Carl", 2));
		queue.add(new Employee("Alice", 1));
		queue.add(new Employee("Bob", 3));
		queue.add(new Employee("Danny", 4));
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue);
		
	}
}
