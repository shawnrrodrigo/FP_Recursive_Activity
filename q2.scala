object q2 extends App{
  def isPrime(n:Int, i:Int):Boolean = {
    if(n == 2) return true;

    if(n%i == 0) return false;

    if(i*i > n) return true;

    return isPrime(n, i+1);
  }

  def primeSeq(n:Int):Unit = {
      if(n > 1){
        if(isPrime(n, 2)){
          print(n);
          print(" ");
        }
        primeSeq(n-1);
      }
  }
  primeSeq(10);

}
