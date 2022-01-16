https://stackoverflow.com/questions/14733566/how-to-run-kotlin-class-from-the-command-line

## Knowing the Name of Your Main Class ##

To run a Kotlin class you are actually running a special class that is created at the file level that hold your `main()` and other functions that are top-level (outside of a class or interface).  So if your code is:

    // file App.kt
    package com.my.stuff

    fun main(args: Array<String>) {
      ...
    }

Then you can execute the program by running the `com.my.stuff.AppKt` class.  This name is derived from your filename with `Kt` appended.  You can change the name of this class within the file by adding this [file-targeted annotation](https://kotlinlang.org/docs/reference/annotations.html#annotation-use-site-targets):

    @file:JvmName("Foo")  

You can also put your `main()` into a class with a companion object and make it `static` using the `JvmStatic` annotation.  Therefore your class name is the one you chose:

    // file App.kt
    package com.my.stuff

    class MyApp {
        companion object {
            @JvmStatic fun main(args: Array<String>) {
              ...
            }
        }
    }

Now you just run the class `com.my.stuff.MyApp`

## What other JAR files do I need? ##

You need your application JAR and any dependencies.  For Kotlin specific JARs when outside of Maven/Gradle you need a Kotlin distribution which contains:

 - `kotlin-stdlib.jar` (the standard library)
 - `kotlin-reflect.jar` only if using Kotlin reflection
 - `kotlin-test.jar` for unit tests that use Kotlin assertion classes

## Running from Intellij ##

If in Intellij (if it is your IDE) you can right click on the `main()` function and select Run, it will create a runtime configuration for you and show the fully qualified class name that will be used.  You can always use that if you are unsure of the name of the generated class.

## Running from Gradle ##

You can also use the [Gradle Application plugin](https://docs.gradle.org/current/userguide/application_plugin.html) to run a process from Gradle, or to create a runnable system that includes a zip/tgz of your JAR and all of its dependencies, and a startup script.  Using the example class above, you would add this to your `build.gradle`:

    apply plugin: 'application'

    mainClassName = 'com.my.stuff.AppKt'

    // optional:  add one string per argument you want as the default JVM args
    applicationDefaultJvmArgs = ["-Xms512m", "-Xmx1g"] 

And then from the command-line use:

    // run the program
    gradle run

    // debug the program
    gradle run --debug-jvm

    // create a distribution (distTar, distZip, installDist, ...)
    gradle distTar

## Running Directly from Java Command-line ##

If you have a runnable JAR, and assuming `KOTLIN_LIB` points to a directory where Kotlin runtime library files reside:

    java -cp $KOTLIN_LIB/kotlin-stdlib.jar:MyApp.jar com.my.stuff.AppKt

See the notes above about other JAR files you might need.  A slight variation if you have a runnable JAR (with the manifest pointing at `com.my.stuff.AppKt` as the main class):

    java -cp $KOTLIN_LIB/kotlin-stdlib.jar -jar MyApp.jar

## Running using the Kotlin command-line tool ##

If you install Kotlin tools via [Homebrew](http://brew.sh/) or other package manager.  (on Mac OS X `brew update ; brew install kotlin`)  Then it is very simple to run:

    kotlin -cp MyApp.jar com.my.stuff.AppKt

This command adds the stdlib to the classpath provided, then runs the class.   You may need to add additional Kotlin libraries as mentioned in the section above "Running from Java." 


## Creating runnable JAR with the Kotlin compiler ##

This is not very common since most people use other build tools, but the Kotlin compiler can create a runnable Jar that solves this for you (see http://kotlinlang.org/docs/tutorials/command-line.html) when it bundles the runtime and your code together.  Although this isn't as common when using tools such as Maven and Gradle, or IDE builds.  Then run using the normal Java:

    java -jar MyApp.jar