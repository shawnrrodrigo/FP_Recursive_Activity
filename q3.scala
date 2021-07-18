object q3 extends App {
  def addNumber(x:Int):Int = {
    if(x >= 1) return x + addNumber(x-1);

    else return x;
  }

  println("Total: "+addNumber(5));
}
