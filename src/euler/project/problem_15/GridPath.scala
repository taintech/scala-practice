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
  var res: BigInt = 1L;
  for (i <- 2L to 3L) res = res * i;
  println(res)
}