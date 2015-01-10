## Bit Manipulation

- 5.0 Basic Operation: setBit, getBit, clearBit [[Solution]](../code/5.0.java)

- 5.1 You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to insert M into N such that M starts at bit j nd ends at bit i. You can assume that the bits j through i have enough space to fit all of M. That is, if M = 10011, you can assume that there are at least 5 bits between j and i. You would, for example, have j = 3 and i =2, because M could not fully fit between bit 3 and bit 2. [[Solution]](../code/5.1.java)
  - Example: N = 10000000000, M = 10011, i =2, j =6
  - Output: N = 10001001100

- 5.2 Given a real number between 0 and 1 (e.g., 0.72) that is passed in as a double. Print the binary representation. If the number cannot be represendted accurately in binary with at most 32 characters, print "ERROR". [[Solution]](../code/5.2.java)

- 5.3 Given a positive integer, print the next smallest and the next largest number that have the same number of 1 bits in their binary representation. [[Solution]](../code/5.3.java)

- 5.4 Explain what the following code does: ((n & (n-1)) == 0) [[Solution]](../code/5.4.java)

- 5.5 Write a function to determine the number of bits required to convert integer A to integer B. [[Solution]](../code/5.5.java)
  - Example: Input 31, 14
  - Output: 2

- 5.6 Write a program to swap odd and even bits in an integer with as few instructions as possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on). [[Solution]](../code/5.6.java)

- 5.7 An array A contains all the integers from 0 to n, except for one number which is missing. In this problem, we cannot acess an entire integer in A with a single operation. The elements of A are presented in binary, and the only opertion we can use to access them is "fetch the jth bit of A[i]", which takes constatnt time. Write code to find the missing integer. Can you do it in O(n) time? [[Solution]](../code/5.7.java)

- 5.8 A monochrome screeni is stored as a single array of bytes, allowing eight consecutive pixels to be stored in one byte. The screen has width w, where w is divisible by 8 (that is, no byte will be split across rows). The height of the screen, of course, can be derived from the length of the array and the width. Implement a function drawHorizontalLine(byte[] screen, int width, int x1, int x2, int y) which draws a horizontal line from (x1,y) to (x2, y)
