name := "scala-exersiece-notes"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += Resolver.sonatypeRepo("releases")



libraryDependencies += "org.typelevel" %% "cats" % "0.6.1"
libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.1"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.5"
libraryDependencies += "com.github.alexarchambault" %% "scalacheck-shapeless_1.12" % "0.3.1"
libraryDependencies += compilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1")



