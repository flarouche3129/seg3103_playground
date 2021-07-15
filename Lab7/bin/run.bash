#!/bin/bash

./bin/clean

# Compile the application (just the application)
javac -encoding UTF-8 --source-path src -d dist src/*.java

# Run the code
java -cp ./dist Main


# SpotBugs
java -jar ./lib/spotbugs/lib/spotbugs.jar