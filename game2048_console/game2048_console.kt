/*
 * Project and Training 1: Game2048 - Computer Science, Berner Fachhochschule
 * Console Version
 */

//gipackage ch.bfh.bti3001.game2048

package game2048_console

import kotlin_helpers.*



fun main() {

    println("""
    WELCOME TO 2048
    a=Left, s=Right, w=Up, y=Down, q=Quit
    """.trimIndent()
    )

    val o_game = Game(2, 2)
    o_game.f_start_new();
    var chr = readLine()!![0]

    // println(enteredString)

    while(chr.toString() != "q" && !o_game.b_is_over){

        if(chr.toString() == "w"){
            o_game.moveUp()
        }
        if(chr.toString() == "s"){
            o_game.moveDown()
        }
        if(chr.toString() == "a"){
            o_game.moveLeft()
        }
        if(chr.toString() == "d"){
            o_game.moveRight()
        }
        if(chr.toString() == "q"){
            o_game.f_print_game_over_and_score();
        }

        chr = readLine()!![0]
    }

}


class Game(n_width: Int = 4, n_height: Int = 4, b_is_run_from_unit_test : Boolean = false) {

    // var a_point_2_d_available = MutableList(1) {Point_2_d(0,0)}
    var b_is_run_from_unit_test = b_is_run_from_unit_test
    var a_point_2_d_available = mutableListOf<Point_2_d>()
    var a_game_objects = mutableListOf<Game_object>()

    var n_width = n_width
    var n_height = n_height

    var b_a_game_objects_positions_changed = false

    var b_is_over = false

    var line_x_pre_suffix = "|"
    var line_y_pre_suffix = "-"

    val a_canvas = f_get_empty_a_canvas()

    // var n_value_max_exponent = 13;
    var n_value_max_exponent = 6;

    var n_chars_per_y = 1
    var n_chars_per_x = 3

    var n_score = 0; 


    fun f_start_new(){
        f_spawn_new_game_object()
        f_spawn_new_game_object()
        f_render()
    }

    fun moveUp(){
        f_new_frame("0", "-")
    }
    fun moveDown(){
        f_new_frame("0", "+")
    }
    fun moveLeft(){
        f_new_frame("-", "0")
    }
    fun moveRight(){
        f_new_frame("+", "0")
    }

    fun f_print_game_over_and_score(){
        
        println("GAME OVER")
        println("score: "+n_score)

    }
    fun f_b_game_is_over(): Boolean{

        var b_game_is_over = true; 

        if(a_game_objects.count() < (n_width * n_height)){
            return false; 
        }
        // if any of the game objects has direct a neighbour on an axis with the same value 
        // another move is possible
        
        var a_filtered_a_game_objects: List<Game_object>;

        for(o_game_object in a_game_objects){
            a_filtered_a_game_objects = a_game_objects.filter{
                i -> 
                (( 
                    o_game_object.o_point_2_d.n_x == i.o_point_2_d.n_x )
                    && 
                    (
                        (o_game_object.o_point_2_d.n_y == i.o_point_2_d.n_y + 1 && o_game_object.n_value == i.n_value)
                        ||
                        (o_game_object.o_point_2_d.n_y == i.o_point_2_d.n_y - 1 && o_game_object.n_value == i.n_value)
                    )

                )
                ||
                (( 
                    o_game_object.o_point_2_d.n_y == i.o_point_2_d.n_y )
                    && 
                    (
                        (o_game_object.o_point_2_d.n_x == i.o_point_2_d.n_x + 1 && o_game_object.n_value == i.n_value)
                        ||
                        (o_game_object.o_point_2_d.n_x == i.o_point_2_d.n_x - 1 && o_game_object.n_value == i.n_value)
                    )

                )
                
                &&
                i != o_game_object

            }
            
            //println(a_filtered_a_game_objects)

            if(!a_filtered_a_game_objects.isNullOrEmpty()){
                // println("x: "+o_game_object.o_point_2_d.n_x)
                // println("y: "+o_game_object.o_point_2_d.n_y)

                // println("x: "+a_filtered_a_game_objects[0].o_point_2_d.n_x)
                // println("y: "+a_filtered_a_game_objects[0].o_point_2_d.n_y)

                b_game_is_over = false;
                break;
            }
        }

        return b_game_is_over;

    }


    fun f_new_frame(s_direction_x: String, s_direction_y: String ): Void?{

        b_a_game_objects_positions_changed = false

        // we first have to update the game objects !!
        f_update_a_game_objects(s_direction_x, s_direction_y)

        if(!b_is_run_from_unit_test){
            if(b_a_game_objects_positions_changed){
                f_spawn_new_game_object()
            }
        }

        f_render()

        b_is_over = f_b_game_is_over()

        if(b_is_over){
            f_print_game_over_and_score()
            return null;
        }

        return null
    }

    
    fun f_spawn_new_game_object(){

        while(true){

            var o_random_game_object = get_random_game_object()

            var a_filtered_a_game_objects = a_game_objects.filter{
                    i ->
                    i.o_point_2_d.n_x == o_random_game_object.o_point_2_d.n_x
                    &&
                    i.o_point_2_d.n_y == o_random_game_object.o_point_2_d.n_y
            }
            if(a_filtered_a_game_objects.isNullOrEmpty()){

                a_game_objects.add(
                    o_random_game_object
                )

                break
            }
        }
    }

    /*
    * loops through the rows or columns of the counter axis
    if input was ↑↓ up or down
        loops through x axis
    if input was ←→ left or right
        loops through y axis
    */
    fun f_update_a_game_objects(s_direction_x: String, s_direction_y: String){


        if(s_direction_y != "0"){ // up
            for(n_x in (0..(n_width-1))){
                f_update_row_or_col(s_direction_y, "y", n_x);
            }
        }
        if(s_direction_x != "0"){ // up
            for(n_y in (0..(n_height-1))){
                f_update_row_or_col(s_direction_x, "x", n_y);
            }
        }
    }

    /*
    * loops through a row or column from behind,
    * checks every cell if there is an object
    *  if no object
    *       n_free_count ++
    *
    *  if object
    *       if last object matches value
    *           last object gets added the value 2 + 2 = 4
    *           current object gets destroyed
    *           n_free_count ++
    *
    */
    fun f_update_row_or_col(s_direction: String, s_axis: String, n_index_other_axis: Int){

        var n_free_count = 0;

        var last_o_game_object : Game_object? = null;

        var n_end =  n_height -1

        if(s_axis == "y"){
            n_end = n_height -1
        }
        if(s_axis == "x"){
            n_end = n_width -1
        }

        for(n_i in 0..n_end){

            var n_index = n_i

            if(s_direction == "+"){
                n_index = n_end - n_i
            }

            var a_filtered_a_game_objects = a_game_objects.filter{i -> i.o_point_2_d.n_x == n_index_other_axis && i.o_point_2_d.n_y == n_index}

            if(s_axis == "y"){
                a_filtered_a_game_objects = a_game_objects.filter{i -> i.o_point_2_d.n_x == n_index_other_axis && i.o_point_2_d.n_y == n_index}
            }
            if(s_axis == "x"){
                a_filtered_a_game_objects = a_game_objects.filter{i -> i.o_point_2_d.n_x == n_index && i.o_point_2_d.n_y == n_index_other_axis}
            }

            if(a_filtered_a_game_objects.isNullOrEmpty()){
                n_free_count++;

            }else{

                var o_game_object = a_filtered_a_game_objects.first();

                if(last_o_game_object?.n_value == o_game_object.n_value){

                    // destroy object
                    // set last object val
                    // n_free_count ++
                    last_o_game_object.n_value += o_game_object.n_value // 2+2 = 4... , or with other nums
                    n_score+=last_o_game_object.n_value
                    n_free_count += 1
                    a_game_objects.remove(o_game_object) // destroy object // manually garbarge collect?
                }

                if(last_o_game_object?.n_value != o_game_object.n_value){
                    if(n_free_count > 0){
                        b_a_game_objects_positions_changed = true
                    }
                    //o_game_object.o_point_2_d.n_y = eval(s_direction + n_free_count.toString())
                    if(s_direction == "-"){
                        // o_game_object.o_point_2_d[axis] -= n_free_count
                        if(s_axis == "x"){
                            o_game_object.o_point_2_d.n_x -= n_free_count
                        }
                        if(s_axis == "y"){
                            o_game_object.o_point_2_d.n_y -= n_free_count
                        }

                    }
                    if(s_direction == "+"){
                        // o_game_object.o_point_2_d[axis] += n_free_count
                        if(s_axis == "x"){
                            o_game_object.o_point_2_d.n_x += n_free_count
                        }
                        if(s_axis == "y"){
                            o_game_object.o_point_2_d.n_y += n_free_count
                        }
                    }

                }

                last_o_game_object = o_game_object

            }

        }
    }
    fun get_random_game_object(): Game_object{

        var x = (0..n_width-1).random()
        var y = (0..n_height-1).random()

        val o_game_object = Game_object(
            Point_2_d(x,y),
            Math.pow(
                2.toDouble(),
                1.toDouble(),
                //((1..n_value_max_exponent).random()).toDouble()
            ).toInt(),
        )
        return o_game_object

    }


    fun f_render(){

        var a_canvas = f_get_empty_a_canvas()

        for(i in a_game_objects){

            a_canvas[i.o_point_2_d.n_y][i.o_point_2_d.n_x] = i.n_value.toString();
            //print(i.n_value.toString())
        }
        //var n_upscaled_width = width * 2;

        var lines = (a_canvas.size-1) *  n_chars_per_y

        var y = 0;

        var divider_y = line_y_pre_suffix.repeat((n_width * n_chars_per_x) + n_width+1)


        for(line in 0..lines){

            var s_line = " ".repeat(n_width * n_chars_per_x)

            if(line % n_chars_per_y == 0){

                s_line = line_x_pre_suffix

                for(x in 0..n_width-1){

                    var s_value = a_canvas[y][x].toString()
                    
                    s_value = s_value.padStart(n_chars_per_x, ' ');


                    if(a_canvas[y][x].trim()!= ""){
                        
                        if(a_canvas[y][x].toInt() == 2 ){ s_value = ANSI_COLOR_UNSATURATED_RED + s_value + ANSI_COLOR_RESET }
                        if(a_canvas[y][x].toInt() == 4 ){ s_value = ANSI_COLOR_UNSATURATED_GREEN + s_value + ANSI_COLOR_RESET }
                        if(a_canvas[y][x].toInt() == 8 ){ s_value = ANSI_COLOR_UNSATURATED_YELLOW + s_value + ANSI_COLOR_RESET }
                        if(a_canvas[y][x].toInt() == 16 ){ s_value = ANSI_COLOR_UNSATURATED_YELLOW + s_value + ANSI_COLOR_RESET }
                        if(a_canvas[y][x].toInt() == 32 ){ s_value = ANSI_COLOR_UNSATURATED_RED + s_value + ANSI_COLOR_RESET }
                        if(a_canvas[y][x].toInt() == 64 ){ s_value = ANSI_COLOR_UNSATURATED_YELLOW + s_value + ANSI_COLOR_RESET }

                    }


                    s_line += s_value+line_x_pre_suffix
                    // s_line += ANSI_COLOR_UNSATURATED_RED+s_value+ANSI_COLOR_RESET +line_x_pre_suffix;

                    //println(a_canvas[y][x].toString())
                }
                y++
                println(divider_y)

            }

            println(s_line)
        }

        println(divider_y)

    }

    fun f_get_empty_a_canvas(): Array<Array<String>>{

        // return Array (2){ " " }

        return Array(n_height) { Array(n_width){" ".padStart(n_chars_per_x,' ')} }
    }

}

class Game_object(
    o_point_2_d : Point_2_d,
    value: Int,

){
    var o_point_2_d = o_point_2_d
    var n_value = value
}

class Point_2_d(
    n_x: Int,
    n_y: Int) {
    var n_x = n_x
    var n_y = n_y
}

