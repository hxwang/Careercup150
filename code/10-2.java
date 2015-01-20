

/*                       My design
- use graph
  - each person is a node, the edge between two node indicates these two persons have connection
  - since the size of the graph could be very large, thus, we can divide the graph into several graph according to geographical locations.
  - due to the dividing of the graph, we need to main further information between each two graphs.
*/  

/*References
- Simplefied version: forget millions of users
  ```
  class Person{
    Person[] friends;
    //other info
  }
  ```
  - In order to know the path between Person A and B, we can start from A and use BFS search
*/

/*
- Handle the millions of users
*/

public class Server{
  private HashMap<Integer, Machine> machines = new HashMap<Integer, Machine>();
  private HashMap<Integer, Integer> peopleToMachine = new HashMap<Integer, Integer>();
  
  public Machine getMachine(int machineID){
    return machines.get(machineID);
  }
  
  public int getMachineID(int personID){
    int rnt = peopleToMachine.get(personID);
    if(rnt==null) return -1;
    return rnd;
  }
  
  public Person getPesonWithID(int personID){
    int machineID = getMachineID(personID);
    if(machineID == null) return null;
    Machine m = getMachine(machineID);
    if(m==null) return null;
    return m.getPersonByID(personID);
  }
}


public class Person{
  private ArrayList<Integer> friends = new ArrayList<Integer>();
  private int personID;
  
  public Person(int id) {this.personID = id;}
  
  public int getID() {return this.personID; }
  pubic void add Friend(int id) { friends.add(id);}
  
}

public class Machine{
  private HashMap<Integer, Person> people = new HashMap<Integer, Person>();
  public int machineID;
  
  public Person getPersonByID(int pid){
    return people.get(pid);
  }
}

