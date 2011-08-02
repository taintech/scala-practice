package euler.project.problem_5

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */

object Divisible extends App{
  val list: Array[BigInt] = (for {
    i <- 1L to 3L
    i1: BigInt = 6*i + 1
    i2: BigInt = 6*i - 1
  } yield Array(i1,i2)).reduceLeft(_++_)
  val primelist = (Array[BigInt](2L,3L)++list.filter(_.isProbablePrime(100))).toList
  println(primelist)
  val mult = primelist.reduceLeft(_*_)
  for (i<-1 to 20) println(i+": "+(mult%i==0))
  val newMult = mult*24
  for (i<-1 to 20) println(i+": "+(newMult%i==0))
}