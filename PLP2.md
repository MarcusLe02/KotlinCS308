# KotlinCS308

<h1>Names, Types, and Binding</h1>
<h3>Discussion questions</h3>
1.	Does your language have keywords or reserved words? How many?<br>
2.	What are the naming requirements for variables in your language? What about naming conventions?<br>
Are those enforced by the compiler/interpreter, or just standards in the community?<br>
4.	Is your language statically or dynamically typed?<br>
5.	Strongly typed or weakly typed?<br>
6.	Explicitly typed or implicitly typed?<br>
7.	Are some variables mutable while others are immutable?<br>
8.	What are the operators available for each data type?<br>
9.	Are mixed type operations allowed? If so, how are they accommodated?<br>
<br>
<h3>Answers</h3>
1. There are four types of keywords in Kotlin (which are all recommended to avoid using):<br>
a. Hard keywords – 24 hard keywords cannot be used as identifiers in any situations<br>
b. Soft keywords – 17 soft keywords that act as a keyword in a certain context, but can be used as identifiers in another context<br>
c. Modifier keywords – 29 modifier keywords in modifier lists of declaration and can be used as identifiers in another context<br>
d. Special identifier – two special identifiers are defined by the compiler in a specific context and can be used as regular identifiers in another context<br>
More details about Kotlin keywords: https://kotlinlang.org/docs/keyword-reference.html<br>
  <br>
2. Below are some of the naming conventions when using Kotlin:<br>
Names of classes and objects start with an uppercase letter and use camel case.<br>
Names of functions, properties and local variables start with a lowercase letter and use camel case and no underscores.<br>
Names of constants should use uppercase underscore-separated names.<br>
Names of top-level or object properties which hold objects with behavior or mutable data should use camel case names.<br>
More details about Kotlin naming rules: https://kotlinlang.org/docs/coding-conventions.html#naming-rules<br>
<u>Note</u>: <i>The above conventions are the standards in the community and not automatically enforced by the compiler</i>.<br>
  <br>
3. Kotlin is a statically-typed language, where the type of the variable is known at compile time.<br>
  <br>
4. Kotlin is a strongly-typed language, where it does not feature implicit conversions between types.<br>
  <br>
5. Kotlin is implicitly-typed, where the variables are declared with var or val in the statement.<br>
  <br>
6. There are both mutable and immutable variables in Kotlin. An immutable variable is unchangeable or read-only variable, it is declared using “val” keyword.
  On the other hand, the value of the mutable variable can be changed, and it is declared using “var” keyword.<br>
  <br>
7. Details about Kotlin operators: https://kotlinlang.org/docs/keyword-reference.html#operators-and-special-symbols<br>
  <br>
8. Operators with mixed types: Kotlin allows using arithmetic operators for mixed types without any conversion.<br>
