package euler.project.problem_12

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
//TODO
object Factorization extends App{
  val list: Array[BigInt] = (for {
    i <- 1L to 600L
    i1: BigInt = 6*i + 1
    i2: BigInt = 6*i - 1
  } yield Array(i1,i2)).reduceLeft(_++_)
  val primelist = list.filter(_.isProbablePrime(100))
  println(primelist.size)
  def factorsNumber(n: Long): Long = factors_tr(n,1,0)
  def factors_tr(n: Long,f: Long,count: Long): Long = (n%f) match {
    case 0L if f==n => count+1
    case 0L => factors_tr(n,f+1,count+1)
    case _ => factors_tr(n,f+1,count)
  }
}