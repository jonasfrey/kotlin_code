
// this file was generated by create_new_folder_project.js

package keylistener_in_loop

import kotlin_helpers.*

import java.util.Scanner


fun main() {
    // while(true){

    //     var first_name = readLine()

    //     print("keys pressed are ...")
    //     Thread.sleep(500) 
    // }
    

    // val reader = BufferedReader(InputStreamReader(System.`in`))
    // var line : String? = ""
    // while (line != null) {
    //     line = reader.readLine()
    //     result += line

    //     println(result)

    // }


    // val scanner = Scanner(System.`in`)
    // var chr = scanner.next().single()

    // while(true){
    //     chr = scanner.next().single()

    //     println("char was $chr")
    // }




    // java 

    // try {
    //     bis = new BufferedInputStream(System.in);
    //     while (true) {
    //         byte[] buffer = new byte[4096];
    //         if (bis.available() > 0) {
    //             bis.read(buffer, 0, bis.available());
    //             // do some clever thing
    //         } else {
    //             try {
    //                 Thread.sleep(50);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     }
    // } catch (IOException e) {
    //     // it failed...
    // }

    // val buffered_input_stream = BufferedInputStream(System.`in`)
    // while(true){
    //     val byte_array = ByteArray(4096)

    //     if(buffered_input_stream.available() > 0){
    //         buffered_input_stream.read(byte_array, 0, buffered_input_stream.available())
    //         println(byte_array.toString())
    //     }else{
    //         Thread.sleep(50)
    //     }

    // }

    val pid = ProcessHandle.current().pid();
    println("process id is: $pid")
    
    while(true){
        var read_line = readLine()
        println("line was: $read_line")

        // Thread.sleep(50)
    }
    
    // val input = Scanner(System.`in`)
    // val a = input.nextInt()
    // val b = input.nextInt    ()
    // println(a + b)
}