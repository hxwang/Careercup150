
////////////////////////////////////// My design
public class User{
  private int id;
  private ArrayList<File> files;
  public User(int id){
    this.id = id;
    files = new ArrayList<File>();
  }
  
  public void createFile() {}
  
  public void deleteFile() {}
}

public class File{

  private int fid;
  private int startAdd;
  private User owner;
  public File(int fid, User owner){
    this.fid = fid;
    this.owner = owner;
  }
  
  public void setFileAdd(int add) {this.startAdd = add;}
}

public class FileSystem{
  private HashTable<Integer, File> fileByUser;
  private HashTable<Integer, File> fileById;
  private static int memorySize;
  private static FileSystem instance;
  private Memory memory;
  
  public FileSystem(int memorySize){
    memory = new Memory(memorySize);
  }
  
  public FileSystem getInstance(){
    if(instace == null) instance = new FileSystem();
    return instance;
  }
  
  public int getFileByUser(User u);
  public int getFileById(int fid);
  
  public void addFile(File f) {}
  public void removeFile(File f) {}
}

public class Memory{
  private static int memorySize;
  private boolean[] used;
  
  public Memory(int memorySize){
    memorySize = memorySize;
    userd = new boolean[memorySize];
  }
  
  public int getAvailableAdd(int size){}
  
  public int setOccupied(int start, int size){}
  
  public int setEmpty(int start, int size){}
}


/////////////////////////////////////////////// Reference

//A file system, in its most simplistic version, consists of Files and Directories
//Each directory, contains a set of Files and Directories
//As files and directories share so many characteristics, we implement them such that they inherit from the same class, Entry

public abstact class Entry{
  protected Directory parent;
  protected long created;
  protected long lastUpdated;
  protected long lastAccessed;
  protected String name;
  
  public Entry(String n, Directory p){
    name = n;
    parent = p;
    created = System.currentTimeMills();
    lastUpdated = System.currentTimeMills();
    lastAccessed = System.currentTimeMills();
  }
  
  public boolean delete() {
    if(parent ==null) return false;
    return parent.deleteEntry(this);
  }
  
  public abstract int size();
  
  public String getFullPath(){
    if(parent == null) return name;
    else return parent.getFullPath + "/" + name;
  }
  
  //Getters and Setters
  public long getCreationTime() {return created;}
  public long getLastUpdatedTime() {return lastUpdated;}
  public long getLastAccessedTime() {return lastAccessed;}
  public void changeName(String n) {name = n;}
  public String getName() {return name;}
}

public class File extends entry{
  private String content;
  private int size;
  
  public File(String n, Directory p, int sz){
    super(n,p);
    size = sz;
  }
  
  public int size() {return size;}
  public String getContent() {return contents;}
  public void setContent(String c) {content = c;}
}

public class Directory extends Entry{
  protected ArrayList<Entry> contents;
  
  public Directory(String n, Directory p){
    super(n,p);
    contents = new ArrayList<Entry>();
  }
  
  public int size(){
    int size = 0;
    for(Entry e :contents){
      size += e.size();
    }
    
    return size;
  }
  
  public int numberOfFiles(){
    int count = 0;
    for(Entry e: contents){
      if(e instanceOf Directory){
        count++;
        Directory d= (Directory) e;
        count += d.numberOfFIles();
      }
      else if(e instanceOf File){
        count++;
      }
    }
    
    return count;
  }
  
  public boolean deleteEntry(Entry entry){
    return contents.remove(entry);
  }
  
  public void addEntry(Entry entry){
    contents.add(entry);
  }
  
  protected ArrayList<Entry> getContents() {return contents; }
}
