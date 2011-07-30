def echo(args: String*) = for(arg <- args) println(arg)
echo("one")
echo("one","two")
val array = Array("What's","up", "man!")
echo(array: _*)
def speed(distance: Float, time: Float) = distance/time
speed(100,10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)
