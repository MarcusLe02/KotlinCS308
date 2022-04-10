// Multiplier function
fun multiplier(a: Int, b: Int): Int {
    return(a * b)
}

// Recursive function (factorial)
fun factorial(num: Int): Int{
    return if (num==1) num
    else num*factorial(num-1)  // no terminate condition
}

fun main() {

    // while loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // do-while loop
    var j = 0
    do {
        println(j)
        j++
    }
    while (j < 5)

    // for loop
    val numbers = arrayOf(0, 1, 2, 3, 4)
    for (x in numbers) {
        println(x)
    }

    // Tested functions
    println(multiplier(3,5)) // 15
    val a = multiplier(6, 0)
    println(a) // 0
    println(factorial(5)) // 120
    val b = factorial(7)
    println(b) // 5040

    // split string
    val str = "Hello World"
    val delim = " "
    val strArray = str.split(delim)
    println(strArray) // [Hello, World]

}