package unl.soc;

public class MyLinkedList<E>  {

	  // Define a nested class that is used only inside this class
	  // https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
	  private class Node<E> {
		    E element;
		    Node<E> next;
		    
		    public Node(E element) {
		      this.element = element;
		    }
	  }
		
	  private Node<E> head;  // First node in the list
	  private Node<E> tail;  // Last  node in the list
	  private int size = 0;  // Number of elements in the list
	  
	  /** Create an empty list */
	  public MyLinkedList() {
	  }

	  /** Add an element to the beginning of the list */
	  public void addFirst(E e) {
	    Node<E> newNode = new Node<>(e); // Create a new node

	    if (size == 0) {    // the new node is the only node in list
	      head = newNode;
	      tail = newNode;
	    } else {
	      newNode.next = head; // link the new node with the head
	      head = newNode;      // head points to the new node
	    }

	    size++;                // Increase list size
	  }

	  /** Add an element to the end of the list */
	  public void addLast(E e) {
	    Node<E> newNode = new Node<>(e); // Create a new node

	    if (size == 0) {	     // The new node is the only node in list
	      head = newNode; 
	      tail = newNode; 
	    } else {
	      tail.next = newNode;   // Link the new node with the original last node
	      tail = newNode;        // tail now points to the new last node
	    }

	    size++;                  // Increase list size
	  }

	  /** Add a new element at the end of this list 
	   * Returns true if this collection changed as a result of the call. 
	   * Returns false if this collection does not permit duplicates and 
	   * already contains the specified element. */
	  public boolean add(E e) {
		addLast(e);
	    return true;
	  }

	  /** Check whether index is valid */
	  private void checkIndex(int index) {
		    if (index < 0 || index >= size)
		      throw new IndexOutOfBoundsException
		        ("Index: " + index + ", Size: " + size);
		  }

	  /** Clear the list */
	  public void clear() {
	    size = 0;
	    head = null;
	    tail = null;
	  }

	  /** Return true if this list contains the element e */
	  public boolean contains(Object e) {
		// to do in the lab  
	    return false;
	  }

	  /** Return the element at the specified index */
	  public E get(int index) {
	    Node<E> current = getNode(index);
	    return current.element;
	  }

	  /** Return the node at the specified index */
	  private Node<E> getNode(int index) {
	    checkIndex(index);
	    
	    Node<E> current = head;
	    for (int i = 0; i < index; i++) {
	      current = current.next;
	    }
	    
	    return current;
	  }

	  
	  /** Return the head element in the list */
	  public E getFirst() {
	    if (size == 0) {
	      return null;
	    }
	    else {
	      return head.element;
	    }
	  }

	  /** Return the last element in the list */
	  public E getLast() {
	    if (size == 0) {
	      return null;
	    }
	    else {
	      return tail.element;
	    }
	  }

	  /** Return the index of the first matching element in 
	   *  this list. Return -1 if no match. */
	  public int indexOf(Object e) {
		// to do in the lab  
	    return -1;
	  }

	  /** Return true if this list contains no elements */
	  public boolean isEmpty() {
	    return size() == 0;
	  }

	  /** Return the index of the last matching element in 
	   *  this list. Return -1 if no match. */
	  public int lastIndexOf(E e) {
		int lastIndex = -1;
		// to do in the lab  
	    return lastIndex;
	  }

	  /** Remove the head node and
	   *  return the object that is contained in the removed node. */
	  public E removeFirst() {
	    if (size == 0) {
	      return null;
	    } else if (size == 1) {
	      E old = head.element;
	      head = null;
	      tail = null;
	      size = 0;
	      return old;
	    } else {
	      E old = head.element;
	      head = head.next;
	      size--;
	      return old;
	    }
	  }

	  /** Remove the last node and
	   * return the object that is contained in the removed node. */
	  public E removeLast() {
	    if (size == 0) {
	      return null;
	    } else if (size == 1) {
	      E old = head.element;
	      head = null;
	      tail = null;
	      size = 0;
	      return old;
	    } else {
	      Node<E> secondToLast = getNode(size-2);
	      secondToLast.next = null;
	      E old = tail.element;
	      tail = secondToLast;
	      size--;
	      return old;
	    }
	  }

	  /** Remove the element at the specified position in this 
	   *  list. Return the element that was removed from the list. */
	  public E remove(int index) {   
		checkIndex(index);

	    if (index == 0) {
	      return removeFirst();
	    }
	    else if (index == size - 1) {
	      return removeLast();
	    }
	    else {
	      Node<E> previous = getNode(index-1);
	   	  Node<E> current = previous.next;
	      previous.next = current.next;
	      size--;
	      return current.element;
	    }
	  }

	  /** Remove the first occurrence of the element e 
	   *  from this list. Shift any subsequent elements to the left.
	   *  Return true if the element is removed. */
	  public boolean remove(Object e) {
		Node<E> current = head;
		Node<E> previous = null;

		int i;
		for (i = 0; i < size; i++) {
			if (e.equals(current.element)) 
				break;
			previous = current;
			current = current.next;
		}

		if (i == size)
		  return false;
		
	    if (size == 1) {
	      head = null;
	      tail = null;
	    } else if (i == 0) {
	      head = head.next;
	    } else if (i == size - 1) {
	      previous.next = null;
	      tail = previous;
	    } else {
	  	  previous.next = current.next;
	    }
	    size--;
	    return true;  
	  }

	  /** Replace the element at the specified position 
	   *  in this list with the specified element. */
	  public E set(int index, E e) {
		Node<E> current = getNode(index);
		E old = current.element;
		current.element = e;
	    
		return old;
	  }

	 
	  /** Return the number of elements in this list */
	  public int size() {
	    return size;
	  }

	  /** Return a string of the elements */
	  public String toString() {
	    StringBuilder result = new StringBuilder("[");

	    Node<E> current = head;
	    for (int i = 0; i < size; i++) {
	      result.append(current.element);
	      if (i < size-1) 
	        result.append(", "); // Separate two elements with a comma
	      current = current.next;
	    }
	    result.append("]");      // Insert the closing ] in the string

	    return result.toString();
	  }
	  
	  public void removeAll(MyLinkedList<E> list2) {
			// to do in the lab  
	  }

	  public static void main(String[] args) {
		    MyLinkedList<Integer> list = new MyLinkedList<>();
		    list.add(10);
		    list.add(11);
		    list.add(12);
		    list.add(11);
		    list.add(13);
		    System.out.println("list = "+list);
		    System.out.println("contains(11) = "+list.contains(11));
		    System.out.println("indexOf(11) = "+list.indexOf(11));
		    System.out.println("lastIndexOf(11) = "+list.lastIndexOf(11));
		  
		    MyLinkedList<Integer> list2 = new MyLinkedList<>();
		    list2.add(1);
		    list2.add(10);
		    list2.add(11);
		    list2.add(13);
		    System.out.println("list2 = "+list2);
		    list.removeAll(list2);
		    System.out.println("after removeAll(list2): "+list);
	    		
		  }

	}

