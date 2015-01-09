## Stack and Queues

- 3.1 Describe how you could use a single array to implement three stacks.

- 3.2 How would you design a stack with, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Min-Stack.java)

- 3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. SetOfStack.push() and SetOfStack.pop() should behave identically to a single stack (that is, pop() should return the same values as it would if there were just a single stack). [[Solution]](../code/3.3.java)

- 3.4 In the classic problem of Towers of Hanoi, you have 3 towers and N disks of different sizes which can slide onto any tower. The puzzle starts with disk sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following constraints: [[Solution]](../code/3.4.java)
  - (1) Only one disk can be moved at a time.
  - (2) A disk can only be placed on top of a larger disk.
  - (3) A disk is slid off the top of one tower onto the next tower.
  write a program to move the disks from the first tower to the last using stacks.

- 3.5 Implement a MyQueue class which implements a queue using two stacks. [[Solution]](../code/3.5.java)

- 3.6 Write a program to sort a stack in ascending order (with biggest items on top). You may use additional stacks to hold items, but you may not copy the element into another data structure (such as an array). The stack supports the following operations: push, pop, peek and is empty. [[Solution]](../code/3.6.java)

- 3.7 An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter, or they can seelect whether they prefer a dog or a cat (and will receive the oldest animal of that type). They cannot select which specific animal they would like. Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the built-in LinkedList data structure.
