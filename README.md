# JMH JDK Microbenchmarks

The JMH JDK Microbenchmarks is a collection of microbenchmarks for measuring
the performance of the JDK API and JVM features using
the [JMH](http://openjdk.java.net/projects/code-tools/jmh/) framework. 

## Building and running the project

Currently, the project can be built and run with JDK 11 and later. This is
a Maven project and is built by:

    $ mvn clean install

After clean install completed ypu can choose a class and trigger any main method from class you will see the result of benchmarks.

NOTE: If you want to compare different java versions, you can change your jdk version with your env variables or ide settings. 

## Result and Documentation:

### Java11 vs Java17
https://docs.google.com/document/d/1tb5em6NHYx4OObyJFd8h9Q5nLLkrC1a1aWrKWn_ZemA/edit