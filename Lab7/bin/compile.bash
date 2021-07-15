#!/bin/bash

# Compile the application
javac -encoding UTF-8 --source-path src -d dist src/*.java

# Compile the tests
javac -encoding UTF-8 --source-path test -d dist -cp dist:lib/junit-platform-console-standalone-1.7.1.jar test/*.java

# Compile the tests on Windows
javac -encoding UTF-8 --source-path src -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java