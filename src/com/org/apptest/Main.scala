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
    gui.setTitle("Graphical user interface")
    // gui.setResizable(false)

    println("Initializing groovy Console")

    val cs = new GroovyConsole()
    cs.setVariable("gui", gui)
      .setVariable("pi", 3.1415)
      .run()

    println("Hello world - Scala project.")

    for(i <- 1 to 10) println("i = " + i)

  }

}