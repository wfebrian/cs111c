public class LabBEntryWayListInterface<T> implements EntryWayListInterface<T> {

	private class Node {
		private T data; // entry in list
		private Node next; // link to next node

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} // end constructor
	} // end Node

	private Node firstNode; // reference to the first Node
	private int length; // number of entries in the list

	public LabBEntryWayListInterface() {
		clear();
	}// end default constructor

	public final void clear() {
		firstNode = null;
		length = 0;
	}// end clear

	public boolean insertHead(T newEntry) {
		// create a new node: newFirstNode
		// newFirstNode links to firstNode
		// assign newFirstNode to firstNode
		Node newFirstNode = new Node(newEntry);
		newFirstNode.next = firstNode;
		firstNode = newFirstNode;
		
		// increase length
		length++;
		return true;
	}

	public boolean insertTail(T newEntry) {

		Node currentNode = firstNode;
		Node newLastNode = new Node(newEntry);

		//if length == 0 and isEmpty
		//double check so everything is correct (use &&)
		if (isEmpty() == true && length == 0) {
			firstNode = newLastNode; //assign the newLastNode to firstNode
		}
		
		//if length != 0 and !isEmpty
		//double check so everything is correct (use &&)
		if (isEmpty() == false && length != 0) {
			//as long as link has not end
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newLastNode;
		}
		//increase length
		length++;
		return true;
	}

	public T deleteHead() {
		assert !isEmpty();
		Node newFirstNode;
		T result = null;

		if (length != 0) {
			if (length == 1) { //if list only have 1 item
				firstNode = null;
				length--; //decrease length
			//	System.out.println("isEmpty value "+ isEmpty());
				return result;
			}
			if (length != 1) { //if list have more than 1 item
				newFirstNode = firstNode.next;
				newFirstNode.next = firstNode.next.next;
				firstNode = newFirstNode;
				length--; //decrease length
			}
		}

		return result;
	}

	public T deleteTail() {
		assert !isEmpty();
		Node newLastNode = null;
		Node currentNode = firstNode;
		Node previousNode = firstNode;

		T result = null;
		for(int i = 1; i<=length; i++){
			if(currentNode.next != null){
			previousNode = currentNode;
			currentNode = currentNode.next;
			newLastNode = previousNode;
			newLastNode.next = currentNode;
//			System.out.print("loop #"+i + ": ");
//			System.out.print("prevNode data is "+ previousNode.data+". ");
//			System.out.println("currentNode data is" +currentNode.data+". ");
//			System.out.println("newlastnode is "+ newLastNode.data);
			}
		}
		newLastNode.next = null; //removing the last node
		
		return result;
	}

	public void display() {
		// iterative
		Node currentNode = firstNode;
		while (currentNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		} // end while

		if(firstNode == null){
			System.out.println("No display -- List is empty.");
		}
	} // end display


	public int contains(T anEntry) {
		
		assert !isEmpty();
		Node currentNode = firstNode;
		int position = -1; //if entry is not found
		
		for(int i = 0; i<length; i++){
			//if currentNode.data is equal to the desired entry.
			if(currentNode.data.equals(anEntry)){
				position = i+1;
				return position;
			}

			currentNode = currentNode.next;

		}
		
		return position;
	}// end contains

	public boolean isEmpty() {
		boolean result;

		if (length == 0) // or getLength() == 0
		{
			assert firstNode == null;
			result = true;
		} else {
			assert firstNode != null;
			result = false;
		} // end if

		return result;
	} // end isEmpty

	public boolean isFull() {
		return false; //using linked list, list is never full
					  //as long as we have enough memory
	} // end isFull


}
