
// this file was generated by create_new_folder_project.js

package generics_lesson

import kotlin_helpers.*

fun main() {
    println("main function  was executed")


    custom_dump_function("hello") 

    custom_dump_function(123+321)

    custom_dump_function(listOf(9,7,6,5))


    val o_class_without_specific_type: Class_without_specific_type<Int> = Class_without_specific_type(11235);
    println(o_class_without_specific_type.member_prop)

    val o_class_without_specific_type2: Class_without_specific_type<String> = Class_without_specific_type("this is now a string");
    println(o_class_without_specific_type2.member_prop)

    val o_class_without_specific_type3: Class_without_specific_type<MutableList<Int>> = Class_without_specific_type(mutableListOf(3,4,5,4,3))
    println(o_class_without_specific_type3.member_prop)

    val o_class_without_specific_type4: Class_without_specific_type<Class_without_specific_type<Int>> 
        = Class_without_specific_type(Class_without_specific_type(20))
    
    
    println(o_class_without_specific_type4.member_prop)


    emoji_dump(1);
    emoji_dump("hi my name is mud");
    emoji_dump(listOf(1,2,3));
    emoji_dump(true);
    emoji_dump(
        object { 
            val a = 2
            val b = 3
        }
    )

}


// fun custom_dump_function(variable: T){ // not working
fun custom_dump_function(variable: Any){
// fun custom_dump_function(variable: *){
    val unix_ts = System.currentTimeMillis() / 1000L;
    val h = (((unix_ts % (60*60*24))/ (60*60*24).toFloat()) * 24).toInt(); 
    val m = (((unix_ts % (60*60)) / (60*60).toFloat())* 60).toInt();
    val s = unix_ts % 60; 
    
    val ansi_unsaturadet_bg_BLACK = "\u001b[100m"
    val ansi_RESET = "\u001b[0m"

    println("$ansi_unsaturadet_bg_BLACK${h.toString().padStart(2,'0')}:${m.toString().padStart(2,'0')}:${s.toString().padStart(2,'0')}$ansi_RESET => $variable")
}

fun <T> emoji_dump(variable: T){

    val ansi_unsaturadet_bg_BLACK = "\u001b[100m"
    val ansi_RESET = "\u001b[0m"

    val a_emojis = listOf("???","????","????","????","????","????","????","????","????","????","???","????","????","????","????","???","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","???","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","???","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????","???","????","???","????","????","????","????","????","????","????","????","????","????","????","????","????","????","????")

    println("$ansi_unsaturadet_bg_BLACK${a_emojis[ (0..a_emojis.size-1).random() ]}$ansi_RESET => $variable")

}

class Class_without_specific_type<T>(member_prop: T){

    val member_prop = member_prop

}