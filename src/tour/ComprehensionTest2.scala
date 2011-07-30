package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/15/11
 * Time: 11:59 AM
 * To change this template use File | Settings | File Templates.
 */

object ComprehensionTest2 extends App {
  def foo(n: Int, v: Int) =
    for (i <- 0 until n;
         j <- i + 1 until n if i + j == v) yield
        Pair(i, j);
  foo(20, 32) foreach {
    case (i,j) => println("(" + i + ", "+ j +")")
  }
}