import mill._, scalalib._
import ammonite.ops._

object root extends ProjectModule {
  def moduleDeps = Seq(models)

  def ivyDeps = Agg(
    ivy"com.typesafe.akka::akka-http:10.0.13"
  )
}

object models extends ProjectModule {
  def ivyDeps = Agg(
    ivy"io.circe::circe-core:0.9.3",
    ivy"io.circe::circe-generic:0.9.3",
    ivy"io.circe::circe-parser:0.9.3",
    // akka-http-circe used in root, but it's not root's direct dependency
    ivy"de.heikoseeberger::akka-http-circe:1.20.0"
  )
}

trait ProjectModule extends ScalaModule {
  def scalaVersion = "2.12.4"
}
