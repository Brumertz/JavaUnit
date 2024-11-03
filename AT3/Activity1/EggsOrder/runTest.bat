
@echo off
REM Set the JUnit jar path
set JUNIT_JAR=lib/junit-platform-console-standalone-1.8.0.jar

REM Run the JUnit tests
java -jar %JUNIT_JAR% --class-path target/test-classes --scan-classpath
pause
