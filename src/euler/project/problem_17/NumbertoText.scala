package euler.project.problem_17

/**
 * Created by IntelliJ IDEA.
 * User: tain
 * Date: 8/4/11
 * Time: 11:05 PM
 * To change this template use File | Settings | File Templates.
 */
//todo test
object NumbertoText extends App{
  def clean(s: String) = s.replaceAll("[^a-z]","")
  val dict = Map(
    1->"one", 2->"two", 3->"three",4->"four",5->"five",
    6->"six",7->"seven",8->"eight",9->"nine",10->"ten",
    11->"eleven",12->"twelve",13->"thirteen",14->"fourteen",
    15->"fifteen",16->"sixteen",17->"seventeen",
    18->"eighteen",19->"nineteen",20->"twenty",30->"thirty",
    40->"fourty",50->"fifty",60->"sixty",70->"seventy",
    80->"eighty",90->"ninety",100->"hundred",1000->"thousand"
  )
  def text(i: Int): String = {
    if(i<20) dict(i)
    else if (i<100) dict(i-i%10) +{if (i%10!=0) "-" + text(i%10) else ""}
    else if (i<1000) dict(i/100) +" "+ dict(100) +{if (i%100!=0) " and "+ text(i%100) else ""}
    else dict(1000)
  }
  val list = for (i <- 1 to  1000) yield text(i)
  println(clean(list.foldLeft("")(_+_)).length())
}