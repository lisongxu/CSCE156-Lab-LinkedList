# Computer Science II
## Lab 9 - Linked List

An introduction to the linked list.

This lab is part of Computer Science II (CSCE 156) for Fall 2025 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://www.unl.edu).

## Overview

### Lab Objectives & Topics

After completing this lab, you should be able to:
* use linked lists to store and manage collections of objects

### Peer Programming Pair-Up

At the beginning of each lab, you may find a team member by yourself.  One of you will be designated the *driver* and the other the *navigator*. Each week you should try to alternate: if you were a driver last week, be a navigator next, etc. If you prefer to work on this lab alone, that is fine too.

***Note that each student must submit the code to GradeScope for grading.***


## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: `https://github.com/lisongxu/CSCE156-Lab-LinkedList`. 

## 2. Activities 

Finish [`MyLinkedList.java`](src/main/java/unl/soc/MyLinkedList.java), which we studied in class. 

Specifically, implement the following methods

1. The `contains` method returns true if the list contains element `e` 

```java
  public boolean contains(E e) 
  ```
  
2. The `indexOf` method returns the index of the first matching element in 
  the list. Returns -1 if no match. 

```java  
  public int indexOf(E e) 
 ```
 
3. The `lastIndexOf` method returns the index of the last matching element in 
   the list. Returns -1 if no match. 

 ```java
  public int lastIndexOf(E e) 
 ```
 
4. The `removeAll` method removes all the elements in `list2` from the current list. If an element `e` in `list2` appears multiple times in the current list, only the first occurrence of `e` will be removed.

```java
  public void removeAll(MyLinkedList<E> list2) 
```

Test whether your methods work by running the `main` method in `MyLinkedList`, which should print out the following

```text
list = [10, 11, 12, 11, 13]
contains(11) = true
indexOf(11) = 1
lastIndexOf(11) = 3
list2 = [1, 10, 11, 13]
after removeAll(list2): [12, 11]
```


### 3. Testing, Submitting, and Grading

### 3.1 Testing Locally

Before you submit your lab, you should run the JUnit tests locally to verify that your code is correct.  

1. Expand the `src/test/java` directory, then expand the `unl.soc` package, and then double-click on the `LinkedListTests.java` file to open it.   
2. Run the test suite by clicking the usual "Play" button.
3. A report will be presented in a JUnit tab detailing which test cases pass and
which fail along with the expected output and the actual output (for 
failed test cases).

### 3.2 Submitting

To submit your lab, do the following. 

1. Go to the lab on Canvas, and click the "Load Lab in a new window" button, which opens a GradeScope window for the lab.   

2. Drag and Drop your modified ***`MyLinkedList.java`***, and then click the "Upload" button. ***Do not upload any other files.***

3. Wait for the website to grade your code, and make sure that you pass all tests. 

4. What if the test on GradeScope fails? Please test your program locally on your computer using the provided JUnit test suite, because the test on GradeScope is exactly the same as the provided JUnit test suite. ***Debugging your programs on GradeScope is not recommended because GradeScope gives very limited information.***

### 3.3 Grading

For this lab, as long as you pass all the tests on GradeScope, you will get full points for the lab.

