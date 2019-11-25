# covey-cosse-coo-projet-questionnaires

project questionnaires

## How To
### Installation

The project doesn't currently work.

1. Install maven, the method will depend on your distribution

For Debian/Ubuntu

```
# apt install maven
```

2. Get the project

```
$ git clone git@gitlab-etu.fil.univ-lille1.fr:cosse/covey-cosse-coo-projet-courrier.git
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

* We tried to prevent the fact that we have to create a new answer instance everytime we want to test if an answer can accept a string by using an abstract class named AnswerValidator
