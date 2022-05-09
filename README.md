# Assignment

[Click here to read the assignment](./docs/assignment.md)

## External dependencies

For this project to run, you would need to install below 3 dependencies on your machine:

- **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
- **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
- **[Google Chrome latest version](https://www.google.com/chrome/?brand=CHBD&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu15P0PA-n9Zp4NpxKaOHVGtBD1TZQH0HlQQE6hUfsOFAU1nf-Rzdlf4aAoTJEALw_wcB&gclsrc=aw.ds)** (browser to run your tests)

## About

I used Selenium, Cucumber, Gherkin, JUnit with Java. POO and PageFactory for architecture. 
I added support for running features in Parallel, amount of threads configurable on `pom.xml` under tag `<threadCount>amount</threadCount>`.
After a test execution if a test fails a picture will be added. 

## Getting Started via Maven
1. Download repository: https://github.com/Gerardtit/clipboardHealth **[Repository](https://github.com/Gerardtit/clipboardHealth)** 
2. Run `mvn clean install`
3. For executing test `mvn clean test` (By default it executes test on Chrome and locally) Also supports different variables 
 * `-Dbrowser=chrome` (chrome or firefox) To execute tests on Firefox or Chrome. Default chrome.
 * `-Dheadless=true` (true or false) To execute tests headless or not. Default false.
 * `-Dhost=host.grid` (host.grid/host.localhost) To execute tests headless or not. Default host.localhost.
Default options can be changed in `src/main/resources/choices.conf`
Example: `mvn clean test -Dbrowser=chrome -Dheadless=true -Dhost=host.grid`. We will run test on a grid (previously setted up), headless and on chrome browser

## Getting Started via Docker
We can also execute test via Docker. Supports Firefox and Chrome.
 1. After downloading **[repository](https://github.com/Gerardtit/clipboardHealth)** you can build the image via: `docker build -t selenium-exercise .`
 Or you can download it via: `docker pull gerardtit/selenium-exercise`
 2. Then create the container via: `docker run -it -d --name selenium-container selenium-exercise`
 3. Execute test via: `docker exec -it selenium-container /bin/sh -c "cd clipboardHealth;mvn clean test -Dbrowser=firefox -Dheadless=true"`. 
We need to execute tests headless. Also, you can change browser to chrome.
 


