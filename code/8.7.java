
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


//////////////////////////////////////////////////// Reference

//UserManager

public class UserManager{
  
  private static UserManager instance;
  
  //map from a user id to a user
  private HashMap<Integer, User> usersById;
  
  //maps from an account name to a user
  private HashMap<String, User> usersByAccountName;
  
  //maps from the user id to an online user
  private HashMap<Ineger, User> onlineUsers;
  
  public static UserManager getInstance(){
    if(instance == null) instance = new UserManager();
    return instance;
  }
  
  public void adduser(User fromUser, Strong toAccountName) {}
  public void approveAddRequest(AddRequest req) {}
  public void rejectAddRequest(AddRequest req) {}
  public void userSignedOn(String accountName) {}
  public void userSignedOff(String accountName) {}
  
}


//If A want to add B
//A will call UserManager requestAdd
//UserManager will call: A.sendAddRquest and B.receiveAddRequest

///////////////////////////////////////////////////////////////////
public class User{
  private int id;
  private UserStatus status = null;
  
  //mao from the other participant's user id to the chat
  private HashMap<Integer, PrivateChat> privatechats;
  
  //map from the group chat id to the group chat
  private ArrayList<GroupChat> groupchats;
  
  //map from the other person's user id to the add request
  private HashMap<Integer, AddRequest> receivedAddRquests;
  
  //map from the other person's user id to the add request
  private HashMap<Integer, AddRequest> sentAddRequests;
  
  private String accountName;
  private String fullName;
  
  public User(int id, String accountName, String fullName) {...}
  public boolean sendMessageToUser(User to, String content) {...}
  public boolean sendMessageToGroupChat(int id, String content) {...}
  public void setStatus(UserStatus status) {...}
  public UserStatus getStatus() {...}
  public boolean addContact(User user) {...}
  public void receivedAddRequest(AddRequest req) {...}
  public void sentAddRequest(AddRequest req) {...}
  public void removeAddRequest(AddRequest req) {...}
  public void requestAddUser(String accountName) {...}
  public void addConversation(PrivateChat conversation) {...}
  public void addConversation(GroupChat conversation) {...}
  public int getId() {...}
  public String getAccountName() {...}
  public String getFullName() {...}
}

////////////////////////////////////////////////////////////////////////

//The Conversation class is implemented as an abstract class, since all conversations must be either GroupChat or PrivateChat

public abstract class Conversation{
  
  protected ArrayList<User> participantsl
  protected int id;
  protected ArrayList<Message> messages;
  
  public ArrayList<Message> getMessage() {...}
  public boolean addMessage(Message m) {...}
  public int getId() {...}
}

public class GroupChat extends Conversation{
  public void removeParticipants(User user) {...}
  public void addparticipants(User user) {...}
  
}

public class PrivateChat extends Conversation{
  
  public PrivateChat(User u1, User u2) {...}
  public User getOtherParticipant(User primary) {...}
  
}


//////////////////////////
public class Message{
  private String content;
  private Date date;
  public Message(String content, Date date) {...}
  public String getContent();
  public Date getDate() {...}
}

///////////////////////////////////
//AddRequest and UserStatus are simple classes with little functionality

public class AddRequest{
  private User fromuser;
  private User touserl
  private Date date;
  RequestStatus status;
  
  public AddRequest(User from, User to, Date date) {...}
  public RequestStatus getStatus() {...}
  public User getFromUser(){}
  public User getToUser() {}
  public Date getDate() {} 
  
}


public class UserStatus{
  private String message;
  private UserStatusType type;
  public UserStatus(UserStatusType type, String message) {...}
  public UserStatusType getStatusType() {...}
  public String getMessage() {...}
}

public enum UserStatusType {
  Offline, Away, Idle, Available, Busy
}

public enum RequestStatus{
  Unread, Read, Accepted, Rejected
}
