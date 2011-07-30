package book

import collection.mutable.ArrayBuffer

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/20/11
 * Time: 6:45 PM
 * To change this template use File | Settings | File Templates.
 */

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get(): Int = buf.remove(0)
  def put(x: Int) = { buf += x }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put( 2 * x ) }
}
trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put( x + 1 ) }
}
trait Filtering extends IntQueue {
  abstract override def put(x: Int) { if(x>0) super.put( x ) }
}

object MixinsTest extends App {
  val queue = new BasicIntQueue
  queue.put(10)
  queue.put(20)
  queue.put(30)
  println(queue.get())
  println(queue.get())
  println(queue.get())
  val queueD = new BasicIntQueue with Doubling
  queueD.put(10)
  println(queueD.get())
  val queueIF = new BasicIntQueue with Incrementing with Filtering
  val queueFI = new BasicIntQueue with Filtering with Incrementing
  queueIF.put(-1); queueIF.put(0); queueIF.put(1)
  queueFI.put(-1); queueFI.put(0); queueFI.put(1)
  println(queueIF.get() + "|" + queueFI.get())
}