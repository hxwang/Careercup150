
///////////////////////////////// My design
public class Server{
  private HashMap<Integer,User> users;
  public Server()
  
  public boolean addUser(int id, String name){
    if(users.containsKey(id)) return false;
    User u = new User(id, name);
    users.put(id,u);
    return true;
  }
  
  public void sendMsg(int sendid, int recid, String msg){
    while(!users.get(id).isOnline()){
    
    }
    users.get(id).received(msg, sendid);
  }
}

public class User{
  private int id;
  private String name;
  private boolean online;
  
  public User(int id, String name){
    this.id = id;
    this.name = name;
  }
  
  public void receiveMsg(String msg, int sendid)
  
  public void sendMsg(String msg, int otherid){
    server.sendMsg(this.id, otherid, msg);
  }
  
  public boolean isOnline() {return online;}
}
