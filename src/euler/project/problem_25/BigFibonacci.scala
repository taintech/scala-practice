package euler.project.problem_25

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 13:16
 * To change this template use File | Settings | File Templates.
 */
//TODO
object BigFibonacci extends App{
  val k: BigInt = BigInt(1000000)
  def fib(n: BigInt) = fib_tr(n, 0L, 1L)
  def fib_tr(n: BigInt, b: BigInt, a: BigInt): BigInt = n match {
    case any: BigInt if any==0 => n
    case any: BigInt if(any.toString().length()>=1000) => n
    case _ => fib_tr(n-1L, a + b, b)
  }
  val f: BigInt = fib(k)
  println(k-f)
  println(f)
}