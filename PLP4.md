# KotlinCS308

<h1>Loops and Subroutines</h1>
<h3>Discussion questions</h3>
- Write (or try to emulate, if your language doesn’t have them) different kinds of loops: while, do/while, for, foreach<br>
- Write a function that takes in two numbers, multiplies them, and returns the output<br>
- Write a recursive function (one that calculates a factorial is fine)<br>
- Write a function that takes in a string (or your language's equivalent) and splits it into two strings, then returns both strings<br>
- Call your functions and save the results of the function calls in variables.<br>
- Write a function that tests whether your language is pass-by-reference or pass-by-value.<br><br>
1.	Does your language include multiple types of loops (while, do/while, for, foreach)? If so, what are they and how do they differ from each other?.)<br>
2.	What is the syntax for declaring a function in your language?<br>
3.	Are there any rules about where the function has to be placed in your code file so that it can run?<br>
4.	Does your language support recursive functions?<br>
5.	Can functions in your language accept multiple parameters? Can they be of different data types? <br>
6.	Can functions in your language return multiple values at the same time? How is that implemented?<br>If not, are there ways around that problem?  What are they?<br>
7.	Is your language pass-by reference or value><br>
<h3>Answers</h3>
<b>Note</b>: The example code for this assignment can be found in file <b>PLP4Examples.kt</b> in the same repository.<br>
1. Kotlin supports following types of loop: while, do/while, foreach.<br>
While loop loops through a code block as long as the specified condition is true, do/while is similar to while, except it always execute the code block once before checking whether the condition is true.<br>
Foreach loop is used to loop through all of the elements in an arrays, ranges, or things that contains a countable number of values. However, there is no traditional for loop with iterator in Kotlin.<br>
2. fun newFunction(paramName: paramType): returnType {CodeBlock}<br>
3. There are no specific rule of the placement of the function in the code file, except that it has to be independent with other function in the file.<br>
4. Kotlin does support recursive functions.<br>
5. Kotlin supports multiple parameters of different data types.<br>
6. Kotlin supports up to three return values at the same time in the function with the generic Pair and Triple types.<br>In order to return more values, user could consider defining a new data class and returning its instance from the function.
