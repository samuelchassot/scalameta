package org.scalameta.tests

import org.scalatest._

import scala.meta._
import scala.meta.dialects._

class MyTest extends FunSuite {

  test("my first test") {
    val program =
      """
          private enum Foo(x: Int) extends Bar{
            case Bar(y : Int) extends Foo(y)
            val x = 3
            final case A,B,C
            case A,B,C,D,E,F,G
          }
      """



    println(Dotty(program).parse[Source].get.structure)
    //println("case Foo(x : Int) extends Bar(8)".parse[Stat].get.structure)
  }
}