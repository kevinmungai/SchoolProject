name := "ChapterFutures"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= {
  val akkaVersion = "2.5.3"
  val scalaTestVersion = "3.0.1"
  Seq(
    "com.typesafe.akka"         %%    "akka-actor"      %     akkaVersion,
    "com.typesafe.akka"         %%    "akka-testkit"    %     akkaVersion         %     Test,
    "org.scalactic"             %%    "scalactic"       %     scalaTestVersion,
    "org.scalatest"             %%    "scalatest"       %     scalaTestVersion    %     Test,
    "com.github.nscala-time"    %%    "nscala-time"     %     "2.16.0"
  )
}