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
   *  Task: Adds a new entry to the top of the list.   *        Entries currently in the list are unaffected.   *        The list's size is increased by 1.
   *   *  @param  newEntry  the object to be added as a new entry   *  @return true if the addition is successful, or false if the list   *          is full
   */
  public boolean insertHead(T newEntry);

  /** 
   *  Task: Adds a new entry to the end of the list.   *         Entries currently in the list are unaffected.   *         The list's size is increased by 1.
   *   *  @param  newEntry  the object to be added as a new entry   *  @return true if the addition is successful, or false if the list   *          is full
   */
  public boolean insertTail(T newEntry);

  /**
   *  Task: Removes the entry at a the first position from the list.   *        The list's size is decreased by 1. 
   *   *  @return a reference to the removed entry or null, if list is empty
   */
  public T deleteHead();

  /**
   *  Task: Removes the entry at a the last position from the list.   *        The list's size is decreased by 1. 
   *   *  @return a reference to the removed entry or null, if list is empty
   */
  public T deleteTail();


  /**
   *  Task: Displays all entries that are in the list, one per line,    *        in the order in which they occur in the list.
   */
  public void display();

  /**
   *  Task: Sees whether the list contains a given entry,
   *        and return the position of the entry.
   *   *  @param  anEntry  the object that is the desired entry.   *  @return an integer of the entry's position in the list, or -1 if not
   */
  public int contains(T anEntry);

  /**
   *  Task: Sees whether the list is empty.
   *   *  @return true if the list is empty, or false if not
   */
  public boolean isEmpty();

  /** Task: Sees whether the list is full.   *  @return true if the list is full, or false if not */
  public boolean isFull();
}