package euler.project.problem_3

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 8/1/11
 * Time: 1:26 AM
 * To change this template use File | Settings | File Templates.
 */

object Experiment extends App{

  val prefixArray = Array[BigInt](2L,3L)
  def primes(n: Long,certainty: Int) = prefixArray ++ primes_tr(n,1,Array[BigInt]()).filter(_.isProbablePrime(certainty))
  def primes_tr(n: Long, it: Long, list: Array[BigInt]): Array[BigInt] = {
    if (it>=n) list
    else primes_tr(n,it+1,list ++ Array[BigInt](it*6+1,it*6-1))
  }
  val start1 = System.currentTimeMillis()
  val primes1 = primes(100000,100)
  println((System.currentTimeMillis()-start1)+":" + primes1.size)
  val start2 = System.currentTimeMillis()
  val primes2 = primes(100000,10)
  println((System.currentTimeMillis()-start2)+":" + primes2.size)
//  val start3 = System.currentTimeMillis()
//  val primes3 = primes(100000,7)
//  println((System.currentTimeMillis()-start3)+":" + primes3.size)
}