
// this file was generated by create_new_folder_project.js

package solar_system

import kotlin_helpers.*



class History_item(
    val s_action: String, 
    val n_content: Double, 
    val n_status: Status
){
    enum class Status { NORMAL, EXCEPTION}

    override fun toString(): String{ 
        return "[$n_status] $s_action: new charging level = $n_content"
    }
}

class Solar_energy_system(
    val n_capacity: Double, 
    val n_area: Double
){

    var n_chargin_level: Double = 0.0
        private set

    var a_history = ArrayList<History_item>()
        private set

    fun sunshine(n_energy: Double){
        val n_amount = n_energy * n_area

        if(n_chargin_level + n_amount > n_capacity){
            n_chargin_level = n_capacity
            update_history("sunshine +$n_energy", n_chargin_level, History_item.Status.EXCEPTION)
        }
    }

    fun consume(n_energy: Double){
        if(n_energy <= n_chargin_level){
            n_chargin_level -= n_energy
            update_history("consume+$n_energy", n_chargin_level, History_item.Status.NORMAL)
        }
        if(n_energy > n_chargin_level){
            
        }
    }

    override fun toString(): String{
        return "Solar_energy_system( n_capacity= $n_capacity, n_area=$n_area, n_chargin_level=$n_chargin_level)"
    }

    private fun update_history(s_action: String, n_content: Double, n_status: History_item.Status){
        if(a_history.count() >= 5 ){
            a_history.removeAt(a_history.lastIndex)
            // a_history.removeAt(a_history.count()-1)//alternative
            a_history.add(0, History_item(s_action, n_content, n_status))
        }
    }

    fun get_history(): String{

        var s_text = ""
        for(o_item in a_history){
            s_text += "${o_item.toString()}\n"
        }

        // for(n in (a_history.count()..5)){
        //     s_text+= "\n"
        // }

        //better 
        var n_leftower = 5 - a_history.count()
        s_text += "\n".repeat( if( n_leftower >= 0) n_leftower else 0)

        return s_text

    }

} 

fun main() {

    val o_solar_energy_system = Solar_energy_system(100.0, 20.0)
    println(o_solar_energy_system)


    
    
}
