package euler.project.problem_9

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */

object Pythagor extends App{
  def find: Long = pyth(1L,1L,1L)
  def pyth(a: Long, b: Long, c: Long): Long = (a+b+c) match {
    case 1000L if a*a+b*b==c*c => a*b*c
    case _ if b<499L => pyth(a,b+1L,1000L-(b+1L)-a)
    case _ => pyth(a+1L,0L,1000L-(a+1L))
  }
  println(find)
}