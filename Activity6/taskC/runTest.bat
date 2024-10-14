@echo off
rem Set the paths to JUnit and Hamcrest libraries
set junit_jar=path\to\junit-5.8.1.jar
set hamcrest_jar=path\to\hamcrest-core-1.3.jar

rem Navigate to the source directory
cd computemethodsapp

rem Run the test using JUnit's console launcher
java -cp %junit_jar%;%hamcrest_jar%;bin org.junit.platform.console.ConsoleLauncher --scan-classpath --details verbose

echo Test run complete!
pause