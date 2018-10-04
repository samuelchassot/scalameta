package org.scalameta.tests

import org.scalatest._

import scala.meta._

class MyTest extends FunSuite {

  test("my first test") {
    val program =
      """
        class Foo(x: Int){
          case Foo, Bar
          class B
        }
      """

    println(program.parse[Source].get.structure)
    println("case Foo,Bar".parse[Stat].get.structure)
  }
}