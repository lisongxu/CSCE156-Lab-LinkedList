package unl.soc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A demonstration test file.
 * 
 * @author Lisong
 *
 */

public class LinkedListTest {

	/**
	 * Test contains
	 */
	@Test
	void containsTest01() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		boolean expected = true;
		boolean result = list.contains(13);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test contains
	 */
	@Test
	void containsTest02() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		boolean expected = false;
		boolean result = list.contains(11);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test indexOf
	 */
	@Test
	void indexOfTest01() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.add(11);
		int expected = 0;
		int result = list.indexOf(11);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test indexOf
	 */
	@Test
	void indexOfTest02() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		int expected = 2;
		int result = list.indexOf(13);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Test indexOf
	 */
	@Test
	void indexOfTest03() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		int expected = -1;
		int result = list.indexOf(13);
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test lastIndexOf
	 */
	@Test
	void lastIndexOfTest01() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.add(11);
		int expected = 2;
		int result = list.lastIndexOf(11);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Test indexOf
	 */
	@Test
	void lastIndexOfTest02() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		int expected = -1;
		int result = list.lastIndexOf(13);
		Assertions.assertEquals(expected, result);
	}
	
	/**
	 * Test removeLast
	 */
	@Test
	void removeLastTest01() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.removeLast();
		int expected = 0;
		int result = list.size();
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test removeLast
	 */
	@Test
	void removeLastTest02() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.removeLast();
		int expected = 1;
		int result = list.size();
		Assertions.assertEquals(expected, result);
	}

	/**
	 * Test removeLast
	 */
	@Test
	void removeLastTest03() {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		list.add(11);
		list.add(12);
		list.removeLast();
		int expected = 11;
		int result = list.get(0);
		Assertions.assertEquals(expected, result);
	}

}
