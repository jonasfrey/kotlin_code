
// this file was generated by create_new_folder_project.js

package kotlin_exec

import kotlin.*
import kotlin_helpers.*


import java.lang.ProcessBuilder.Redirect
import java.util.concurrent.TimeUnit

fun main() {
    // execCommand("lsusb");

    val process = ProcessBuilder("lsusb").start();

    process.inputStream.reader(Charsets.UTF_8).use{
        println(it.readText())
        
    }
    process.waitFor(10, TimeUnit.SECONDS)

    
    // println(Runtime.getRuntime().exec("lsusb > tmp_test_lsusb.txt"));

    // "lsusb > ./lsusb.tmp.txt".runCommand();
}


fun String.runCommand() {
    val process = ProcessBuilder(*split(" ").toTypedArray())
            .directory(null)
            .redirectOutput(Redirect.INHERIT)
            .redirectError(Redirect.INHERIT)
            .start()
    if (!process.waitFor(10, TimeUnit.SECONDS)) {
        process.destroy()
        throw RuntimeException("execution timed out: $this")
    }
    if (process.exitValue() != 0) {
        throw RuntimeException("execution failed with code ${process.exitValue()}: $this")
    }
}