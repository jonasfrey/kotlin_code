
// this file was generated by create_new_folder_project.js

package test

import package_a.*

fun main() {
    
    function_from_package_a();

    println("main function  was executed")
}

//commands 
// ```
// $ kotlinc package_a.kt -d package_a.jar               
// $ kotlinc main.kt -classpath package_a.jar -d main.jar
// $ java -jar main.jar  // not working 
// $ java -cp main.jar:package_a.jar main // also not working
// $ java -cp main.jar:package_a.jar test.MainKt // this is working
// ```