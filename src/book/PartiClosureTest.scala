package book

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/16/11
 * Time: 1:02 PM
 * To change this template use File | Settings | File Templates.
 */

object PartiClosureTest extends App {
  def thesum(a: Int, b: Int, c: Int) = a + b + c
  println(thesum(1,2,3))
  val a = thesum _
  println(a(1,2,3))
  val b = thesum(1,_: Int,3)
  println(b(2))
  //Closures
  println(" -> closure started here")
  var more = 1
  val addMore = (x: Int) => x +more
  println(addMore(10))
  more = 999
  println(addMore(10))
  val someNumbers = List(-11,-10, -5, 0, 5, 10)
  var sum = 0
  someNumbers.foreach(sum += _)
  println(sum)
  def makeIncreaser(onemore: Int) = (x: Int) => x +onemore
  val inc1 = makeIncreaser(1)
  val inc999 = makeIncreaser(999)
  println(inc1(10))
  println(inc999(10))
}