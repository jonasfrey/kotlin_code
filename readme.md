# create a new project 

this will create a new folder with the following <br>
        - ./variable_project_name <br>
        - ./variable_project_name/variable_project_name.c <br> 
        - ./variable_project_name/Makefile <br>
# compile 
./compile_and_run.sh

# run 
./run.sh

```
node create_new_folder_project.js variable_project_name 
```

# kotlin 

## installation 

- install kotlin
```
sudo snap install kotlin
```

- install vscode extension

## compile kotlin 
```
kotlinc {filename.kt} -include-runtime -d {filename.jar}
```

## kotlinc 
```
kotlinc -help
```


## run the application 
```
java -jar hello.jar
```


# kotlinc stuff



## evaluate expression
```
kotlinc -e 'println("System.getProperty(\"java.version\"): " + System.getProperty("java.version"))'
```

## constants not working with kotlinc -e
```
kotlinc -e 'println("k o t l i n thinks PI is: "+PI)'
```

## evaluate expression
|error|cause|
|---|---|
|no main manifest attribute, in ./kotlin_helpers.jar| a file is missing the `fun main(...`|
|error: unresolved reference: kotlin_helpers<br />
import kotlin_helpers.*|the `kotlinc` compiler needs to know the imports `kotlinc datatypes_lesson.kt -d datatypes_lesson.jar -classpath ./../kotlin_helpers/kotlin_helpers.jar`|


## evaluate expression
```
kotlinc -e 'println("System.getProperty(\"java.version\"): " + System.getProperty("java.version"))'
```


## errors and causes