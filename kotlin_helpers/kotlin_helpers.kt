
// this file was generated by create_new_folder_project.js
package kotlin_helpers
import kotlin.reflect.KProperty1



const val ANSI_COLOR_BLACK = "\u001b[30m"
const val ANSI_COLOR_RED = "\u001b[31m"
const val ANSI_COLOR_GREEN = "\u001b[32m"
const val ANSI_COLOR_YELLOW = "\u001b[33m"
const val ANSI_COLOR_BLUE = "\u001b[34m"
const val ANSI_COLOR_MAGENTA = "\u001b[35m"
const val ANSI_COLOR_CYAN = "\u001b[36m"
const val ANSI_COLOR_WHITE = "\u001b[37m"

const val ANSI_BG_COLOR_BLACK = "\u001b[40m"
const val ANSI_BG_COLOR_RED = "\u001b[41m"
const val ANSI_BG_COLOR_GREEN = "\u001b[42m"
const val ANSI_BG_COLOR_YELLOW = "\u001b[43m"
const val ANSI_BG_COLOR_BLUE = "\u001b[44m"
const val ANSI_BG_COLOR_MAGENTA = "\u001b[45m"
const val ANSI_BG_COLOR_CYAN = "\u001b[46m"
const val ANSI_BG_COLOR_WHITE = "\u001b[47m"

const val ANSI_COLOR_UNSATURATED_BLACK = "\u001b[90m"
const val ANSI_COLOR_UNSATURATED_RED = "\u001b[91m"
const val ANSI_COLOR_UNSATURATED_GREEN = "\u001b[92m"
const val ANSI_COLOR_UNSATURATED_YELLOW = "\u001b[93m"
const val ANSI_COLOR_UNSATURATED_BLUE = "\u001b[94m"
const val ANSI_COLOR_UNSATURATED_MAGENTA = "\u001b[95m"
const val ANSI_COLOR_UNSATURATED_CYAN = "\u001b[96m"
const val ANSI_COLOR_UNSATURATED_WHITE = "\u001b[97m"

const val ANSI_BG_COLOR_UNSATURATED_BLACK = "\u001b[100m"
const val ANSI_BG_COLOR_UNSATURATED_RED = "\u001b[101m"
const val ANSI_BG_COLOR_UNSATURATED_GREEN = "\u001b[102m"
const val ANSI_BG_COLOR_UNSATURATED_YELLOW = "\u001b[103m"
const val ANSI_BG_COLOR_UNSATURATED_BLUE = "\u001b[104m"
const val ANSI_BG_COLOR_UNSATURATED_MAGENTA = "\u001b[105m"
const val ANSI_BG_COLOR_UNSATURATED_CYAN = "\u001b[106m"
const val ANSI_BG_COLOR_UNSATURATED_WHITE = "\u001b[107m"

const val ANSI_COLOR_RESET = "\u001b[0m"



@Suppress("UNCHECKED_CAST")
fun <R> readInstanceProperty(instance: Any, propertyName: String): R {
    val property = instance::class.members
                     // don't cast here to <Any, R>, it would succeed silently 
                     .first { it.name == propertyName } as KProperty1<Any, *> 
    // force a invalid cast exception if incorrect type here
    return property.get(instance) as R  
}

fun printf(test: Int){ 
    
    println("test");
    
    println(test);

}

fun dnd_type_and_value(v_anytype: Any){ 
    
    println("type:")
    println(v_anytype::class.simpleName)

    println("value:")
    println(v_anytype)

}


fun val_to_string(value : Any /* , n_indent: Int = 0*/): String{

    var s_val_as_string = value.toString()
    
    // var n_indent = n_indent + 1

    if(
        value is Array<*>
        
        ){
        s_val_as_string = "["
        for(i in value){

            if(i == null){
                s_val_as_string += "null,"
            }
            if(i != null){
                s_val_as_string += val_to_string(i)+","
            }
            //.toString()
        }

        s_val_as_string = s_val_as_string.substring(0, s_val_as_string.length-1) +"]"

        // for(i in 0..value.size){
        //     // return value.get(i)
        //     // return i.toString()
        //     return val_to_string(value[i])
        // }
    }

    // if value is 'custom' class object
    // trying to dump the object's values
    // if(
    //     value is Array<*> == false
    //     &&
    //     value is Int == false 
    //     &&
    //     value is Float == false 
    //     && 
    //     value is Double == false 
    //     && 
    //     value is Char == false 
        
    //     ){
            
    //         val value_class = value::javaClass.get()// .get().getField(s_name)

    //         for(i in value::class.members){
    //             if(i.toString().lowercase().contains("fun") == false){   
    //                 //println(i)
    //                 // var a_parts = i.toString().split(":")
    //                 // //var s_type = a_parts.last()
    //                 // var s_name = a_parts.first()
    //                 // a_parts = s_name.split(".")
    //                 // s_name = a_parts.last()
    //                 // var s_value = val_to_string( readInstanceProperty(value, s_name))
    //                     // value::javaClass.get(s_name.toString()))
    //                 val s_name = i.name

    //                 println("$ANSI_COLOR_UNSATURATED_BLUE$s_name$ANSI_COLOR_RESET: $ANSI_COLOR_UNSATURATED_RED$s_value$ANSI_COLOR_RESET")
    //             }
    //             // if(i is Function<*>){ 
    //             //     println(i)
    //             // }
    //         }

    //         // not working
    //         // value::class.members.forEach {
    //         //         println(it.name)
    //         //         println(it.getter.call(value))
    //         // }
    //     }

    
    // return " ".repeat(n_indent*4) + s_val_as_string.toString()
    return s_val_as_string.toString()
}


fun dnd(v_anytype : Any){ 

    //trying to get the variable name 
    // but getting this error: 
    // ... error: References to variables aren't supported yet..
    //println(::v_anytype.get())
    //println(::v_anytype.name) 


    
    val s_v_anytype_type = v_anytype::class.simpleName.toString()

    val s_v_anytype = val_to_string(v_anytype)

    val ts_ms = System.currentTimeMillis();

    val ts_formatted = java.sql.Timestamp(ts_ms);

    val ts_hmsms = ts_formatted.toString().split(" ").last()
    
    println(ANSI_COLOR_UNSATURATED_BLACK+"(dnd) $ts_hmsms:"+ANSI_COLOR_RESET+" $s_v_anytype|$s_v_anytype_type")
    

    // println(v_anytype::class.members)


}

fun main() {

    println("main function  was executed")

    printf(10);

}

// If you don???t use a visibility modifier, public is used by default, which means that your declarations will be visible everywhere.
class Public_class_from_kotlin_helpers()

// If you mark a declaration as private, it will only be visible inside the file that contains the declaration.
class Private_class_from_kotlin_helpers private constructor(a: Any)

// If you mark it as internal, it will be visible everywhere in the same module.
class Internal_class_from_kotlin_helpers internal constructor(a: Any)

// The protected modifier is not available for top-level declarations.

