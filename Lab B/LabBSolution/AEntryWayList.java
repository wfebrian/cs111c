/* 
   Lab B: Array Implementation
 */

public class AEntryWayList<Comparable> implements
		EntryWayListInterface<Comparable> {

	private Comparable[] entry;
	private int length;
	private static final int DEFAULT_LENGTH = 50;

	public AEntryWayList() {
		this(DEFAULT_LENGTH);
	}

	public AEntryWayList(int maxSize) {
		length = 0;
		entry = (Comparable[]) new Object[maxSize];
	}

	/**
	 * Task: adds newEntry to the head of the list
	 * 
	 * @param newEntry an object
	 * @return true if successful
	 */
	public boolean insertHead(Comparable newEntry) {
		if (isFull())
			return false;
		else {
			for (int i = length; i >= 1; i--)
				entry[i] = entry[i - 1];
			entry[0] = newEntry;
			length++;
			return true;
		}
	}

	/**
	 * Task: adds newEntry to the tail of the list
	 * 
	 * @param newEntry an object
	 * @return true if successful
	 */
	public boolean insertTail(Comparable newEntry) {
		if (isFull())
			return false;
		else {
			entry[length] = newEntry;
			length++;
			return true;
		}
	}

	/**
	 * Task: removes the first entry from the list
	 * 
	 * @param NONE
	 * @return the object that has been deleted
	 */
	public Comparable deleteHead() {
		length--;
		Comparable objToDelete = entry[0];
		for (int i = 0; i < length; i++)
			entry[i] = entry[i + 1];
		return objToDelete;
	}

	/**
	 * Task: removes the last entry from the list
	 * 
	 * @param NONE
	 * @return reference to the tail, null if list is empty
	 */
	public Comparable deleteTail() {
		if (isEmpty())
			return null;
		else {
			length--;
			return entry[length];
		}
	}

	/**
	 * Task: displays all objects in the list in order, one per line
	 * 
	 * @param NONE
	 * @return NONE
	 */
	public void display() {
		for (int i = 0; i < length; i++)
			System.out.println(entry[i]);
	}

	/**
	 * Task: search the list for the given object and return its position in the
	 * list, or -1 if it's not found
	 * 
	 * @param searchValue
	 *            is a valid object to find in the list
	 * @return the position of the entry that was found, or -1 if it's not found
	 */
	public int contains(Comparable searchValue) {
		int found = -1;
		int i = 0;
		while (i < length && found == -1)
			if (searchValue.equals(entry[i]))
				found = i + 1; // list positions are 1-based
			else
				i++;
		return found;
	}

	/**
	 * Task: determines if the list is empty
	 * 
	 * @param NONE
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * Task: determines if the list contains a given object
	 * 
	 * @param NONE
	 * @return return true if full
	 */
	public boolean isFull() {
		return length == entry.length;
	}
}
