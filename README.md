# covey-cosse-coo-projet-questionnaires

project questionnaires

## How To
### Installation


1. Install maven, the method will depend on your distribution

For Debian/Ubuntu

```
# apt install maven
```

2. Get the project

```
$ git clone git@gitlab-etu.fil.univ-lille1.fr:cosse/covey-cosse-coo-projet-questionnaires.git
```

3. Make the executable

```
$ mvn package
```
4. Execute the jar file

```
$ java -jar ./Questionnaires/target/*.jar
```

### Generate Javadoc
```
$ mvn javadoc:javadoc
```
The Javadoc generated can be found in /Questionnaires/target/docs/index.html

### Key aspect of the project

* We tried to prevent the fact that we have to create a new answer instance everytime we want to test if an answer can accept a string by using an abstract class named AnswerValidator, but it doesn't really work, creating static attribute with the same name in the subclass doesn't shadow the one in the superlass.
* There is an abstraction between the answers and the UI
* CLI mean Command line interface
* To create GUI or any other UI you just had to create an other UIfactory and implement the UI interface in your UI components

