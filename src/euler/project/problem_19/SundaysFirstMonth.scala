package euler.project.problem_19

import java.text.{ParseException, SimpleDateFormat}
import java.util.{Calendar, Locale, Date}

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 24.08.11
 * Time: 13:05
 * To change this template use File | Settings | File Templates.
 */
object SundaysFirstMonth extends App{
  try{
    val date1: Date = (new SimpleDateFormat("MMM dd yyyy",Locale.US)).parse("Jan 01 1901")
    val date2: Date = (new SimpleDateFormat("MMM dd yyyy",Locale.US)).parse("Dec 31 2000")
    val l = new DateIterator(date1, date2)
    var counter = 0
    while (l.hasNext) {
      val date = (l.next).toString
      if(date.startsWith("Sat")&&(date.charAt(8)=='0')&&(date.charAt(9)=='1')){
        println(date)
        counter = counter + 1
      }
    }
    println(counter)

  }catch{
    case e: ParseException => e.printStackTrace()
  }
}