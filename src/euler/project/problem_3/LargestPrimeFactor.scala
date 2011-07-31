package euler.project.problem_3

import scala.math._
import java.math.BigInteger

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/31/11
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */

object LargestPrimeFactor extends App{
  def primitivePrime(n: Int) = primitivePrime_tr(n,n/2)
  def primitivePrime_tr(n: Int, m: Int): Boolean = m match {
    case 1 => true
    case _ if(n%m==0) => false
    case _ => primitivePrime_tr(n,m-1)
  }

  val listPrimitivePrime = for (i <- 2 to 1000 if primitivePrime(i)) yield i
  println(listPrimitivePrime)
  println(listPrimitivePrime.size)
  //6*n+1 or 6*n-1
  //increment with 2 and 4
  def smallestFactor(n: Long) = smallestFactor_tr(n,2)
  def smallestFactor_tr(n: Long, m: Long): Long = m match {
    case _ if n%m==0 => m
    case _ => smallestFactor_tr(n,m+1)
  }
//  println(smallestFactor(600851475143L))
  val inc = Pair(2,4)
  val div = 600851475143L/2
  val div1 = 13195/2
  def gpfPrimitive(n: Long) = gpfPrimitive_tr(n,3,1,0)
  def gpfPrimitive_tr(n: Long, m: Long, id: Long, ans: Long): Long = id match {
    case _ if id>100 => ans
    case _ if n%m==0&&id%2==0 => gpfPrimitive_tr(n,m+inc._1,id+1,m)
    case _ if n%m==0&&id%2==1 => gpfPrimitive_tr(n,m+inc._2,id+1,m)
    case _ if n%m==1&&id%2==0 => gpfPrimitive_tr(n,m+inc._1,id+1,ans)
    case _ => gpfPrimitive_tr(n,m+inc._2,id+1,ans)
  }
  println(gpfPrimitive(13195))
//  val a1: BigInt = 203
//  val a1: BigInt = 207
  val a1: BigInt = 199
//  val a2: BigInt = 201
//  val a2: BigInt = 209
  val a2: BigInt = 215

  println(a1.isProbablePrime(100))
  println(a2.isProbablePrime(100))
  println()
//  println(gpfPrimitive(13195))
}