## Sorting and Searching

- 11.1 You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Merge-Sorted-Array.java)

- 11.2 Write a method to sort an array of strings so that al the anagrams are next to each other. [[Solution]](../code/11-2.java)

- 11.3 Given a sorted array of n integers that has been rotated an unknown number of times, write code to find an element in the array. You may assume that the array was originally sorted in ascending order. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Search-in-Rotated-Sorted-Array.java)
  - Example: find 5 in {15, 16, 19, 20, 1, 3, 4, 5, 7, 10, 14}

- 11.4 Imagine you have a 20GB file with one string per line. Explain how you would sort the file. [[Solution]](../code/11-4.md)

- 11.5 Given a sorted array of strings which is interspersed with empty strings, write a method to find the location of a given string. [[Solution]](../code/11-5.java)
  - Example: find "ball" in {"at", "", "", "ball", ""}
  - output: 4

- 11.6 Given an M*N matrix in which each row and each column is sorted in ascending order, write a method to find an element. [[Solution]](https://github.com/hxwang/Leetcode/blob/master/code/Search-a-2D-Matrix.java)

- 11.7 A circus is designing a tower routine consisting of people standing atop one another's shoulders. For practical and asethetic reasons, each person must be both shorter and ligher than the person below him or her. Given the heights and weightes of each person in the curcus, write a method to compute the largest possible number of people in such a tower.  [[Solution]](../code/11-7.java)
  - Input (ht, wt): (65, 100), (70, 150), (56, 90), (75, 190), (60, 95), (68, 110)
  - Output: the longest tower is length 6 and includes from top to bottom
    - (56, 90), (60, 95), (65, 100), (68, 110), (70, 150), (75, 190)

- 11.8 Imagine you are reading in a steam of integers. Periodically, you wish to be able to look up the rank of a number x (the number of values less than or equal to x). Implement the data structures and algorithms to support these operations. That is, implement the method track(int x), which is called when each number is generated, and the method getRankOfNumber(int x), which returns the number of values less than or equal to x (not including x itself).
  - Example: Steam (in order of appearance): 5, 1, 4 ,4, 5, 9, 7, 13,3
  - getRankOfNumber(1) = 0
  - getRankOfNumber(3) = 1
  - getRankOfNumber(4) = 3
