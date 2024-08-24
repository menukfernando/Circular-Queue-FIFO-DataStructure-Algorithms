/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menuk Fernando
 */
public class CircularQueue {
	int front;
	int rear;
	int QueueArray[];
	int numberOfElements;
	int maxSize;

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		numberOfElements = 0;
		QueueArray = new int[maxSize];
	}

	void Insert (int value) {
		if(numberOfElements == maxSize) {
			System.out.println("Queue Array is Full");
		}else{
			
			if (rear == maxSize - 1) {	
				rear = -1;
			}

			System.out.println("Front Value: "+QueueArray[front]);
			numberOfElements++;
			QueueArray[++rear] = value;
			System.out.println("Value "+ value + " Inserted to the Array");
		}
	}

	void Remove() {
		if(numberOfElements == 0) {
			System.out.println("Queue is Empty");
		}else {
			
			if (front == maxSize - 1) {
				front = 0;
			} 
			
			numberOfElements--;
			System.out.println("Value "+QueueArray[front++]+" is Removed");
			System.out.print("Existing Array: ");
			for (int i = front; i <= rear; i++) {
                		System.out.print(QueueArray[i] + " ");
            		}

            		System.out.println();	
		}
	}

	void PeekFront() {
		if(numberOfElements == 0) {
			System.out.println("Queue is Empty");
		}else {
			System.out.println("Front Value is " + QueueArray[front]);
		}
	}

	public static void main(String args[]) {
		CircularQueue queue = new CircularQueue(5);
	
		queue.Remove();
		System.out.println("------------------");

		queue.Insert(10);
        	queue.Insert(20);
        	queue.Insert(30);
        	queue.Insert(40);
        	queue.Insert(50);
        
        	System.out.println("");
        
        	queue.PeekFront();
        
        	System.out.println("");
        
        	queue.Remove();
        	queue.PeekFront();
        	System.out.println("");
        
        	queue.Remove();
        	queue.PeekFront();
        	System.out.println("");
        
        	queue.Remove();
        	queue.PeekFront();
        	System.out.println("");
        
        	queue.Remove();
        	queue.PeekFront();
        	System.out.println("");
        	
		queue.Insert(60);
		System.out.println("");
        	queue.Insert(70);
		System.out.println("");
        	queue.Insert(80);
		System.out.println("");
		queue.Insert(90);
		System.out.println("");

		queue.Remove();
		System.out.println("");
		queue.Insert(100);

		System.out.println("");
		queue.Remove();
		System.out.println("");

	}
}
