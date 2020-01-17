class Logic {

  def and(one: Boolean, two: Boolean): Boolean={one&&two}
  def or(one: Boolean, two: Boolean): Boolean={one||two}
  def nor(one: Boolean, two: Boolean): Boolean={(!one)&&(!two)}
  def xor(one: Boolean, two: Boolean): Boolean={((!one)&&(two))||((one)&&(!two))}
  def eq(one: Boolean, two: Boolean): Boolean={(!one)&&(!two)||(one)&&(two)}

  def truthTable(operator: String): Unit ={
    operator match {
      case "and" => {println("A     |   B   |  Result")
        println("false | false | false")
        println("false | true  | false")
        println("true  | false | false")
        println("true  | true  | true")}
      case "or" => {println("A     |   B   |  Result")
        println("false | false | false")
        println("false | true  | true")
        println("true  | false | true")
        println("true  | true  | true")}
      case "nor" => {println("A     |   B   |  Result")
        println("false | false | true")
        println("false | true  | false")
        println("true  | false | false")
        println("true  | true  | false")}
      case "xor" => {println("A     |   B   |  Result")
        println("false | false | false")
        println("false | true  | true")
        println("true  | false | true")
        println("true  | true  | false")}
      case "eq" => {println("A     |   B   |  Result")
        println("false | false | true")
        println("false | true  | false")
        println("true  | false | false")
        println("true  | true  | true")}
    }
  }
  def grayGenerator(bit: Int): List[String] ={
    if(bit==0){
      List("")
    }else{
        //prefix start with 0
        val low = grayGenerator(bit-1)
      (low map { "0" + _ }) ::: (low.reverse map { "1" + _ })
    }
  }
  def intToGray(in: Int): String={(in^(in>>1)).toBinaryString}

}
