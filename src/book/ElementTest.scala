package book

import book.Element.elem

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 7/17/11
 * Time: 5:14 AM
 * To change this template use File | Settings | File Templates.
 */

object ElementTest extends App{
  val left = elem("hello") above elem('*',4,4) above elem("world")
  val right = elem("world") above elem('*',4,4) above elem("hello")
  val res = elem('-',10,1) above (left beside elem('*',1,6)
            beside right) above elem('-',10,1) above elem(Array("Testing","Element","Class"))
  println(res)
}