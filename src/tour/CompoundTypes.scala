package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/14/11
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */

object CompoundTypes extends App{
  println("Compilable")
  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone
    obj.reset
    cloned
  }
}

trait Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = { super.clone(); this}
}
trait Resetable {
  def reset: Unit
}