import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

class Arithmetic {

  def function31(i: Int): Boolean ={
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 to (i-1)).exists(x => i % x == 0)
  }
  def function32(number1: Int, number2: Int): Int ={
    if (number2 == 0) return number1
    return function32(number2, number1 % number2)
  }
  def function33(number1: Int, number2: Int): Boolean ={
    function32(number1,number2)==1
  }
  def function34(in: Int): Int ={
    var result = in
    var work = in
    var i = 2
    while ( {i * i <= work}) {
      if (work % i == 0) {
        while ( {work % i == 0})
          work = work / i
        result -= result / i
      }
      i += 1
    }
    if (work > 1) result -= result / work
    result
  }
  def function35(x: Int): List[Int] = {
    def foo(x: Int, a: Int): List[Int] = {
      if (a > Math.pow(x, 0.5))
        return List(x)
      x % a match {
        case 0 => a :: foo(x / a, a)
        case _ => foo(x, a + 1)
      }
    }
    foo(x, 2)
  }
  def function39(start: Int, end: Int):List[Int] ={
    val primes = new ListBuffer[Int]
    for(x <- start to end){
      if(function31(x)){
        primes+=x
      }
    }
    primes.toList
  }

  def function40(in: Int): (Int,Int) ={
    if(!(in%2==0)||(in<4)){
      (0,0)
    }else{
      for(i <- 3 to in){
        if(function31(i)&&function31(in-i)){
          return (i,in-i)
        }else{
          (0,0)
        }
      }
      (0,0)
    }
  }

}
