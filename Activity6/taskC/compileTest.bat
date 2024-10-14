@echo off


rem Set the paths to JUnit libraries (update these paths as necessary)
set junit_jar=C:\path\to\junit-jupiter-api-5.x.x.jar
set junit_engine_jar=C:\path\to\junit-jupiter-engine-5.x.x.jar
set hamcrest_jar=C:\path\to\hamcrest-core-1.3.jar


rem Compile the main ComputeMethods class
javac computemethodsApp\ComputeMethodsApp.java

rem Compile the test class with JUnit
javac -cp %junit_jar%;%junit_engine_jar%;%hamcrest_jar%; computemethodsApp\ComputeMethodsTest.java

echo -cp %junit_jar%;%junit_engine_jar%;%hamcrest_jar%; Compilation complete!
pause