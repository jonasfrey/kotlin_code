
// this file was generated by create_new_folder_project.js

package objects

import kotlin_helpers.*

fun main() {
    println("main function  was executed")


    val o_simple_object = Simple_object()
    val o_simple_object2 = Simple_object(23)
    val o_simple_object3 = Simple_object(55)

    dnd(o_simple_object::javaClass.get("n_test"))
}


class Simple_object(
    n_test :Int = 15
){

    val n_test = n_test
}