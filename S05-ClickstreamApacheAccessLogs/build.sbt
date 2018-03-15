name := "S05-ClickstreamApacheAccessLogs"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.0.1"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.1"
)

//hadoop
val HADOOP_VERSION = "2.8.0"

libraryDependencies ++= Seq(
  //The order is important: "hadoop-hdfs" and then "hadoop-common"
  "org.apache.hadoop" % "hadoop-hdfs" % HADOOP_VERSION,
  "org.apache.hadoop" % "hadoop-common" % HADOOP_VERSION
)
        