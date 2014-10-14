/* Here is a simple test program to test the AEntryList and LEntryList implementations.   */

public class ListTester {

	public static void main(String[] args) {
		EntryWayListInterface<String> testList;
		testList = new AEntryWayList<String>();
		//testList = new LEntryWayList<String>();
		
		testList.display();
		System.out.println();
		
		testList.insertHead("Priority Client \tImpatient Irene");
		testList.insertTail("Second Tier Client  \tCarol CanWait");
		testList.insertHead("Priority Client \tNelly NeedsItNow");
		testList.insertHead("Priority Client \tBetty BigSpender");
		testList.insertTail("Second Tier Client \tDonna DontCareAbout");
		testList.display();
		System.out.println();

		testList.deleteHead();
		testList.deleteTail();
		testList.display();
		
		System.out.println(testList.contains("Priority Client \tDotty Demanding"));
		System.out.println(testList.contains("Second Tier Client  \tCarol CanWait"));

	}

}
