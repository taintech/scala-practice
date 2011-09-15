package euler.project.problem_15

import scala.math._

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
object GridPath extends App{
  def count(n: Int) = count_tr(n,n)
  //TODO it has some addition
  def count_tr(n: Int, k: Int): Int = k match {
    case 1 => 2
    case 2 => 6
    case _ => {
      if (k%2==0) pow(count_tr(n,k/2),2).toInt
      else count_tr(n,k/2)*count_tr(n,k/2+1)
    }
  }
  println(count(20))
}