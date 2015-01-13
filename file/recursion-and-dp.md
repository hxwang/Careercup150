## Recursion and Dynamic Programming

- 9.1 A child is running up a staircase with n steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways to child can run up the stairs. [[Solution]](../code/9.1.java)

- 9.2 Imagine a robot sitting on the upper left corner of an X by Y grid. The robot can only move in two directions: right and down. How many possible paths are there for the robot to go from (0,0) to (X,Y) [[Solution]](../code/9.2.java)
  - Imagine certain spots are "off limit", such that the robot cannot step on them. Design and implement algorithm to find a path for the robot from the top left to the bottom right.

- 9.3 A magic index in an array A[0...n-1] is defined to be an index such that A[i] = i. Given a sorted array, write a method to find a magic index, if one exists, in array A [[Solution]](../code/9.3.java)
  - what if the values are not distinct?

- 9.4 Write a method to return all subset of a set. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Subsets.java)

- 9.5 Write a method to compute all permutations of a string. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Permutations.java)

- 9.6 Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n-pairs of parentheses. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Generate-Parentheses.java)
  - Example: 3
  - Output: ((())), (()()), (())(), ()(()), ()()()

- 9.7 Implementa the "paint fill" function that one might see on many image editing programs. That is, given a screen (represented by a two-dimensional array of colors), a point, an a new color, fill in the surrounding area until the color changes from the original color.  [[Solution]](../code/9.7.java)

- 9.8 Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents) and pennies (1 cent), write code to calculat ethe number of ways to represent n cents.
  - Comment: distinguish how this is different from Fibonacci array
  - [[Solution]](../code/9.8.java)

- 9.9 Write an algorithm to print all ways of arranging eight queens on an 8*8 chess board so that none of them share the same row, column or diagnal. In this case, "diagonal" means all diagonals, not just the two that bisect the board. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/N-Queens.java)

- 9.10 You have a stack of n boxes, with widths w<sub>i</sub>, height h<sub>i</sub> and depths d<sub>i</sub>. The boxes cannot be rotated and can only be stacked on top of one another if each box in the stack is strictly larger than the box above it in width, height and depth. Implement a method to build the tallest stack possible, where the height of a stack is the sum of the heights of each box. [[Solution]](../code/9.10.java)

- 9.11 Given a boolean expression consisting of the symbols 0, 1, &, |, and ^, and a desired boolean result value, implement a function to count the number of ways of parenthesizing the expression such that it evaluates to the result. [[Solution]](../code/9.11.java)
  - Expression: 1^0|0|1
  - Desired rsult: false(0)
  - Outpput: 2 ways 1^((0|0)|1)), and 1^(0|(0|1))
