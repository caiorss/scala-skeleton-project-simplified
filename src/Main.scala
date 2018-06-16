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
    gui.increment()

    println("Initializing groovy Console")

    val cs = new GroovyConsole()
      .setVariable("gui", gui)
      .setVariable("pi", 3.1415)
      .setUserMessage(
        """
          |// Enter (Ctrl + R) to evaluate the script
          |gui.getContentPane().setBackground(java.awt.Color.CYAN);
          |gui.setTitle("It worked pretty well");
        """.stripMargin)

    cs.run()

    for(i <- 1 to 10) println("i = " + i)

  }

}
