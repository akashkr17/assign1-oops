

# Overview

### This Project has a trait Queue which performs two functions of enqueue and dequque.
#### It wo classes: DoubleQueue and SquareQueue mix in this trait.
#### DoubleQueue enqueues the element after doubling them.
#### SquareQueue enqueues the element after squaring them
#### Dequeue method will remove the first element from the queue


# Installation of Sbt and scala
#### 1.You must first install a JDK. We recommend AdoptOpenJDK JDK 8 or JDK 11.

#### 2.Next, install Sbt by typing the following commands:

```bash
echo "deb https://repo.scala-sbt.org/scalasbt/debian all main" | sudo tee /etc/apt/sources.list.d/sbt.list
echo "deb https://repo.scala-sbt.org/scalasbt/debian /" | sudo tee /etc/apt/sources.list.d/sbt_old.list
curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | sudo apt-key add
sudo apt-get update
sudo apt-get install sbt
```
#### 3.Verify the installation by running command:
```bash
sbt sbtversion
```
# Usage

#### 1. Clone the project.
```bash
git clone https://github.com/akashkr17/assign1-oops.git
```

#### 2.Start the sbt server using command
```bash
sbt
```


#### 2.Clean the previous compiled code everytime
```bash
clean
```
#### 3. This command compile the source code of the project
```bash
compile 
```


#### 4. This command take the compiled code and package it in its distributable format, such as a JAR.
```bash
package
```
#### 5.This is command for executing code .
```bash
 run
