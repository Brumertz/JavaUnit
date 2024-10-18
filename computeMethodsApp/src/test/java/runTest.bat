echo off

REM Run the test with JUnit 5 included in the classpath.
java  org.junit.platform.console.ConsoleLauncher --select-class com.mycompany.computemethodsapp.ComputeMethodsTest

pause