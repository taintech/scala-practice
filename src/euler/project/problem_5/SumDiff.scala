package euler.project.problem_5

import scala.math._

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 9:58
 * To change this template use File | Settings | File Templates.
 */

object SumDiff extends App{
  val squareSum = (pow((1+100)*50,2)).toLong
  var sumSquare = 0
  for {
    i <- 1 to 100
    square = i*i
  }  sumSquare = sumSquare + square
  println(squareSum)
  println(sumSquare)
  println((squareSum-sumSquare))
}