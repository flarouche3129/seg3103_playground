# SEG3103 Laboratory 7

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Henry Chen |
| Student 1 | Félix Larouche (300144353) |
| Student 2 | Emma Dobson Takoff (300108505) |

This is the seventh laboratory for the course SEG3103.

## Automated Static Analysis with SpotBugs

First, we compiled the app with `javac -encoding UTF-8 --source-path src -d dist src/*.java` and ran it with `java -cp ./dist Main`.

Here is a screenshot of the app running:
![App running](assets/AppRunning.png)

Here is a screenshot of the initial SpotBugs analysis:
![SpotBugs Initial Analysis](assets/SpotBugRunning.png)

### Bug 1: Comparison of String parameter using == or !=

Here is a screenshot of the code before changes:
![Bug 1](assets/Bug1_SpotBug.png)

Here is a screenshot of the fixed bug:\
![Bug 1 Fixed](assets/Bug1_Fixed.png)

To do the comparison we replaced the == with the .equals() method.

### Bug 2: Certain swing methods needs to be invoked in Swing thread

Here is a screenshot of the bug:
![Bug 2](assets/Bug2_SpotBug.png)

Description of bug: In the main method, the isVisible() Swing method is being called which could cause deadlocks or other threading issues since Java Swing components are not thread-safe in Java.

### Bug 3: Could be refactored into a named static inner class

Here is a screenshot of the bug:
![Bug 3](assets/Bug3_SpotBug.png)

To fix the code we would, create a WindowAdapter class within the CalCFrame class and in the CalCFrame method we would call WindowAdapter.WindowClosing(WindowEvent e), passing in a WindowEvent as as argument, instead of having to create a new WindowAdapter.

### Bug 4: Private method is never called

Here is a screenshot of the method causing the bug, since it is never called:
![Bug 4](assets/Bug4_SpotBug.png)

To fix the bug, we would simply delete this private method, as shown in this screenshot where we simply commented out the code:
![Bug 4 Fixed](assets/Bug4_Fixed.png)

### Bug 5/6: Boxing/unboxing to parse a primitive

Here are screenshots of the bugs before making changes to the code:
![Bug 5](assets/Bug5_SpotBug.png)
![Bug 6](assets/Bug6_SpotBug.png)

Here is a screenshot of the fixed bugs where we used Java's parse method:
![Bug 5 Fixed](assets/Bug5_Fixed.png)
![Bug 6 Fixed](assets/Bug6_Fixed.png)

### Bug 7-12: Boxing/unboxing to parse a primitive (2)

Here is a screenshot of the bugs before making any changed to the code:
![Bugs 7-12](assets/Bug7-12_SpotBug.png)

To fix the bugs, we simply had to make the field static, as seen in the screenshot below:
![Bugs 7-12 Fixed](assets/Bug7-12_Fixed.png)

### Bug 13: Method uses the same code for two branches

Here is a screenshot of the bug before changing the code:
![Bug 13](assets/Bug13_SpotBug.png)

To fix the bug, we simply need to remove the else if to remove the redundancy:\
![Bug 13 Fixed](assets/Bug13_Fixed.png)

### Bug 14: Switch statement found where default case is missing

Here is a screenshot of the bug:
![Bug 14](assets/Bug14_SpotBug.png)

To fix this bug, we would add a default case which would execute if none of the cases were matched. The default case could handle an invalid operator and return an error message.

### Bug 15-18: Condition has no effect

Here is a screenshot of the bugs 15-17:
![Bugs 15-17](assets/Bug15-17_SpotBug.PNG)

To fix this we replaced the if, else statements with one line since the same line of code was supposed to be executed regardless of the value of i, meaning that the if, else blocks were unnecessary. Here is a screenshot of the change we made:
![Bugs 15-17 Fixed](assets/Bug15-17_Fixed.PNG)

Here is a screenshot of bug 18:
![Bug 18](assets/Bug18_SpotBug.png)

To fix the bug, we can replace the else if statement with an else statement as shown in the screenshot below:
![Bug 18 Fixed](assets/Bug18_Fixed.png)

### Summary
In total we fixed 15 bugs. Here is a screenshot of the analysis after fixing the bugs:
![SpotBugs Final Analysis](assets/SpotBug_FinalResult.PNG)

As expected, all bugs that we fixed no longer showed up in the analysis but since we did not fix 3 of them there are 3 remaining.
