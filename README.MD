# Maven Tutorial  
Welcome to the introduction of Apache Maven. This tutorial aims to provide all the  
Maven related basic knowledge needed for working with Java projects in an enterprise environment.  

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
As you can see, nothing fancy going there.
You can compile them with the command  
```shell
javac Greeting.java HelloMavenWorld.java
```
You should end up with two class files that are named **HelloMavenWorld.class** and **Greeting.class**.  
Now you can execute the main class via the command  
```shell
java HelloMavenWorld
```
That should simply write a greeting to the console and exit.   
After you are done with the very basics on to **Step 2** by checking out the next git tag  
```shell
git checkout tutorial_step_2
```