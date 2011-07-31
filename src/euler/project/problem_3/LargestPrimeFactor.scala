package euler.project.problem_3

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/31/11
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */

object LargestPrimeFactor extends App{
  def primity(n: Long): Boolean = primity_tr(n,n/2)
  def primity_tr(n: Long, m: Long): Boolean = m match {
    case 1 => true
    case _ if(n%m==0) => false
    case _ => primity_tr(n,m-1)
  }
  def large(n: Long): Long = large_tr(n,n/2)
  def large_tr(n: Long, m: Long): Long = m match {
    case 1 => 1
    case _ if(n%m==0&&primity(m)) => m
    case _ => large_tr(n,m-1)
  }
  println(primity(600851475143L))
//  println(large(600851475143L))
}