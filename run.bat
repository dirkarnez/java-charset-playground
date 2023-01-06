@echo off
:compile
"C:\Program Files\Java\jdk1.8.0_101\bin\javac" -encoding UTF-8 Main.java
"C:\Program Files\Java\jdk1.8.0_101\bin\java" Main
cls
javac -encoding UTF-8 Main.java
java Main
pause
cls
goto compile