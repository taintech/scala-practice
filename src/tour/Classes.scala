package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/14/11
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */

object Classes extends App {
  val pt = new Point(1,2)
  println(pt)
  pt.move(10,10)
  println(pt)
}

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc
  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }
  override def toString(): String = "(" + x + ", " + y + ")"
}