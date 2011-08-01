package euler.project.problem_20

import java.math.BigInteger

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */

object SumOfFactorial extends App{
  def factorial(n: Int): BigInt =
    if (n == 0) 1
           else factorial(n - 1) * n
  val fact = factorial(100)
  var sum = 0L
  for (c <- fact.toString.toCharArray; i = c.toLong - '0'.toLong){
    sum = sum + i
  }
  println(sum)

}