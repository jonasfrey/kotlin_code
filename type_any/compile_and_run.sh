
# this file was generated by create_new_folder_project.js

# compile
## compile kotlin_helpers , a small helper package/library
kotlinc ./../kotlin_helpers/kotlin_helpers.kt -d ./../kotlin_helpers/kotlin_helpers.jar

## compile the main file with the dependencies
kotlinc type_any.kt -classpath ./../kotlin_helpers/kotlin_helpers.jar -include-runtime -d type_any.jar

./run.sh
