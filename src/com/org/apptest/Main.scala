package com.org.apptest

import javax.swing.{ JFrame, JButton }
import java.awt.event.{ ActionListener, ActionEvent }

object Main {
  
  val gui = new UserInterface()

  def main(arr: Array[String]) = {    
    gui.setVisible(true)
    println("Hello world - Scala project.")
  }

}