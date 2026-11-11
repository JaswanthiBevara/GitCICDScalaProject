
ThisBuild / scalaVersion := "2.13.18"

lazy val root = (project in file("."))
  .settings(
    name := "GitCICDScalaProject",

    libraryDependencies +=
      "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
