package euler.project.problem_16

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 12:55
 * To change this template use File | Settings | File Templates.
 */

object SumOfBig extends App{
  val b: BigInt = BigInt(2).pow(1000)
  var sum = 0
  for (c <- b.toString().toCharArray; i = c.toInt - '0'.toInt){
    sum = sum + i
  }
  println(sum)
}