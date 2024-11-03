
@echo off
REM Set the JUnit jar path
set JUNIT_JAR=lib/junit-platform-console-standalone-1.8.0.jar

REM Compile the test file with the JUnit library included
javac -cp ".;target/classes;%JUNIT_JAR%" -d target/test-classes src/test/java/com/mycompany/eggsorder/*.java
pause
