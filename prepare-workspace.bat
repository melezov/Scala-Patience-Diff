@echo off

echo Performing dependency update for all projects ...
echo Will also create Eclipse .project and .classpath files ...
call "%~dp0sbt.bat" --no-jrebel %* +update eclipse
