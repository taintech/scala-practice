package euler.project.problem_11

import java.io.{FileReader, BufferedReader}
import java.util.StringTokenizer

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 01.08.11
 * Time: 14:28
 * To change this template use File | Settings | File Templates.
 */

object DioganalLineSum extends App{
  val in: BufferedReader = new BufferedReader(new FileReader("C:\\scala-practice\\src\\euler\\project\\problem_11\\in.txt"))
  val list: List[List[Int]] = (for (i <- 1 to 20) yield {
    (for (j <- in.readLine().split(' '); num = j.toInt) yield num).toList
  }).toList
  var max = 0;
  for {i <- 0 until 20
       j <- 0 until 20}
  {
    try{
      val forward = list(i)(j)*list(i)(j+1)*list(i)(j+2)*list(i)(j+3)
      if(forward>max) max = forward
    } catch{
      case e: IndexOutOfBoundsException =>
    }
    try{
      val forwardDown = list(i)(j)*list(i+1)(j+1)*list(i+2)(j+2)*list(i+3)(j+3)
      if(forwardDown>max) max = forwardDown
    } catch{
      case e: IndexOutOfBoundsException =>
    }
    try{
      val down = list(i)(j)*list(i+1)(j)*list(i+2)(j)*list(i+3)(j)
      if(down>max) max = down
    } catch{
      case e: IndexOutOfBoundsException =>
    }
    try{
      val backwardDown = list(i)(j)*list(i+1)(j-1)*list(i+2)(j-2)*list(i+3)(j-3)
      if(backwardDown>max) max = backwardDown
    } catch{
      case e: IndexOutOfBoundsException =>
    }
    try{
      val backward = list(i)(j)*list(i)(j-1)*list(i)(j-2)*list(i)(j-3)
      if(backward>max) max = backward
    } catch{
      case e: IndexOutOfBoundsException =>
    }
    1
  }
  println(max)
}