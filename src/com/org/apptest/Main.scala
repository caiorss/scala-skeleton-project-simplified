package com.org.apptest


class GroovyConsole{
  import groovy.ui.Console
  private val console = new Console()
  private var msg: String = ""

  def get() = console

  def setVariable(name: String, obj: Any) = {
    console.setVariable(name, obj)
    this
  }
  def setUserMessage(text: String) = {
    msg = text
    this
  }
  def run() = {
    console.run()
    javax.swing.SwingUtilities.invokeLater{ () =>
      console.getInputEditor().getTextEditor().setText(msg)
    }
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