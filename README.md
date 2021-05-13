

# seg3103_playground
Repository for the first laboratory of the SEG3103 class.

This project is an initiation on how to create a GitHub repository & on how to install JUnit 5 as well as Elixir.

To get the project on your own computer :

1. Create a folder on your computer where you would want to project to reside. Make sure that Git is already installed. If you do not already have it, click here
and follow the instructions : https://git-scm.com/downloads
2. Open a command prompt/Terminal and naviguate to the folder that you created in step one. Once you're there, type git clone "url of this project". The project should 
clone itself on your computer.

To run the project, you need to have Java/JUnit and Elixir installed on your computer.

1. To run the newmath_ex tests, follow the steps that can be found within the /bin folder of the newmath_ex folder.
  - First, compile everything by executing the command "mix compile"
  - Then, launch the test by executing "iex mix"
  - Finally, run the tests by doing "mix test". You should get something that looks like this
![ElixirScreenshot](https://user-images.githubusercontent.com/56052670/117055582-51859b00-ace9-11eb-979a-9e44fb898ebe.PNG)
2. To run the newmath_java tests, follow the steps that can be found within the /bin folder of the newmath_java folder : 
  - First, compile the app by typing in your terminal "javac -encoding UTF-8 --source-path src -d dist src/*.java"
  - Then, compile the tests by typing "javac -encoding UTF-8 --source-path src -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java"
  - Finally, enter "java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path" to run the tests. You should get something that looks like this
![JUnitScreenshot](https://user-images.githubusercontent.com/56052670/118182659-45938a80-b407-11eb-9119-d12ece307491.PNG)



