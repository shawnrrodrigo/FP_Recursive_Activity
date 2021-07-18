object q1 extends App{
  def prime(n:Int, i:Int):Boolean = {
    if(n == 2) return true;

    if(n%i == 0) return false;

    if(i*i > n) return true;

    return prime(n, i+1);
  }

  println(prime(5, 2));
}
