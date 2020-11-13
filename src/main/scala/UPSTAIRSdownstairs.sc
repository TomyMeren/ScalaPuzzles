var MONTH = 12; var DAY=24
//var (HOUR, MINUTE, SECOND) = (10, 0, 0)

final val TheAnswer = 42

def checkGuess(answer:Int) = answer match {
  case TheAnswer => "finee"
  case _ => "Repeat Again please"
}

checkGuess(42)

val HOUR= 2; val MINUTE, SECOND = 0;

var theAnswer = 42

def checkGuess2(answer:Int) = answer match {
  case `theAnswer` => "finee"
  case _ => "Repeat Again please"
}

checkGuess2(422)