
//maintain seperate queue for dog and cat
//place them within a wrapper class called animal-queue. We then store some sort of timestamp to mark when each animal was enqueued.
//when we call dequeueAny, we peek at the heads of both the dogg and cat queue and return the oldest.

//abstract class Animal
public abstract class Animal{
  private int order;
  protected String name;
  public Animal(String n){
    name = n;
  }
  
  public void setOrder(int ord){
    order = ord;
  }
  
  public int getOrder(){
    return order;
  }
  
  public boolean isOlderThan(Animal a){
    return this.order < a.getOrder();
  }
}


//class Dog and Cat
 public class Dog extends Animal(){
    public Dog(String n){
      super(n);
    }
  }
  
  public class Cat extends Animal(){
    public Cat(String n){
      super(n);
    }
  }

//Class animal queue
public class AnimalQueue{
  LinkedList<Dog> dogs = new LinkedList<Dog>();
  LinkedList<Cat> cat = new LinkedList<Cat>();
  private int order = 0; //acts as timestamp
  
  public void enqueue(Animal a){
    a.setOrder(order);
    order++;
    
    if(a instanceof Dog) dogs.addLast((Dog)a);
    else if (a instanceof Cat) cats.addLast((Cat)a);
  }
  
  public Animal dequeueAny(){
    if(dogs.size() ==0)
      return dequeueCats();
    else if(cats.size()==0)
      return dequeueDogs();
      
    Dog dog = dogs.peek();
    Cat cat = cats.peek();
    if(dog.isOlderThan(cat))
      return dequeueDogs();
    else
      return dequeueCats();
  }
  
  
  public Dog dequeueDogs(){
    return dogs.poll();
  }
  
  public Cat dequeueCats(){
    return cats.poll();
  }
  
 
}
