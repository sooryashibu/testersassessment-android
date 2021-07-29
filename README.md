# Hello World Project
- This is a simple android project that displays a Hello World! text and a Fab icon which, when tapped on, shows a snackbar showing a hint.
- The project also contains the UI automation tests which uses espresso framework to test various functionalities in the application.
- Even though this is simple application for now, we can always use this as a starter project to develop a much bigger application with highly maintainable UI test automation script.

## Requirements
- Android Studio
- Android Device or Emulator

## Application Setup
- Clone the repo using `git clone <URL to GIT Repository>`
- Open it in android studio and build the project.
- You can press the run button after selecting the Run configuration as `app` to make it emulated on a device

## Test Setup
- Tests are kept in the folder `\app\src\androidTest\java\com\abnamro\apps\referenceandroid`
- Tests can be run directly from android studio by right clicking on this folder
- If you want to run the tests and also generate the test reports please open the project in a cmd/terminal and run `gradlew connectedAndroidTest mergeAndroidReports`
- The above command will run all the UI tests in all the connected devices one by one and generate a test html report in the folder `\app\build\reports\androidTests\connected\index.html` a copy of which is kept in the folder called `reports_for_reference` for reference