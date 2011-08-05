package euler.project.problem_15

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
//TODO
object GridPath extends App{
  def paths(n: Int): Long =  n match {
    case 2 => 6
    case _ => (paths(n-1)*2)+2*n
  }
  println(paths(20))
}