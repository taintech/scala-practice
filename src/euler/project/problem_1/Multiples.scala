package euler.project.problem_1

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/31/11
 * Time: 2:45 PM
 * To change this template use File | Settings | File Templates.
 */

object Multiples extends App{
  def sum: Long = sum_tr(0,0)
  def sum_tr(sum: Long, n: Long): Long = n match {
    case 1000 => sum
    case _ if (n%3==0||n%5==0)=> sum_tr(sum+n, n+1)
    case _ => sum_tr(sum, n+1)
  }
  println(sum)
}