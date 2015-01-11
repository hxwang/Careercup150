

//Singleton class
//Explain: we want to implement Restaurant such that it has exactly one isntance of Restaurant
public class Restaurant{
  private static Restaurant _instance = null;
  public static Restaurant getInstance(){
    if(_instance == null)
      _instance = new Restaurant();
    return _instance;
  }
}

//Factory method
//The factory method offers an interface for cerating an instance of a class, with its subclass deciding which class to instantiate. 

public class CardGame{
  public static CardGame createCardGame(GameType type){
    if(type == GameType.poker){
      return new PockerGame();
    else if(type == GameType.BlackJack)
      return new BlackJackerGame();
    return null;
    }
  }
}
