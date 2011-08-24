package euler.project.problem_18

import java.io.{FileReader, BufferedReader}
import collection.mutable.ArrayBuffer

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 03.08.11
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
object Triangle extends App{
  val in: BufferedReader = new BufferedReader(new FileReader("C:\\scala-practice\\src\\euler\\project\\problem_18\\in.txt"))
  val file  = for (i <- 1 to 15) yield (in.readLine().split(" ")).toList
//  println(file.toList)
//  Console println file.head
//  Console println file.tail.head
//  Console println file.tail.tail
  val buf = new ArrayBuffer[(Int,Int)]()
  Console println file.foldLeft(Array[(Int,Int)]((0,0)))((a,b)=>{
    buf.clear()
    val bb: Array[Int] = b.map(_.toInt).toArray
    (for(i <- 0 until a.size; j <- 0 until bb.size;
        ii = a(i); jj = bb(j)) {
      val max = math.max(ii._1,ii._2)
      if(i==j){
        if ((buf.size!=0)&&(buf.last._2==jj)){
          val temp = buf.last._1
          buf.remove(buf.size-1)
          buf+=Pair(temp,jj+max)
        }
        else buf+=Pair(jj,jj+max)
      }
      else if (i+1==j) buf += Pair(jj+max,jj)
    })
    println(buf.toList)
    buf.toArray
  }).foldLeft(0)((a,b)=>{
    if (a<math.max(b._1,b._2)) math.max(b._1,b._2)
    else a
  })

}