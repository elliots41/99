import scala.collection.mutable.ListBuffer

class Lists {


  def function1(list: List[Any]): Unit ={
    println(list.last)
  }
  def function2(list: List[Any]): Unit ={
    println(list.init.last)
  }
  def function3(int: Int, list: List[Any]): Unit ={
    println(list(int))
  }
  def function4(list: List[Any]): Unit ={
    println(list.length)
  }
  def function5(list: List[Any]): Unit={
    println(list.reverse)
  }
  def function6(list: List[Any]): Unit={
    println(list.reverse==list)
  }
  def function7(list: List[Any]): List[Any] = list flatMap {
    case ms: List[_] => function7(ms)
    case e => List(e)
  } //just use list.flatten in the main block not a function same result
  def function8(list: List[Any]): Unit={
    println(list.distinct)
  }
  def function9(list: List[Any]): List[List[Any]]={
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: function9(next)
    }
  }
  def function10(list: List[Any]): List[Any] ={
    function9(list).map(e => (e.length, e.head))
  }
  def function11(list: List[Any]): List[Any] ={
    function9(list).map(e => (if(e.length==1) e.head else (e.length, e.head)))
  }
  def function12(list: List[Any]): Unit ={
    //dont know how to do this one, come back to it
  }
  def function13(list: List[Any]): Unit={
    //this one is stupid not doing it, just 9&10 together
  }
  def function14(list: List[Any]): List[Any] ={
    list flatMap { e => List(e, e) }
  }
  def function15(count: Int,list: List[Any]): List[Any] ={
    list flatMap { e => List.fill(count)(e)}
  }
  def function16(count: Int,list: List[Any]): List[Any] ={
    list.zipWithIndex filter { v => (v._2 + 1) % count != 0 } map { _._1 }
  }
  def function17(count: Int,list: List[Any]): List[Any] ={
    println(list.splitAt(count)._1)
    list.splitAt(count)._2
  }
  def function18(first: Int,second: Int,list: List[Any]): List[Any] ={
    list.take(list.length-first).splitAt(first-1)._2
  }
  def function19(count: Int,list: List[Any]): List[Any] ={
    val end = list.splitAt(count)._1
    val front = list.splitAt(count)._2
    function7(front::end)
  }
  def function20(count: Int,list: List[Any]): (List[Any], Any) ={
    val rmv = list(count-1)
    val (l1, l2) = list splitAt count-1
    val l3 = l1 ::: (l2 drop 1)
    (l3, rmv)
  }
  def function21(insert: Any,count: Int,list: List[Any]): List[Any] ={
    val front = list.splitAt(count)._1
    val back = list.splitAt(count)._2
    function7(front::insert::back)
  }
  def function22(start: Int, end: Int): List[Any] ={
    (start to end).toList
  }
  def function23(count: Int, list: List[Any]): List[Any]={
    val r = scala.util.Random
    var out = new ListBuffer[Any]()
    var x=1;
    while(x <= count){
      out += list(r.nextInt(list.length-1))
      x+=1
    }
    out.toList
  }
  def function24(n: Int, m: Int): List[Int]={
    val r = scala.util.Random
    var out = new ListBuffer[Int]()
    for(w <- 0 to n-1){
      out += r.nextInt(m)
    }
    out.toList
  }
  def function25(list: List[Any]): List[Any]={
    val rand = new util.Random
    val a = list.toArray
    for (i <- a.length - 1 to 1 by -1) {
      val i1 = rand.nextInt(i + 1)
      val t = a(i)
      a.update(i, a(i1))
      a.update(i1, t)
    }
    a.toList
  }
}
