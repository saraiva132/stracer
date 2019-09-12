import Dependencies._

name := "stracer"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/stracer"))

startYear := Some(2019)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.12.10")//, "2.13.0")

resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

libraryDependencies ++= Seq(
  skafka,
  zipkin,
  random,
  Scodec.core,
  Scodec.bits,
  PlayJsonTools.tools,
  `cats-helper`,
  Cats.core,
  Cats.kernel,
  Cats.macros,
  Cats.effect,
  configTools,
  scalatest % Test)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true