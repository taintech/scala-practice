package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/14/11
 * Time: 10:59 PM
 * To change this template use File | Settings | File Templates.
 */

object ClassReprTest {
  abstract class Bar {
    type T <:AnyRef
    def bar(x: T) {
      println("5: " + x.getClass)
    }
  }
  def main(args: Array[String]) {
    println("1: " + args.getClass)
    println("2: " + classOf[Array[String]])
    new Bar {
      type T = Array[String]
      val x: T = args
      println("3: " + x.getClass)
      println("4: " + classOf[T])
    }.bar(args)
  }
}