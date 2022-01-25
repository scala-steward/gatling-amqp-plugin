import sbt._

object Dependencies {
  val gatlingVersion = "3.7.4"

  lazy val gatlingCore: Seq[ModuleID] = Seq("io.gatling" % "gatling-core" % gatlingVersion % Provided)

  lazy val gatling: Seq[ModuleID] = Seq(
    "io.gatling.highcharts" % "gatling-charts-highcharts",
    "io.gatling"            % "gatling-test-framework",
  ).map(_ % gatlingVersion % Test)

  lazy val rabbitmq    = "com.rabbitmq"       % "amqp-client"   % "5.14.1"
  lazy val commonsPool = "org.apache.commons" % "commons-pool2" % "2.10.0"
  lazy val fastUUID    = "com.eatthepath"     % "fast-uuid"     % "0.2.0"

}
