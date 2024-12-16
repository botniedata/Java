# Java

---

### Comments

Use comments to leave human readable information in the code\
• Comment are ignored by compilers, tools, and the JRE\
• Comment lines are marked by `//`
<br />

Because they are ignored, coments can go anywhere in the code

---

### class
#### `class` keyword followed by the class name with curly brackets `{}`
```
// Java code goes into a class
class FirstJavaApp {

}
```

---

### Methods
Java applications consist of hundreds of classed\
   • Methods are like sub-containers for code inside of classes\
   • Each method accomplished a small, discrete bit of work
<br />

Methods define reusable sets of code\
   • Allowing the same code to be used with different output
   • Producing different outputs

---

### Java method
Java starts executing from the `main` method\
Define the main method with `main` and its own curly brackets `{}`\
   • `public statid void` precedes `main`\
   • `(String[] args)` after `main`
``` 
class FirstJavaApp {

    public static void main(String[] args) {

    } // main: starting point for an application
}     // method: sub-containers for code
```

---

### Terminology cheat sheet
**class**: a container for organizing Java code\
**comment**: human readable information in Java code that Java ignores\
**method**: like sub-containters for code inside of classes\
**main method**: the starting point of kick off place for Java application

---

### Java and camel case
**Java** is a case sensitive and uses camel case\
*Camel case* is the practice of writing phrases\
• Without spaces or punctuation\
• Capitalizing words in the phrase\
<br />

*Example*: The phrase "Hello everyone!" in came case is `HelloEveryone`\
•  **Upper camel case** - the first word starts in upper case\
•  **Lower camel case** - the first word starts in lower case `helloEveryone`

---

### Java naming
Class names are **upper** camel case\
• Upper camel case is when the first word in the phrase is capitalized\
• If the class name phrase has only one word, then it is upper cased
```
FirstJavaApp
WelcomeToJava
Calculator
```
<br />

Method names are lower **camel** case
• Lower camel case is when the first word in the phrase is not capitalized\
• If the method name phrase has only one word, then it is lower cased
```
searchCustomers
computeAverage
main
```

---

### println
Use `System.out.println` with a string in `" "` to print something
```
class FirstJavaApp {

    public.static.void main(String[] args) {
        
        // Use to output is `System.out.println`, println is short for print line
        System.out.println("My first Java application");
    }
}
```