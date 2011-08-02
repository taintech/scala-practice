package euler.project.problem_4

import java.util.Arrays

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 9:43
 * To change this template use File | Settings | File Templates.
 */

object Palindrome extends App{
  var max = 0
  val list = for {
    i <- 100 to 999
    j <- 100 to 999
    num = i*j
    str = num.toString
    if str==str.reverse
  } yield {
      if (num>max) max=num
      str
    }
  println(list)
  println(max)
}