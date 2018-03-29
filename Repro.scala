import akka.actor.ActorSystem

object Repro {
  def main(args: Array[String]): Unit = {
    println("Before ActorSystem")
    val before = System.currentTimeMillis()
    ActorSystem("repro-as")
    val after = System.currentTimeMillis()
    val delta = after - before
    println(s"After ActorSystem, took $delta ms")
  }
}
