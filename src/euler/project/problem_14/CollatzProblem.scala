package euler.project.problem_14

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 8/3/11
 * Time: 1:21 AM
 * To change this template use File | Settings | File Templates.
 */
//todo solve
object CollatzProblem extends App{
  def chain = chain_tr(List(8),List(4))
  def chain_tr(list: List[Int], last: List[Int]): List[Int] = {
//    println(list)
    if (list.isEmpty) last
    else chain_tr(generate(List(),list).filter(_<1000000),list)
  }
  def generate(list: List[Int],remainder: List[Int]): List[Int] = remainder match {
    case List() => list
    case x::xt => generate(list:::next(x),xt)
  }
  def next(n:Int): List[Int] = if ((n-1)%3==0&&((n-1)/3)%2==1) (n-1)/3::2*n::Nil  else 2*n::Nil
  println(chain)
}