package euler.project.problem_10

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */

object PrimeSum extends App{
  var sum: Long = 0L
  for {
    i <- 1 to (2000000/6).toInt
    i1: BigInt = 6*i + 1L
    i2: BigInt = 6*i - 1L
  } {
    if (i1.isProbablePrime(10)) sum = sum + i1.toLong
    if (i2.isProbablePrime(10)) sum = sum + i2.toLong
  }
  println(sum+2+3)
}