package book

import actors.Actor

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 23.08.11
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */

object Main {
  def main(args: Array[String]){
    Server.start()
    val c1 = new Client(1)
    c1.start()
    val c2 = new Client(2)
    c2.start()
    val c3 = new Client(3)
    c3.start()
    Server!c1
    Server!c2
    Server!c3

    Server!"Hello everybody"
  }

  def getSomthing: Option[Int] = {
    Some(1)
    None
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