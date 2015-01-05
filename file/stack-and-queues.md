## Stack and Queues

- 3.1 Describe how you could use a single array to implement three stacks.

- 3.2 How would you design a stack with, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Min-Stack.java)

- 3.3 Imagine a (literal) stack of plates. If the stack gets too high, it might topple. Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. SetOfStack.push() and SetOfStack.pop() should behave identically to a single stack (that is, pop() should return the same values as it would if there were just a single stack).
