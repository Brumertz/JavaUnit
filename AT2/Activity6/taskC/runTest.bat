@echo off
REM Set the classpath to include JUnit 5 and the current directory
set CLASSPATH=lib\junit-platform-console-standalone-1.8.1.jar;.

REM Run the tests using JUnit
java -cp %CLASSPATH% org.junit.platform.console.ConsoleLauncher -cp bin --scan-classpath

REM Indicate that tests have run
echo Test execution complete
pause 