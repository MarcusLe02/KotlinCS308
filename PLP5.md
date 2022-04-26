# KotlinCS308

<h1>Objects and Classes</h1>
<h3>Discussion questions</h3>
- Create an object (a simple Person or Date object is fine)<br>
- Give the object class attributes (aka instance variables)<br>
- Give the object functions<br>
- Create an object that inherits from the first object (e.g., Student or Appointment) with some attributes and functions of its own<br>
- Test how to instantiate both types of objects, call their functions, and modify their variables.<br><br>
1.  Does your language support objects or something similar (e.g., structs or records)?	<br>
Are there naming conventions for objects, instance variables, or functions that people writing in your language should be aware of?<br>
2.	Does your language have standard methods for functions that serve a similar purpose across all objects?<br>
For example, toString() in Java and __str__ in Python allow information about the objects to be printed. Are there similar functions in your language?<br>
3.	How does inheritance work (if it does)? Does your language support multiple inheritance?<br>
4.	If there is inheritance, how does your language deal with overloading method names and resolving those calls?<br>
5.	Is there anything else that’s important to know about objects and inheritance in your language?<br>
<h3>Answers</h3>
<b>Note</b>: The example code for this assignment can be found in file <b>PLP5Examples.kt</b> in the same repository.<br>
1. Kotlin does support objects, and the name of classes and objects start with an uppercase letter and use camel case.<br>
3. All classes in Kotlin have a common superclass, Any, which is the default superclass for a class with no supertypes declared. By default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword.<br>
Also, Kotlin supports multiple inheritance by interface implementation delegation.<br>
4. Kotlin supports overloading for callables and properties by requiring explicit modifiers for overridable members. That is, the ability for several callables (functions or function-like properties) or properties with the same name to coexist in the same scope, with the compiler picking the most suitable one when such entity is referenced.<br>

