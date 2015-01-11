

/////////////////////////////////////// My design

public class Book{
  private ArrayList<User> readers;
  private String name;
  
  public Book(String name){
    readers = new ArrayList<User>();
    this.name = name;
  }
  
  public void addReader(User u){
    readers.add(u);
  }
  
  public void getName(){
    return name;
  }
  
  public boolean hasRead(User u) { }
}

public class User{
  private ArrayList<Book> books;
  private String name;
  
  public User(String name){
    this.name = name;
    books = new ArrayList<Book>();
  }
  
  public void addBook(Book b){
    books.add(b);
  }
  
  public void hasRead(Book b){
    b.hasRead(this);
  }
}


/////////////////////////////////////////////// Reference

public class OnlineReaderSystem{
  //tear off the compoenents into Library, UserManagement, and Display Class; to avoid make the class large
  
  private Library library;
  private UserManager userManager;
  private Display display;
  
  private Book activeBook;
  privete User activeUser;
  
  public OnlineReaderSystem(){
    userManager = new UserManager();
    library = new Library();
    display = new Display();
  }
  
  public Library getLibrary() {return library;}
  public UserManager getUserManager() {return userManager;}
  public Display getDisplay() {return display;}
  
  public Book getActiveBook() {return activeBook;}
  public void setActiveBook(Book book){
    activeBook = book;
    display.displayBook(book);
  }
  
  public User getActiveUser() {return activeUser;}
  public void setActiveUser(User user){
    activeUser = user;
    display.displayUser(user);
  }
}

////////////////////////////////////////////////

public class Library{
  private HashTable<Integer, Book> books;
  
  public Book addBook(int id, String details){
    if(books.containsKey(id))
      retur null;
    Book book = new Book(id, details);
    books.put(id, book);
    return book;
  }
  
  public boolean remove(book b) {return remove(b.getID());}
  public boolean remove(int id){
    if(!books.containsKey(id))
      return false;
    books.remove(id);
    return true;
  }
  
  public Book find(int id){
    return books.get(id);
  }
}


//////////////////////////////// UserManger

public class UserManager{
  private hashTable<Integer, User> users;
  
  public User addUser(int id, String details, int accountType){
    if(users.containsKey(id))
      return null;
    User user = new User(id, details, accountType?);
    users.put(id, user);
    return user;
  }
  
  public boolean remove(User u){
    return remove(u.getID());
  }
  
  public boolean remove(int id){
    if(!users.containsKey(id))
      return false;
    users.remove(id);
    return truel
  }
  
  public User find(int id){
    return users.get(id);
  }
}

///////////////////////////// Display

public class Display{
  private Book activeBook;
  private User activeUser;
  private int pageNumber = 0;
  
  public void display(User user){
    activeUser = user;
    refershUserName();
  }
  
  public void displayBook(Book book){
    pageNumber = 0;
    activeBook = book;
    refreshTitle();
    refershDetails();
    refershPage();
  }
  
  public void turnPageForward(){
    pageNum++;
    refreshPage();
  }
  
  public void turnPageBackward(){
    pageNum--;
    refershPage();
  }
  
  public void refershUserName() {}
  public void refershTitle() {}
  public void refershDetails() {}
  public void refershPage() {}
  
  
/////////////////////////////////////////////////////////////////////

public class Book{
  private int bookID;
  private String details;
  
  public Book(int id, String details){
    this.bookID = id;
    this.details = details;
  }
  
  public int getID() {return bookID;}
  public void getID(int id) {bookID = id;}
  public String getDetails() {return details;}
  public void setDetails(String details) {this.details = details;}
}

/////////////////////////////////////////////////////////////

public class User{
  private int userID;
  private String details;
  private int accountType;
  
  public void renewMemebership() {}
  
  public User(int id, String details, int accountType) {...}
  
  
  //a lot of get and set
  public int getID() {return userID;}
  public void setID(int id) {userID = id;}
  
}
