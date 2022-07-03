import sys
import subprocess

if(len(sys.argv) < 2 ):
    print("please call script like this")
    print("python3 {scriptname.py} {filename.kt}")
    exit()


s_filename = sys.argv[1]
a_s_part = s_filename.split(".")
a_s_part.pop()
s_filename_no_extension = ".".join(a_s_part)

s_filename_no_extension_firstletter_uppercase = s_filename_no_extension[0].upper() + s_filename_no_extension[1:]

a_s_command_compile_and_run = [
    # f"kotlinc ./../kotlin_helpers/kotlin_helpers.kt -d ./../kotlin_helpers/kotlin_helpers.jar", 
    # f"kotlinc {s_filename} -classpath ./../kotlin_helpers/kotlin_helpers.jar  -d {s_filename_no_extension}.jar",
    # f"java -classpath {s_filename_no_extension}.jar:./../kotlin_helpers/kotlin_helpers.jar {s_filename_no_extension}.{s_filename_no_extension_firstletter_uppercase}Kt"
    
    f"kotlinc {s_filename} -d {s_filename_no_extension}.jar",
    f"java -classpath {s_filename_no_extension}.jar {s_filename_no_extension}.{s_filename_no_extension_firstletter_uppercase}Kt"
]

# print(a_s_command_compile_and_run)
# exit()

for s_command in a_s_command_compile_and_run:
    a_s_command_arguments = s_command.split(" ")
    command_return = subprocess.run(a_s_command_arguments)