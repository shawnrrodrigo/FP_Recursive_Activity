object q4 extends App {
  var arr = Array(10, 13, 16, 17, 18, 22)

  def evenorodd(x:Int):Unit = {
    if(x%2 == 0 )
      println(x+ "- Even");

    else
      println(x+ "- Odd");

  }

  for(i<-0 to 5){
    evenorodd(arr(i));
  }

}
