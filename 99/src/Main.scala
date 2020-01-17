import scala.collection.mutable.ListBuffer

object Main {
  val list = List(1,2,3,4,5,6,7,8,9)
  val list1 = List(1,2,3,2,1)
  val list2 = List(List(1,2,2), List(3,4,5,5,5), List(6,7,8,9,9,9,9))
  val list3 = List(1,1,2,3,4,5,5)

  def main(args: Array[String]): Unit = {
    val lonalulu = new Lists
    println(lonalulu.function25(list))
    val sniflehiem = new Arithmetic
    println(sniflehiem.function35(2147483647))
    val hotto = new Logic
    println(hotto.intToGray(2147483647))
  }
}
