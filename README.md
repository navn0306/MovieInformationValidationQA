# MovieInformationValidationQA
Automated IMDB and Wikipedia application to demonstrate what is page object model framework and how it can used in selenium to automate and test an application.Using JAVA Maven and TestNG as Test Framework.
## Description
This project fetches the Release Date and Country of Origin from both the websites i.e. https://www.imdb.com/ and https://en.wikipedia.org/ and compares them.
One sucessfull comparison Test cases passes otherwise it will fail.

### Libraries used :
Selenium-java, Testng,Driver Manager, Commons-io, Allure-testng, Testng Listerners.

#### Instructions to Execute:
- After pulling to local, goto TestBase.java class and change the WebDriver path to your Locally stored Webdriver Path.
- To run the project from command line maven should be installed in your machine.
- Goto Command Line(Terminal) and change directory to where the project is stored.
- Then run the command
  -> mvn clean test
- It will start the project build and run the test suite i.e testng.xml.
- Extent Reports can be seen from test-output folder in the project, Run the index.html file and it will redirect to browser for the report.
- For Allure results, allure command line should be installed in you machine and you can directly run the command
  -> allure serve "path of the allure-results folder"

