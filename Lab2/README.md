# SEG3103 Laboratory 2
### Student 1 : Félix Larouche (30014453)
### Student 2 : Emma Dobson Takoff (300108505)

### Professor : Andrew Forward
### Teacher assistant :  Zahra Kakavand


This is the second laboratory for the course SEG3103.


# Exercise 1

**Run the sample test cases created from the tutorial, and report the results in the table below.**

**For each test case, specify the Expected Results (from the test case), the Actual Results (from the execution) and a Verdict (Pass if Actual Result and Expected Results match, Fail if Actual Result and Expected Results do not match and Inconclusive for cases where a determination can not be made).**

First, we need to run the app. To do so, all we need to do is run the command

`java -jar  user-registration-app-0.1.0.jar`

Here are the results for the test cases created from the tutorial :

| Test case | Expected Results              | Actual Results                                                                                                   | Verdict (Pass, Fail, Inconclusive) |
|-----------|-------------------------------|------------------------------------------------------------------------------------------------------------------|------------------------------------|
|     1     | Registration request accepted | Wrong UserName format                                                                                            | Fail                               |
|     2     | Registration request accepted | - Size of UserName must be between 6 and 12 - Wrong UserName format - Wrong LastName format - Wrong Email format | Fail                               |
|     3     | Registration request accepted | Registration request accepted                                                                                    | Pass                               |
|     4     | Registration request accepted | Registration request accepted                                                                                    | Pass                               |
|     5     | Err1                          | - Size of UserName must be betwen 6 and 12 - Wrong UserName format                                               | Pass                               |
|     6     | Err3                          | - Size of UserName must be between 6 and 12 - Wrong UserName format - Wrong Email format                         | Pass                               |
|     7     | Err3                          | - Size of UserName must be between 6 and 12                                                                      | Pass                               |
|     8     | Err1                          | - Wrong UserName format                                                                                          | Pass                               |


# Exercise 2
