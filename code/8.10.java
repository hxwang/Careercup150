
////////////////////////////// My design
public class HashTable{

  private Table[] tables;
  private int size;
  
  public HashTable(int size){
    tables = new Table[size];
  }
  
  private int hashcode(Key key){
    return hash(key);
  }
  
  public boolean getValue(Key key) {}
  
  public boolean removeValye(Key key) {}
  
  public boolean insertValue(Key key, Value value) {}
}

public class Table{
  private LinkedList<Value> values;
  private LinkedList<Key> keys;
  
  public Table(){
    values = new LinkedList<Value>;
    keys = new LinkedList<Key>;
  }
  
  public boolean getValue(Key key) {}
  public boolean removeValue(Key key) {} 
  public boolean insertValue(Key key,Value value) {}
}


/////////////////////////////////////////// References

//Instead of using both values and keys LinkedList, we can create Cell which pairs keys and values

public class Hash<K, V>{
  private final int MAX_SIZE = 10;
  LinkedList<Cell<K,V>>[] items;
  
  public hash(){
    items = (LinkedList<<Cell<K,V>>[]) new LinkedList[MAX_SIZE]; 
  }
  
  //simple hash
  public int hashCodeOfKey(K key){
    return key.toString().length() % items.length;
  }
  
  public void put(K key, V value){
    int x = hashCodeOfKey(key);
    if(items[x] == null)
      item[x] = new LinkedList<Cell<K,V>>();
    
    LinkedList<Cell<K,V>> collied = items[x];
    
    for(Cell<K,V> c : collied){
      if(c.equavalent(key)){
        collied.remove(c);
        break;
      }
    }
    
    Cell<K,V> cell = new Cell<K,V>(key, value);
    collied.add(cell);
  }
  
  public V get(K key){
    int x = hashCodeOfKey(key);
    if(items[x] == null){
      return null;
    }
    LinkedList<Cell<K,V>> collid = items[k];
    for(Cell<K,V> c : collied){
      if( c.equivalent(key))
        reuturn c.getValue();
    }
    
    return null;
  }
}


////////////////////////////////// Cell

public class Cell<K,V>{
  private K key;
  private V value;
  public Cell(K k, V v){
    key = k;
    value = v;
  }
  
  public boolean equivalent(Cell<K, V> c){
    return equivalent(c.getKey());
  }
  
  public boolean equivalent(K k){
    return key.equals(k);
  }
  
  public K getKey() {return key;}
  public V getValue() {return value; }
}
