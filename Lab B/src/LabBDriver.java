
public class LabBDriver {
	
	public static void main(String[] args) {
		LabBEntryWayListInterface<String> nameList = new LabBEntryWayListInterface<String>();
		
		/* isEmpty() test before adding anything*/
		System.out.println("1. testing isEmpty() method before adding anything.");
		System.out.println("Output:");
		boolean emptyTest = nameList.isEmpty();
		System.out.println(emptyTest);
		System.out.println("Output should be: true");
		System.out.println();
	
		/*display() test before adding anything*/
		System.out.println("2. testing display() method.");
		System.out.println("Output:");
		nameList.display();
		System.out.println("Output should be: No display -- List is empty.");
		System.out.println();
		
		/*insertHead() test*/
		System.out.println("3. testing insertHead() method. Adding five elements to the head.");
		System.out.println("Output:");
		nameList.insertHead("Abby");
		nameList.insertHead("Bobby");
		nameList.insertHead("Carrie");
		nameList.insertHead("Doug");
		nameList.insertHead("Edgar");
		nameList.display();
		System.out.println("Output should be: Edgar, Doug, Carrie, Bobby, Abby");
		System.out.println();
		
		/* isEmpty() test after adding stuff*/
		System.out.println("4. testing isEmpty() method after adding elements.");
		System.out.println("Output:");
		emptyTest = nameList.isEmpty();
		System.out.println(emptyTest);
		System.out.println("Output should be: false");
		System.out.println();
		
		/*insertTail() test*/
		System.out.println("5. testing insertHead() method. Adding five elements to the end.");
		System.out.println("Output:");
		nameList.insertTail("Valentine");
		nameList.insertTail("World");
		nameList.insertTail("X-Ray");
		nameList.insertTail("YOLO");
		nameList.insertTail("Zebra");
		nameList.display();
		System.out.println("Output should be: Edgar, Doug, Carrie, Bobby, Abby, Valentine, World, X-Ray, YOLO, Zebra");
		System.out.println();
		
		/*deleteHead() test*/
		System.out.println("6. testing deleteHead() method. Edgar should be removed from the list.");
		System.out.println("Output:");
		nameList.deleteHead();
		nameList.display();
		System.out.println("Output should be: Doug, Carrie, Bobby, Abby, Valentine, World, X-Ray, YOLO, Zebra");
		System.out.println();
		
		/*deleteHead() test*/
		System.out.println("7. testing deleteHead() method. Doug should be removed from the list.");
		System.out.println("Output:");
		nameList.deleteHead();
		nameList.display();
		System.out.println("Output should be: Carrie, Bobby, Abby, Valentine, World, X-Ray, YOLO, Zebra");
		System.out.println();
		
		/*deleteHead() test*/
		System.out.println("8. testing deleteHead() method when list only have 1 entry");
		System.out.println("Output:");
		nameList.deleteHead();
		nameList.deleteHead();
		nameList.deleteHead();
		nameList.deleteHead();
		nameList.deleteHead();
		nameList.deleteHead();
		nameList.deleteHead(); //by this line, list will only have 1 remaining entry: "Zebra"
		nameList.deleteHead();
		nameList.display();
		System.out.println("Output should be: No display -- List is empty.");
		System.out.println();
		
		/*isEmpty() test after deleting all the elements*/
		System.out.println("9. testing isEmpty() method after deleting all the elements.");
		System.out.println(nameList.isEmpty());
		System.out.println("Output should be: true");
		System.out.println();
		
		/*insertTail() test when list is empty*/
		System.out.println("10. testing insertTail() method on an empty list.");
		System.out.println("Output:");
		nameList.insertTail("A");
		nameList.display();
		System.out.println("Output should be: A");
		System.out.println();
		
		/*insertTail() test when list is not empty*/
		System.out.println("10. testing insertTail() method when list is NOT empty.");
		System.out.println("Output:");
		nameList.insertTail("B");
		nameList.insertTail("C");
		nameList.insertTail("D");
		nameList.insertTail("E");
		nameList.display();
		System.out.println("Output should be: A, B, C, D, E");
		System.out.println();
		
		/*testing contains()*/
		System.out.println("11. testing contains() method.");
		System.out.println("Output:");
		System.out.println(nameList.contains("A"));
		System.out.println(nameList.contains("D"));
		System.out.println(nameList.contains("Z"));
		System.out.println("Output should be: 1, 4, -1");
		System.out.println();
		
		/*testing deleteTail()*/
		System.out.println("12. testing deleteTail() method.");
		System.out.println("Output:");
		nameList.deleteTail();
		nameList.deleteTail();
		nameList.display();
		System.out.println("Output should be: A, B, C");
		System.out.println();
		
		/*testing deleteTail() and deleteHead()*/
		System.out.println("12. testing deleteTail() method and deleteHead().");
		System.out.println("Output:");
		nameList.deleteHead();
		nameList.deleteTail();
		nameList.display();
		System.out.println("Output should be: B");
		System.out.println();
	}


}
