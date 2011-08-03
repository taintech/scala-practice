package euler.project.problem_12

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
object Factorization extends App{
  def triangleNumber(n: Int): Long = ((n.toDouble/2)*(n+1)).toLong
  def factors(n: Long): Array[Int] = factors_tr(n,Array(),1)
  def factors_tr(n: Long,list: Array[Int],i: Int): Array[Int] = n%i match {
    case 0 if (n==i) => list
    case 0 if ((!list.isEmpty)&&(n/i).toInt==list.head) => list
    case 0 if (n/i==i) => Array(i.toInt)++list
    case _ if (i>n/2) => list
    case 0 => factors_tr(n,Array(i.toInt,(n/i).toInt)++list,i+1)
    case _ => factors_tr(n,list,i+1)
  }
  def res = res_tr(1,0)
  def res_tr(n: Int,length: Int): Long =
    if (length>500) triangleNumber(n-1)
    else res_tr(n+1,factors(triangleNumber(n)).length)
  println(res)
}