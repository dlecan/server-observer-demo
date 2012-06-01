import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "a_server-observer"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.github.play2war" %% "play2-war-core" % "0.4"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
      resolvers += "Play2war plugins release" at "http://repository-play-war.forge.cloudbees.com/release/"
    )

}
