package euler.project.problem_13

import java.io.{BufferedReader, FileReader}

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 13:44
 * To change this template use File | Settings | File Templates.
 */

object SumOfIn extends App{
  val in: BufferedReader = new BufferedReader(new FileReader("C:\\scala-practice\\src\\euler\\project\\problem_13\\in.txt"))
  var sum: BigInt = BigInt(0)
  for (i <- 1 to 100) sum = sum + BigInt(in.readLine())
  println(sum)
  var s = 0
  val c = sum.toString().toCharArray
  for (i <- 0 until 10; ii = c(i).toInt - '0'.toInt){
    s = s + ii
  }
  println(s)
}