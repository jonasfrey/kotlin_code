# coding standards:
## variables 
variable names and function names must contain a prefix depending on their type 
```
n_{variable_name} // n_ -> 'number' : 1, 11.11, -100, //any number
s_{variable_name} // s_ -> 'string' : 't', "test", "any \n other string" //any string 
                                         also only single chars since those are strings of length 1
b_{variable_name} // b_ -> 'boolen' : (false, true, if this type is supported by the programming language), 
                                    else 1, 0, 12234, 2323 
                                
a_{variable_name} // a_ -> 'array' : Array, list, mutable list // whatever it is called in the programming language
o_{variable_name} // o_ -> 'object' : object, indexed array (php) , or even a struct from c // anything that has properties/attributes
```

 ## functions 
 prefix f_ 
```
 f_{function_name}
 if the function has a return then another prefix of the type of the return value will be addad 
 f_b_{function_name}
```

# examples 
```kotlin
var n_a_number = 1234; 
var s_a_char_or_string = '1'; 
var s_a_char_or_string =  "hi im a string";
 
// in c 
var b_am_i_done = 0; 
// other 
var b_process_running = false;
```

```javascript
var a_numbers = [1,2,3,4];
var o_instance = {"n_num": 11235, "a_nums":[1,2,3,4]}
```
```kotlin
f_b_process_finished(): Boolean{
    //...
    return true;
}
```
```kotlin
f_do_this: Void?(){
    //...
    return null; 
}
```