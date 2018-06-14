// Scala runtime and distribution version 
scalaVersion := "2.12.0"

//============ Application Specific Settings ===============
// Application/Program name 
// name                 := apptest 
// Application version 
version              := "1.0"
// Main class points to the main program entry point: 
mainClass in Compile := Some("com.org.apptest.Main")

//============= Overrides project layout =====================================
//   Original Scala Layout      ---  This layout  (Scala-only project)
//   ./src/main/*.files.scala         src/*.scala 
//   ./src/tests                      test/*.tests.scala
//
// Reference: 
//  + https://stackoverflow.com/questions/15476256/how-do-i-specify-a-custom-directory-layout-for-an-sbt-project
//  + https://stackoverflow.com/questions/10131340/changing-scala-sources-directory-in-sbt
//-------------------------------------------------------------------------
// Move classes from src/main/*.scala to ./src/*.scala
scalaSource in Compile := { (baseDirectory in Compile)(_ / "src") }.value
//-------------------------------------------------------------------------
// Move tests from src/tests to ./test 
scalaSource in Test := { (baseDirectory in Test)(_ / "test") }.value
//
//

