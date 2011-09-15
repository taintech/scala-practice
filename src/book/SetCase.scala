package book

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 9/15/11
 * Time: 1:22 AM
 * To change this template use File | Settings | File Templates.
 */

object Test{
  def main(args: Array[String]){
    val simple1 = ItemSimple(1,2)
    val simple2 = ItemSimple(1,3)
    println(simple1==simple2)
    val strange1 = ItemStrange(1,2)
    val strange2 = ItemStrange(1,3)
    println(strange1==strange2)
    val setSimple1 = Set(ItemSimple(4,1),ItemSimple(3,100))
    val setSimple2 = Set(ItemSimple(3,20),ItemSimple(2,10))
    Console println (setSimple1 -- (setSimple1 & setSimple2))
    val setStrange1 = Set(ItemStrange(4,1),ItemStrange(3,100))
    val setStrange2 = Set(ItemStrange(3,20),ItemStrange(2,10))
    Console println (setStrange1 -- (setStrange1 & setStrange2))
//    val set
  }
}

case class ItemSimple(id: Int, views: Int)
case class ItemStrange(id: Int, views: Int) {
  //views are changable, but identifier is id
  override def equals(other: Any): Boolean = other match{
    case that: ItemStrange => this.id==that.id
    case _ => super.equals(other)
  }
}