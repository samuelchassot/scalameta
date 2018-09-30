package org.scalameta.tests

import org.scalatest._

import scala.meta._

class MyTest extends FunSuite {

  test("my first test") {
    val program =
      """
        class Foo{
          case Bar(x : Int)
          case Arbre(x: Int)
        }
      """.stripMargin
    println(program.parse[Source].get.structure)
  }
}