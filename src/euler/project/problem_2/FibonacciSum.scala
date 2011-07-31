package euler.project.problem_2

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/31/11
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */

object FibonacciSum extends App{
  def fib(n: Long) = fib_tr(n, 0, 1)
  def fib_tr(n: Long, b: Long, a: Long): Long = n match {
    case 0 => a
    case _ => fib_tr(n-1, a + b, b)
  }

  println(fib(50))
  val list = for {
    i <- 1 to 50
    f = fib(i)
    if f<4000000&&f%2==0
  } yield {
    f
  }

  println(list)
  val sum: Long = list.reduceLeft(_+_)
  println(sum)
}