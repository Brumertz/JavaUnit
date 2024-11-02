@echo off
REM Set the classpath to include JUnit 5 and the current directory.
set CLASSPATH=lib\junit-jupiter-api-5.10.2.jar!;.

REM Compile the ComputeMethods and ComputeMethodsTest classes
javac -cp %CLASSPATH% computemethodsapp\ComputeMethods.java computemethodsapp\ComputeMethodsTest.java -d bin

REM Notify the user that compilation is complete.
echo Compilation complete
pause

