/** Programming 2 with Kotlin - FS 21/22,
 *  Computer Science, Bern University of Applied Sciences */
package ListOfIntegers

import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter

private const val SIZE = 10

class ListOfIntegers {
    private val intList = ArrayList<Int>()

    /**
     * Initialize the intList object and fills it with Integers 0..9.
     */
    init {
        for (i in 0 until SIZE) {
            intList.add(i+1)
        }
    }

    /**
     * Outputs the formatted content of intList in the file OutFile.txt
     * @param fileName name of the output file
     */
    fun writeList(fileName: String) {
        // TODO Handle all possible IO exceptions locally in the function
        OutputStreamWriter(FileOutputStream(fileName)).use { writer ->
            for ((idx,value) in intList.withIndex()) {
                writer.write("Value at: $idx = $value\n")
            }
        }
    }

    /**
     * Reads the content from the given file and adds ***all valid Integer values*** to the intList.
     * @param fileName name of the given file
     */
    fun readList(fileName: String) {
        val s_file_content = File(fileName).readText(Charsets.UTF_8);
        val a_s_line = s_file_content.split("\n")
        for(n_i in a_s_line.indices){
            val s_line = a_s_line[n_i];
            print(s_line)
        }
        // fun readFileDirectlyAsText(fileName: String): String 
//   = File(fileName).readText(Charsets.UTF_8)

        // TODO Implement the function and handle all IO exceptions locally
    }
}

/**
 * Main function
 */
fun main() {
    val list = ListOfIntegers()
    list.readList("InFile.txt")
    list.writeList("OutFile.txt")
    println("Done !!")
}
