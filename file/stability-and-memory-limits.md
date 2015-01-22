## Stability and Memory Limits

10.1. Imagine you are building some sort of service that will be called by up to 1000 client applications to get simple end-of-day stock price information (open, close, high, low). You may assume that you already have the data, and that you can store it in any format you wish. How would you design the client-facing service which provides the information to cleint application?
  - You are responsible for the development, rollout, and ongoing monitoring and maintanence of the feed. Describe the different methods you considered and why you would recommend your approach. [[Solution]](../code/10-1.md)
  - Your service can use any technologies you wish and can distribute the information to the client applications in any mechanism you choose. 

10.2 How would you design the data structures for a very large social network like Facebook or LinkedIn?
  - Describe how you would design an algorithm to show the connection, or path, between two people (e.g., Me -> Bob -> Susan -> Jason) [[Solution]](../code/10-2.java)

10.3 Given an input file with four billion non-negative integers, provide an algorithm to generate an integer which is not contained in the file. Assume you have 1GB of memory available for this task.  [[Solution]](../code/10-3.md)
  - What if you have only 10MB of memory. Assume that all the values are distinct.

10.4 You have an array with all the numbers from 1 to N, where N is at most 32,000. The array may have duplicated entries and you do not know what N is. With only 4 kilobytes of memory availables, how would you print all duplicate elements in the array? [[solution]](../code/10-4.java)

10.5 If you were designing a web crawler, how would you avoid getting into infinite loops? [[solution]](../code/10-5.md)

10.6 You have 10 billion URLs. How do you detect the duplicate documents? In this case, assume that "duplicate" means that the URLs are identical. [[solution]](../code/10-6.md)

10.7 Imagine a web server for a simplified search engine. This system has 100 machines to respond to search queries, which may then call out using processSearch(string query) to another cluster of machines to actually get the result. The machine which responds to a given query is chosen at random, so you can not guarantee that the same machine will always respond to the same request. The method processSearch is very expensive. Design a caching mechanism to cache the results of the most recent queries. Be sure to explain how you would update the cache when data changes.
