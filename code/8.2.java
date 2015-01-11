

public abstract class Employee(){
  public boolean free;
  
  public boolean handleCall(Call c){
    
  }
  
  public boolean isFree(){ return free;}
  
  public void setNotFree(){
    free = false;
  }
  public void setFree(){
    free = true;
  }
}

public abstract class LowerEmployee extends Employee{
  public boolean canHandle;
  public Respondent(boolean free){
    this.free = free;
  }
  
  public boolean canHandle(Call c){
    if(canHandle) return true;
    else return false;
  }
}

public class Respondent extends LowerEmployee{

}

public class Manager extends LowerEmployee{

}

public class Director extends Employee(){

}

public class CallCenter{
  ArrayList<Respondent> respondents;
  ArrayList<Manager> managers;
  ArrayList<Director> director;
  
  public void dispatchCall(Call c){
    for(Respondent r: respondents){
      if(r.isFree()){
        if(!r.canHandle()) break;
        else
        r.handleCall(c);
        return;
      }
        
    }
  }
}

////////////////////////////////////////////////////////////////////////////////////////
public class CallHandler{
  private static CallHandler instance;
  
  private final int LEVELS = 3;
  
  private final int NUM_RESPONDENTS = 10;
  private final int NUM_MANAGERS = 4;
  private final int NUM_DIRECTORS = 2;
  
  //list of employeesm by levell=
  List<List<Employ>> employeeLevels;
  
  //queue foreach call's rank
  List<List<Call>> callQueues;
  
  protected CallHandler() {...}
  
  //get instance of singleton class
  public static CallHandler getInstance(){
    if(instance == null) instance = new CallHandler();
    return instance;
  }
  
  //get the first available employ who can handle this call
  public Employee getHanlerForCall(Call call) {...}
  
  //routes the call to an available employee, or save in a queue if no employee is available
  public void dispatchCall(Caller caller){
    Call call = new Call(caller);
    dispatchCall(call);
  }
  
  //routethe call to an avilable employee, or saves in a queue if no employee is available
  public void dispatchCall(Call call){
    //try to route the call to an employee with minimal rank
    Employ emp = getHandlerForCall(call);
    if(emp != null){
      emp.receiveCall(call);
      call.setHandler(emp);
    }
    else{
      //place the call into corresponding call queue according to its rank
      call.reply("Please wait for free employee to reply");
      callQueues.get(call.getRank().getValue()).add(call);
    }
  }
  
  //an employ get free, look for a waiting call that emp can server
  public boolean assignCall(Employee emp){...}
}

///////////////////////////////////////////////////////////////////////////////
//Call represents a call from a user. A call has a minumum rank and is assigned to the first employee who can handle it
public class Call{
  //minimal rank of employee who can handle this call
  private Rank rank;
  private Caller caller;
  
  private Employee handler;
  public Call(caller c){
    rank = Rank.responder;
    caller = c;
  }
  
  public void setHankder(Employee e){ handler = e;}
  
  public void reply(String message) {...}
  public Rank getRank() {return rank;}
  public void setRank(Rank r) {Rank = r;}
  public Rank incrementRank() {...}
  public void disconnect() {...}
}


///////////////////////////////////////////////////////////////////////////////////////////
//Employee is a super class for the Director, Manager and Respondent classes. It is implmeented as an abstract class since there would be no reason to instantiate an Employee type directly

public abstract class Employee{
  private Call currentCall = null;
  protected Rank rank;
  
  public Employee() {}
  
  //start the conversation
  public void receiveCall(Call call) {...}
  
  //the issue is resolved, finish the call
  public void callCompleted() {...}
  
  //the issue is not been resolved, Escalate the call and assign a new call to the employ
  public void escalateAndReassign() {...}
  
  //assign a new call to an Employee, if the employee is free
  public boolean assignNewCall() {...}
  
  //return whether ot not the employee is free
  public boolean isFree() {return currentCall == null;}
  
  public Rank getRank() {return Rank;}
  
}


//////////////////////////////////////////////////////////////////////
//The Respondent, Director and Manager class are now just simple extensions of the Employee class
public class Director extends Employee{
  
  public Director(){
    rank = Rank.Director;
  }
  
}

public Manager extends Employee{
  
  public Manager(){
    rank = Rank.Manager;
  }
}

public Respondent extends Employee{
  public Respondent(){
    rank = Rank.Resonder;
  }
}


