package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/15/11
 * Time: 11:59 AM
 * To change this template use File | Settings | File Templates.
 */

object ComprehensionTest1 extends App {
  def even(from: Int, to: Int): List[Int] =
    for(i <- (from to to).toList if i%2==0) yield i

  println(even(1,19))
  val six = 6
  val sequence = (1 to six).toList
  println(sequence)
}