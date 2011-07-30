package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/14/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */

object AbstractTypeTest2 extends App{
  def newIntSeqBuf(elem1: Int, elem2: Int): SeqBuffer1[Int, Seq[Int]] =
    new SeqBuffer1[Int, Seq[Int]] {
         val element = List(elem1, elem2)
       }
  val buf = newIntSeqBuf(7, 8)
  println("length = " + buf.length)
  println("content = " + buf.element)
}

abstract class Buffer1[+T] {
  val element: T
}

abstract class SeqBuffer1[U, +T <: Seq[U]] extends Buffer1[T] {
  def length = element.length
}