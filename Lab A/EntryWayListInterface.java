/**
 * An interface for the ADT list.
 * Entries in the list have positions that begin with 1.
 *
 * @author Wesley Febrian
 * CS 111C - Section 831, Professor Jessica Masters
 */

public interface EntryWayListInterface<T>
{
  /** 
   *  Task: Adds a new entry to the top of the list.
   *
   */
  public boolean insertHead(T newEntry);

  /** 
   *  Task: Adds a new entry to the end of the list.
   *
   */
  public boolean insertTail(T newEntry);

  /**
   *  Task: Removes the entry at a the first position from the list.
   *
   */
  public T deleteHead();

  /**
   *  Task: Removes the entry at a the last position from the list.
   *
   */
  public T deleteTail();


  /**
   *  Task: Displays all entries that are in the list, one per line, 
   */
  public void display();

  /**
   *  Task: Sees whether the list contains a given entry,
   *        and return the position of the entry.
   *
   */
  public int contains(T anEntry);

  /**
   *  Task: Sees whether the list is empty.
   *
   */
  public boolean isEmpty();

  /** Task: Sees whether the list is full.
  public boolean isFull();
}