package program.jav.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamp {

	public static void main(String[] args) {
	
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add(20);
		q.add(30);
		q.add(55);
		q.add(60);
		
		System.out.println("queue is" + q);
		
		System.out.println(q.peek()); // print the top elemnt of the queue
		
		System.out.println(q.poll());  // it will retrieve the element and will will remove the element as well.
		
		
		System.out.println(q.peek());
		
		System.out.println("queue is" + q);
		
		System.out.println("it contains 55 value or not "+ q.contains(55));
		
		System.out.println("hascode"+ q.hashCode());
		
		System.out.println("remove the pbject from the quque" +q.remove(60));
		

	}

}
