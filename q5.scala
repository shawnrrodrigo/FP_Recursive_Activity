object q5 extends App {
  def addEven(x:Int):Int = {
    if(x > 0){
      if(x%2 != 0) return addEven(x - 1);

      else return x + addEven(x - 2);
    }

    else return x;
  }
  println("Total of Even numbers: "+addEven(6));
}
