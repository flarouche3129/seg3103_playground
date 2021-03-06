# SEG3103 Laboratory 6

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Zahra Kakavand |
| Student 1 | Félix Larouche (300144353) |
| Student 2 | Emma Dobson Takoff (300108505) |

This is the sixth laboratory for the course SEG3103.

## Automated User Acceptance Testing with Selenium WebDriver

Before beginning the lab we installed Maven. Here is a screenshot after running `mvn --version` to show that it installed correctly:
![Maven version](assets/version.png)

After extracting BookstoreApp.zip, we ran `mvn compile`.

Here is a screenshot of the terminal after compiling:
![Compiled](assets/compile.png)

Then we ran `mvn package -DskipTests` which will compile all of the tests without actually running them.
![Skip tests](assets/skip-tests.png)
...
![Skip tests 2](assets/skip-tests2.png)


Then we ran `java -jar ./target/BookstoreApp-0.1.0.jar`. 

Here is a screenshot of the application running:
![App running](assets/AppRunning.png)

Here is a screenshot of the terminal:
![Run](assets/run-app.png)


To run the tests, we ran `mvn test`.

Here is a screenshot of the three tests passing:
![Tests passing](assets/tests-pass.png)

Next, we added an additional Selenium web driver test to test the login process.

Here is the code for the added test where we check that the username "admin" and the password "password" will successfully bring the user to the admin page of the application when they click "Sign in":
```java
  @Test
  public void test3() {
    driver.get("http://localhost:8080/admin");

    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");

    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");

    WebElement signIn = driver.findElement(By.id("loginBtn"));
    signIn.click();

    String actualUrl="http://localhost:8080/admin";
    String expectedUrl= driver.getCurrentUrl();
    assertEquals(expectedUrl, actualUrl);

  }
```

Here is a screenshot of the four tests passing:
![Additional assets passing](assets/tests-pass-2.png)