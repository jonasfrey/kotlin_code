
// this file was generated by create_new_folder_project.js

package anonymous_functions

import kotlin_helpers.*



fun f_print_test(){

    print("test");

}

fun f_executs_callback(
    f_callback: () -> Unit
){
    f_callback();
}

fun main() {
    // println("main function  was executed")
    f_print_test()
    f_executs_callback(::f_print_test)
}