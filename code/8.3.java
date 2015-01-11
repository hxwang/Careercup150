
////////////////My design
public class Jukebox{
  private boolean coined;
  private static coinValue = 1;
  public Jukebox() {}
  public void RequestPlayMusic(String num) {
    if(coined){
      playMusic(num);
    }
    coined = false;
  }
  
  public void playMusic(String num){
  
  }
  
  public void displayInputCoin(){
    System.out.println("Please Input coin");
  }
  
  public void getCoin(Coin coin){
    coined = true;
  }
  
  public void resetCoin(Coin coin){
    coined = false;
  }
}

/////////////////////////////////////////////// Reference
//Each componenet translats roughly to an object, and each action translates to a method

public class JukeBox{
  private CDPlayer cdPlayer;
  private User user;
  private Set<CD> cdCollection;
  rivate SongSelector ts;
  
  public JukeBox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector ts) {...}
  
  public Song getCurrentSong() {return ts.getCurrentSong();}
  
  public void setUser(User u) {this.user = u;}
}

////////////////////////////////////////////////////////////////////////
//Like a real CD player, the CDPlayer class supports storing just one CD at a time, The CDs are not in paly are sotred in thejukebox

public class CDPlayer{
  private PlayList p;
  private CD c;
  
  public CDPlayer(CD c, Playlist p) {...}
  public CDPlayer(Playlist p) {this.p = p;}
  public CDPlayer(CD c) [this.c = c;}
  
  //play song
  public void playSong(Song s) {...}
  
  //getters and setts
  public PlayList getPlayList() {return p;}
  public void setPlayList(PlayList p) {this.p = p;}
  
  public CD getCD() {return c;}
  public void setCD(CD c) {this.c = c;}
}


///////////////////////////////////////////////////////////
//The playlist manages the current and next songs to play, it is essentially a rapper class for a queue and offers some additional methods for convenience

public class PlayList{
  
  private Song song;
  private Queue<Song> queue;
  public Playlist(Song song, Queue<Song> queue) {...}
  
  public Song getNextToPlay() {return queue.peek(); }
  
  public void queueUpSong(Song s) {queue.add(s);}
}

/////////////////////////////////////////////////////////////
