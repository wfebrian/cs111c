/* 
   Lab B: Linked List Implementation
 */

public class LEntryWayList<T> implements EntryWayListInterface<T> {
	private Node firstNode;
	private Node lastNode;
	private int length;

	public LEntryWayList() {
		clear();
	}

	public final void clear() {
		firstNode = null;
		lastNode = null;
		length = 0;
	}

	/**
	 * Task: Places a new object at beginning of list
	 * 
	 * @param newEntry is a valid object
	 * @return true if insert is successful; false otherwise
	 */
	public boolean insertHead(T newEntry) {
		Node newNode = new Node(newEntry);
		if (isEmpty()) {
			firstNode = newNode;
			lastNode = newNode;
		} else {
			newNode.next = firstNode;
			firstNode = newNode;
		}
		length++;
		return true;
	}

	/**
	 * Task: Places a new object at the end of the list
	 * 
	 * @param newEntry is a valid object
	 * @return true if insertion successful; false otherwise
	 */
	public boolean insertTail(T newEntry) {
		Node newNode = new Node(newEntry);
		if (isEmpty()) {
			firstNode = newNode;
		} else {
			lastNode.next = newNode;
		}
		lastNode = newNode;
		length++;
		return true;
	}

	/**
	 * Task: delete the object at the beginning of the list
	 * 
	 * @return the object that has been deleted
	 */
	public T deleteHead() {
		T result = null;
		if (length >= 1) {
			assert !isEmpty();
			if (length == 1) {
				result = firstNode.data;
				firstNode = null;
				lastNode = null;
			} else {
				result = firstNode.data;
				firstNode = firstNode.next;
			}
			length--;
		}
		return result;
	}

	/**
	 * Task: delete the object at the end of the list
	 * 
	 * @return the object that has been deleted, or null if the list was empty
	 */
	public T deleteTail() {
		T result = null;
		if (length >= 1) {
			assert !isEmpty();
			if (length == 1) {
				result = firstNode.data;
				firstNode = null;
				lastNode = null;
			} else {
				Node nodeBefore = getNodeAt(length - 1);
				Node nodeToRemove = nodeBefore.next;
				nodeBefore.next = null;
				result = nodeToRemove.data;
				lastNode = nodeBefore;
			}
			length--;
		}
		return result;
	}

	/**
	 * Task: display the contents of the list on the console, in order, one per
	 * line
	 */
	public void display() {
		Node currentNode = firstNode;
		while (currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}

	/**
	 * Task: search the list for the given object and return its position in the
	 * list, or -1 if it's not found
	 * 
	 * @param anEntry  is a valid object to find in the list
	 * @return the position of the entry that was found, or -1 if it's not found
	 */
	public int contains(T anEntry) {
		int found = 0;
		Node currentNode = firstNode;

		while (currentNode != null) {
			found++;
			if (anEntry.equals(currentNode.getData())) {
				return found;
			} else {
				currentNode = currentNode.getNext();
			}
		}
		return -1;
	}

	/**
	 * Task: check to see if list is empty
	 * 
	 * @return true if list is empty, false if list contains one or more
	 *         objects.
	 */
	public boolean isEmpty() {
		boolean result;

		if (length == 0) {
			assert firstNode == null;
			result = true;
		} else {
			assert firstNode != null;
			result = false;
		}
		return result;
	}

	/**
	 * Task: check if list is full
	 * 
	 * @return true if list is full, false if list has space for more objects
	 */
	public boolean isFull() {
		return false; // Linked lists always return false
	}

	private Node getNodeAt(int givenPosition) {
		assert !isEmpty()
				&& ((1 <= givenPosition) && (givenPosition <= length));

		Node currentNode = firstNode;
		for (int counter = 1; counter < givenPosition; counter++) {
			currentNode = currentNode.getNext();
		}
		assert currentNode != null;
		return currentNode;
	}

	private class Node {
		private T data;
		private Node next;

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		}

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
