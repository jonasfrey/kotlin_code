
# this file was generated by create_new_folder_project.js

# compile
## compile kotlin_helpers , a small helper package/library
kotlinc ./../kotlin_helpers/kotlin_helpers.kt -d ./../kotlin_helpers/kotlin_helpers.jar

## compile the main file with the dependencies
kotlinc polymorphism_lesson.kt -classpath ./../kotlin_helpers/kotlin_helpers.jar -include-runtime -d polymorphism_lesson.jar

./run.sh

