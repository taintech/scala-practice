package euler.project.problem_7

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 10:06
 * To change this template use File | Settings | File Templates.
 */

object Prime extends App{
  val list: Array[BigInt] = (for {
    i <- 1L to 25000L
    i1: BigInt = 6*i + 1
    i2: BigInt = 6*i - 1
  } yield Array(i1,i2)).reduceLeft(_++_)
  val primelist = list.filter(_.isProbablePrime(100))
  val a: BigInt = 13L
  println(a.isProbablePrime(100))
  println(primelist.size)
  println(primelist(6-3))
  println(primelist(10001-2))
}