package book

import scala.Console

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/15/11
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */

object ForExprTrimmedTest extends App {
  val filesHere = (new java.io.File("src/book/")).listFiles
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList
  def grep(pattern: String) =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } yield {
      println(file + ": " + trimmed)
      trimmed.length
    }

  this grep ".*App.*" foreach println
}