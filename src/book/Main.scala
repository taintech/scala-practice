package book

import actors.Actor
import java.io.File
import java.math.BigInteger

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 23.08.11
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */

object Main {
  def main(args: Array[String]){
    println("start")
    ImageUtil.start()
    ImageUtil!(new File("1"))
    ImageUtil!(new File("2"))
    ImageUtil!(new File("3"))
    ImageUtil!(new File("4"))
    println("end")
  }

  def getSomthing: Option[Int] = {
    Some(1)
    None
  }
}

object ImageUtil extends Actor{
   def act = {
    loop{
      react{
        case file: File => {
           //hard operation
          Thread.sleep(1000)
          println(file)
        }
      }
    }
  }
}

class Client(val id: Int) extends Actor{
  def act = {
    loop{
      react{
        case msg: String => println("Client "+ id + " receieved "+ msg)
      }
    }
  }
}

object Server extends Actor{
  var list: List[Client] = Nil
  def act = {
    loop{
      react{
        case "Exit" => System.exit(0)
        case msg: String => for (c <- list) c!msg
        case client: Client => list = client :: list
      }
    }
  }
}