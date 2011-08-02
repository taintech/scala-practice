package euler.project.problem_8

import java.math.BigInteger
import java.io.{FileReader, BufferedReader, File, PrintWriter}

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 10:48
 * To change this template use File | Settings | File Templates.
 */
object HundredDigit extends App{
  val in: BufferedReader = new BufferedReader(new FileReader("C:\\scala-practice\\src\\euler\\project\\problem_8\\in.txt"))
  var num: String = ""
  for (i <- 1 to 20) num = num + in.readLine()
  var max = 0L
  val ar = num.toCharArray
  val list: List[Int] = (for (i <- 0 until ar.length-4;
    mult: Long = (ar(i).toInt-'0'.toInt)*(ar(i+1).toInt-'0'.toInt)*(ar(i+2).toInt-'0'.toInt)*(ar(i+3).toInt-'0'.toInt)*(ar(i+4).toInt-'0'.toInt)
  ) yield{
    if (max<mult) max = mult
    i
  } ).toList
  println(list)
  println(max)
}