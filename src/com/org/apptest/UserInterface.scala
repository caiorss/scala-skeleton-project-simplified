package com.org.apptest

final class UserInterface extends javax.swing.JFrame {
  import javax.swing.{JFrame, JButton, JPanel}
  
  private val button1 = new JButton("Increment")
  private val button2 = new JButton("Decrement")
  private val buttonExit = new JButton("Exit")
  
  private val frame1 = new javax.swing.JFrame("Test 1")
  private val display = new javax.swing.JLabel("0")
  private var counter = 0

  init()
  private def init() = {
    val frame1 = this
    button1.addActionListener { evt => 
      println(" was clicked") 
      increment()
    }
    buttonExit.addActionListener{ evt =>  
      System.exit(0)
    }
    button2.addActionListener{ evt => 
      decrement()      
    }
    frame1.setLayout(new java.awt.FlowLayout())
    frame1.add(button1)
    frame1.add(button2)
    frame1.add(buttonExit)    
    frame1.add(display)
    frame1.setVisible(true)
    frame1.setSize(400, 500)
    frame1.setLocation(200, 200)
    frame1.setTitle("Frame 1 test")
  }

  def increment() = {
    counter = counter + 1 
    display.setText("counter = " + counter)
  }
  
  def decrement() = {
    counter = counter - 1 
    display.setText("counter = " + counter)
  }

  def getCounter() =
    counter
  
}