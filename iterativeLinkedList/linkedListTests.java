package iterativeLinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class linkedListTests {

	public void testPrintSeparater() {
		System.out.println("----------------");
	}

	@Test
	public void displayListShouldPrintListIsEmpty() {
		testPrintSeparater();
		System.out.println("displayListShouldPrintListIsEmpty()");
		LinkedList theList = new LinkedList();
		theList.displayList();
		assertEquals(0, theList.size());
	}

	@Test
	public void listShouldHaveOneNode() {
		testPrintSeparater();
		System.out.println("listShouldHaveOneNode()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		theList.displayList();

		assertEquals(1, theList.size());
	}

	@Test
	public void listShouldHaveTwoNodes() {
		testPrintSeparater();
		System.out.println("listShouldHaveTwoNodes()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		theList.addAtHead(20);

		theList.displayList();
		assertEquals(2, theList.size());
	}

	@Test
	public void deleteAtStartShouldHaveSize1() {
		testPrintSeparater();
		System.out.println("deleteAtStartShouldHaveSize1()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		theList.addAtHead(20);
		theList.removeAtHead();
		theList.displayList();
		assertEquals(1, theList.size());
	}

	@Test
	public void removeAtStartShouldPrintListEmpty() {
		testPrintSeparater();
		System.out.println("removeAtStartShouldPrintListEmpty()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		theList.removeAtHead();

		theList.displayList();
		assertEquals(0, theList.size());
	}
	
	@Test
	public void removeNodeShouldPrintSizeTwo(){
		testPrintSeparater();
		System.out.println("removeNodeShouldPrintSizeTwo()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		theList.addAtHead(30);
		theList.addAtHead(5);
		
		theList.remove(5);
		
		theList.displayList();
		assertEquals(2, theList.size());
	}
	
	@Test
	public void shouldPrintSizeMinusOne() {
		testPrintSeparater();
		System.out.println("shouldPrintSizeMinusOne()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(10);
		
		theList.remove(10);
		
		theList.displayList();
		assertEquals(0, theList.size());
		
	}
	
	@Test
	public void shouldAddTenAtTail() {
		testPrintSeparater();
		System.out.println("shouldAddTenAtTail()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAtTail(9);
		theList.addAtTail(10);
		
		theList.displayList();
	}
	
	@Test
	public void shouldRemoveTenAtTail() {
		testPrintSeparater();
		System.out.println("shouldRemoveTenAtTail()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAtTail(9);
		theList.addAtTail(10);
		
		theList.removeAtTail();
		theList.displayList();
	}
	
	@Test
	public void shouldGetHead7() {
		testPrintSeparater();
		System.out.println("shouldGetHead7()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAtTail(9);
		theList.addAtTail(10);
		
		assertEquals(7, theList.getHead());
	}
	
	@Test
	public void shouldGetTail() {
		testPrintSeparater();
		System.out.println("shouldGetTail7()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(10);
		System.out.println(theList.getTail());
		
		assertEquals(7, theList.getHead());
		assertEquals(10, theList.getTail());
		
		theList.removeAtTail();
		assertEquals(7, theList.getTail());
	}
	
	@Test
	public void containsShouldReturnTrue() {
		testPrintSeparater();
		System.out.println("containsShouldReturnTrue()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAtTail(9);
		theList.addAtTail(10);

		assertEquals(true, theList.contains(7));
		assertEquals(false, theList.contains(20));
	}
	
	@Test
	public void shouldAddAtIndex() {
		testPrintSeparater();
		System.out.println("shouldAddAtIndex()");
		LinkedList theList = new LinkedList();
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAt(0, 10);
		System.out.println("The size of list: " + theList.size());
		assertEquals(10, theList.getHead());
		
		theList.addAt(3, 12);
		assertEquals(12, theList.getTail());
		
		theList.addAt(4, 100);
		assertEquals(100, theList.getTail());
		
		theList.addAt(3, 77);
		System.out.println("The size of list: " + theList.size());
		theList.displayList();
		assertEquals(100, theList.getTail());
		assertEquals(10, theList.getHead());
	}
	
	@Test
	public void shouldRemoveAtIndex() {
		testPrintSeparater();
		System.out.println("shouldRemoveAtIndex()");
		LinkedList theList = new LinkedList();
		
		theList.addAtHead(7);
		theList.addAtTail(8);
		theList.addAtTail(10);
		theList.addAtTail(12);
		
		
		
		theList.removeAt(0);
//		Should be 8
		assertEquals(8, theList.getHead());
		theList.removeAt(2);
//		Should be 10
		assertEquals(10, theList.getTail());
		
		
		theList.addAtTail(1000);
		theList.removeAt(1);
		theList.displayList();
	}
}
