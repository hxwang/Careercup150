## Stability and Memory Limits

10.1. Imagine you are building some sort of service that will be called by up to 1000 client applications to get simple end-of-day stock price information (open, close, high, low). You may assume that you already have the data, and that you can store it in any format you wish. How would you design the client-facing service which provides the information to cleint application?
  - You are responsible for the development, rollout, and ongoing monitoring and maintanence of the feed. Describe the different methods you considered and why you would recommend your approach. [[Solution]](../code/10-1.md)
  - Your service can use any technologies you wish and can distribute the information to the client applications in any mechanism you choose. 

10.2 How would you design the data structures for a very large social network like Facebook or LinkedIn?
  - Describe how you would design an algorithm to show the connection, or path, between two people (e.g., Me -> Bob -> Susan -> Jason) [[Solution]](../code/10-2.md)
