
@echo off
REM Compile all Java files in the source directory
javac -d target/classes -sourcepath src/main/java src/main/java/com/mycompany/petsapp/*.java
pause
