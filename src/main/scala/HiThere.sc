List(1, 2, 3).map { i => println("hi"); i + 1 }
List(1, 2, 3).map {
  println("hi");
  _ + 1
}

/*
List(1, 2, 3).map(i => println("hi"); i +1)
List(1, 2, 3).map(  println("hi");  _ +1)*/

val printAndaddOne =
  (i: Int) => {
    println("hii");
    i + 1
  }

List(1, 2) map printAndaddOne

val printAndReturnAFunc = {
  println("hii");
  (_: Int) + 1
}

List(1, 2) map printAndReturnAFunc

val regulatFunc = { a: Any => println("foo"); println(a); "baz" }

val anonymousFunc = {println("foo"); println(_:Any); "baz" }

val confidenctFunc = {println("foo"); {a:Any => println(a)}; "baz"}

regulatFunc("hello")

anonymousFunc

confidenctFunc