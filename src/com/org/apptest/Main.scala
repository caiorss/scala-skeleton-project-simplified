package com.org.apptest


class GroovyConsole{
  import groovy.ui.Console
  private val console = new Console()
  def setVariable(name: String, obj: Any) = {
    console.setVariable(name, obj)
    this
  }
  def run() = {
    console.run()
    this
  }
}

object Main {
  
  val gui = new UserInterface()
  

  def main(arr: Array[String]) = {    
    gui.setVisible(true)
    gui.getContentPane().setBackground(java.awt.Color.WHITE)

    val console = new groovy.ui.Console()
    console.setVariable("gui", gui)
    console.setVariable("x",  2.451)
    console.run()

    println("Hello world - Scala project.")

    for(i <- 1 to 10) println("i = " + i)

  }

}