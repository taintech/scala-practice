package tour

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/14/11
 * Time: 9:56 PM
 * To change this template use File | Settings | File Templates.
 */

object CaseClasses extends App{
  Fun("x", Fun("y", Appl(Var("x"), Var("y"))))
  val x = Var("x")
  println(x.name)

  val x1 = Var("x")
  val x2 = Var("x")
  val y1 = Var("y")
  println("" + x1 + "==" + x2 + " => " + (x1==x2))
  println("" + x1 + "==" + y1 + " => " + (x1==y1))
}

abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class Appl(f: Term, v: Term) extends Term
