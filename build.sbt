name := "play-2-2-1-scala-style-scct"

version := "1.0-SNAPSHOT"

org.scalastyle.sbt.ScalastylePlugin.Settings

ScctPlugin.instrumentSettings

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings
