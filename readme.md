# Computer Science II
## Lab 9.0 - Linked List

An introduction to the linked list.

This lab is part of Computer Science II (CSCE 156) for Fall 2023 
in the [School of Computing](https://computing.unl.edu) 
at the [University of Nebraska-Lincoln](https://www.unl.edu).

## Overview

### Lab Objectives & Topics

After completing this lab, you should be able to:
* use linked lists to store and manage collections of objects



### Peer Programming Pair-Up

At the beginning of
each lab, you may find a team member by yourself or may be randomly paired up with another student by
a lab instructor.  One of you will be designated the *driver* 
and the other the *navigator*. If you prefer to work on this lab by yourself, that is fine too.  Each week you should try to alternate: if you were a driver 
last week, be a navigator next, etc. 

***Note that, each student must submit the code to CodePost for grading.***


## 1. Getting Started

Clone this project code for this lab from GitHub in Eclipse using the
URL: `https://github.com/lisongxu/CSCE156-Lab-LinkedList`. 

## 2. Activities 

Finish [`MyLinkedList.java`](src/main/java/unl/soc/MyLinkedList.java) that we have studied in the class. 

Specifically, implement the following methods

1. Method `contains` returns true if the list contains element `e` 

```java
  public boolean contains(Object e) 
  ```
  
2. Method `indexOf` returns the index of the first matching element in 
  the list. Returns -1 if no match. 

```java  
  public int indexOf(Object e) 
 ```
 
3. Method `lastIndexOf` returns the index of the last matching element in 
   the list. Returns -1 if no match. 

 ```java
  public int lastIndexOf(E e) 
 ```
 
4. Method `removeLast` removes the last node and returns the object that is contained in the removed node. 

```java
  public E removeLast() 
```

Test whether your methods work by running the `main` method in `MyLinkedList`, which should print out the following

```text
list = [10, 11, 12, 11, 13]
contains(11) = true
indexOf(11) = 1
lastIndexOf(11) = 3
after removeLast(): [10, 11, 12, 11]
```


### 3. Testing, Submitting, and Grading

* Test your programs locally on your computer using the provided JUnit test suites (a total of ten).  Fix any errors and completely debug your programs.

* Submit the following file to CodePost:
  * `MyLinkedList.java`

* Make sure that your program pass all the tests on CodePost. For this lab, as long as your programs pass all the tests on Codepost, you will get full points for the lab.
