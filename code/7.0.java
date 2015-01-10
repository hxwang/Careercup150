

//generating a list of primes: the sieve of eratosthenes

boolean[] sieveOfEratosthenes(int max){
  boolean[] flags = new boolean[max+1];
  int count = 0;
  
  init(flags); //set all flags to true other than 0 and 1
  int prime = 2;
  
  while(prime <= max){
    //cross of remaining multiples of primes
    crossOff(flags, prime);
    
    //get next value which is true
    prime = getNextPrime(flags, prime);
    
    if(prime >= flags.length)
      break;
  }
  
  return flags;
  
}
