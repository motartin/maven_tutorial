# Maven Tutorial  
Welcome to the introduction of Apache Maven. This tutorial aims to provide the  
Maven related basic knowledge needed for working on Java projects in an enterprise environment.  

The following setup is required to go through the tutorial:  
- Java JDK (>=17)
- Maven (>=3)
- some IDE (I highly recommend IntelliJ)
- Git
  
You can start the tutorial by checking out the first git tag
```shell
git checkout tutorial_step_1
```
  
## Step 1: Old school - simple  
Before systems like Maven, Gradle or Apache Ant were introduced,  
developers had to build their applications manually.  
And that is exactly what you will start with.  
There are two files **HelloMavenWorld.java** and **Greeting.java** lying in the root of the project.
Nothing fancy going there. You can compile them with the command  
```shell
javac Greeting.java HelloMavenWorld.java
```
You should end up with two class files that are named **HelloMavenWorld.class** and **Greeting.class**.  
Now you can execute the main class with the command  
```shell
java HelloMavenWorld
```
That should simply write a greeting to the console and exit.   
After you are done with the very basics on to **Step 2** by checking out the next git tag  
```shell
git checkout tutorial_step_2
```
  
## Step 2: Old school - less simple  
Since you do not only care about the structure of your code but also about the structure
of the files resembling your application you introduced a nice hierarchy to the classes.
The two .java files can now be found in the folder
```shell
/path/to/your/projectfolder/your/company
```
  
To compile them you need to run (❗adjust path❗)
```shell
javac "/path/to/maven-tutorial/your/company/Greeting.java" "/path/to/maven-tutorial/your/company/HelloMavenWorld.java"
```
  
And once the two .class files are created you can run the application with the command
```shell
java -cp "/path/to/maven-tutorial/your/company" HelloMavenWorld
```
  
You will see a slightly adjusted message in the console.  
You can now continue with *Step 3* by checking out the next git tag
```shell
git checkout tutorial_step_3
```