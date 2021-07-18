object q6 extends App {
  def fib(x:Int):Int = {
    if(x <= 1) return x;
    else return fib(x-1) + fib(x-2);
  }

  for(i<-0 to 5){
    println(fib(i));
  }


}
