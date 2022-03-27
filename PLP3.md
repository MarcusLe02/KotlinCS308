# KotlinCS308

<h1>Selection Control Structures</h1>
<h3>Discussion questions</h3>
1.	What are the boolean values in your language? (e.g., True and False, true and false, 1, and 0, etc.)<br>
2.	What types of conditional statements are available in your language? (if/else, if/then/else, if/elseif/else).<br>Does your language allow for statements other than “if”?<br>
3.	How does your language delimit code blocks under each condition in selection control statements?<br>
4.	Does your language use short-circuit evaluation? Include an example of the short-circuit logic working or not working.<br>
5.	How does your programming language deal with the “dangling else” problem?<br>
6.	If your language supports switch or case statements, do you have to use “break” to get out of them?<br>Can you use “continue” to have all of the conditions evaluated?<br>
<br>
<h3>Answers</h3>
1. Similar to Java, Kotlin uses two Boolean values: <b>true</b> and <b>false</b>. Conditional statements could be used to return the boolean values.<br>
2. There are four types of conditional statements available in Kotlin:<br><br>
<li>"if" to specify a block of code to be executed, if a specified condition is true</li><br>
<li>"else" to specify a block of code to be executed, if the same condition is false</li><br>
<li>"else if" to specify a new condition to test, if the first condition is false</li><br>
<li>"when" to specify many alternative blocks of code to be executed</li><br>
3. The language uses curly braces to delimit code blocks under each condition, however the curly braces are optional if the code block has only one statement.<br>
4. Similar to Java, Kotlin supports short-circuit evaluation, which is "&&" (and), and "||" (or).<br>
5. The language uses curly braces to avoid dangling else, in case of no braces for single statement, else is simply linked automatically to the nearest “if” or “when”.<br>
6. Kotlin does not support direct switch or case statements, however, Kotlin uses "when" statement to allow many cases without having to use "if ... else".<br>
Below is an example code of "when" statement:<br>
<code>
    class Playground {<br>
    public static void main(String[ ] args) {<br>
        int n = 1;<br>
        switch(n) {<br>
            case 0:<br>
                System.out.println("Invalid");<br>
            break;<br>
            case 1:<br>
                System.out.println("Valid");<br>
            break;<br>
            default:<br>
                System.out.println("Number should be 0 or 1.");<br>
            break;<br>
        }<br>
    }<br>
}<br><br>
    </code>
<h3>Resources</h3>
- Kotlin If ... Else: https://www.w3schools.com/kotlin/kotlin_conditions.php
- Implement a Switch Case Statement in Kotlin: https://www.delftstack.com/howto/kotlin/implement-switch-case-in-kotlin/
