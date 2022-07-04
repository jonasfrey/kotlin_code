/** Programming 2 with Kotlin - FS 21/22,
 *  Computer Science, Bern University of Applied Sciences */

package listofints

import java.io.*


private const val SIZE = 10

class ListOfIntegers2 {
    private val intList = ArrayList<Int>(10)

    /**
     * Initialize the intList object and fills it with Integers 0..9.
     */
    init {
        for (i in 0 until SIZE) {
            intList.add(i + 1)
        }
    }

    /**
     * Outputs the formatted content of intList in the file OutFile.txt
     * @param fileName name of the output file
     */
    fun writeList(fileName: String) {
        try {
            // OutputStreamWriter constructor throws no exception
            // OutputStreamWriter.write throws IOException
            // FileOutputStream constructor throws FileNotFoundException & SecurityException
            OutputStreamWriter(FileOutputStream(fileName)).use { writer ->
                for ((idx, value) in intList.withIndex()) {
                    writer.write("Value at: $idx = $value\n")
                }
            }
        } catch (e: FileNotFoundException) {
            System.err.println("Caught FileNotFoundException: " + e.message)
        } catch (e: SecurityException) {
            System.err.println("Caught SecurityException: " + e.message)
        } catch (e: IOException) {
            System.err.println("Caught IOException: " + e.message)
        }
    }

    /**
     * Reads the content from the given file and adds ***all valid Integer values*** to the intList.
     * @param fileName name of the given file
     */
    fun readList(fileName: String) {
        try {
            InputStreamReader(FileInputStream(fileName)).use {
                val lines = it.readLines()
                for (line in lines) {
                    try {
                        val value = line.toInt()
                        println(value)
                        intList.add(value)
                    } catch (e: NumberFormatException) {
                        System.err.println("Caught NumberFormatException: " + e.message)
                    }
                }
            }
        } catch (e: FileNotFoundException) {  // from FileInputStream constructor
            System.err.println("Caught FileNotFoundException: " + e.message)
        } catch (e: SecurityException) { // from FileInputStream constructor
            System.err.println("Caught SecurityException: " + e.message)}
    }
}

/**
 * Main function
 */
fun main() {
    val list = ListOfIntegers2()
    list.readList("InFile.txt")
    list.writeList("OutFile.txt")
    println("Done !!")
}
