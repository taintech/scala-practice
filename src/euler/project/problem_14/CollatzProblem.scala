package euler.project.problem_14

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 8/3/11
 * Time: 1:21 AM
 * To change this template use File | Settings | File Templates.
 */
object CollatzProblem extends App{
  def chain = chain_tr(List(8),List(4))
  def chain_tr(list: List[Int], last: List[Int]): List[Int] = {
    if (list.isEmpty) last
    else chain_tr(generate(List(),list).filter(_<3000000),list)
  }
  def generate(list: List[Int],remainder: List[Int]): List[Int] = remainder match {
    case List() => list
    case x::xt => generate(list:::next(x),xt)
  }
  def next(n:Int): List[Int] = if ((n-1)%3==0&&((n-1)/3)%2==1) (n-1)/3::2*n::Nil  else 2*n::Nil

  def nextItem(n: Long): Long = if (n%2==0) n/2L else 3*n+1L
  def recCount(n: Long): Long = recCount_tr(n,1)
  def recCount_tr(n: Long, count: Long): Long = n match {
    case 1 => count
    case _ => recCount_tr(nextItem(n),count+1)
  }
  var max = 0L;
  var num = 0L;
  for ( i<- 1 until 1000000; next = recCount(i)) {
    if (max<next){
      num = i
      max = next
    }
  }
  println(num)
}