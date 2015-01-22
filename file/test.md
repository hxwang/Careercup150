## Testing

- Testing a real world object
  - who will use it, and why?
  - what are the use cases?
  - what are the bounds of use?
  - what are the stress/ failure conditions?
  - how would you perform the testing? e.g., time elements

- Test a piece of software
  - black or white box test?
  - who will use it and why?
  - what are the use cases?
  - what are the bounds of use
  - ...
  
- Testing a function
  - define testcases
    - normal cases
    - extrem cases
    - null and "illegal" input
    - strange input: e.g., what if you input an already sorted array?
  - define expected result
  
- Troubleshooting Questions
  - Step 1: understand the scenarios
  - Step 2: break down the problem
  - Step 3: create specific, manageable tests
    - e.g., for remote users with chrom crushed, you can mimic the same step when you instruct the remote users to do something, like click an item etc.


- 12.2 You are given the source to an application which crashes when it is run. After running it tens times in a debugger, you find it never crashes in the same place. The application is single threaded, and uses only the C standard library. What proramming errors could be this crash? How would you test each one? [[solution]](../code/12-2.md)
