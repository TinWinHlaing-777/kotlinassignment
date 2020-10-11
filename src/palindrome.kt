import java.util.*

fun main() {
    var flag = false

    fun isPalindrome(input: String): Boolean {
        return input == (input.reversed())
    }

    fun requestInput(): String {
        var scanner = Scanner(System.`in`)
        print("Please enter palindrome number => ")
        return scanner.next()
    }

    while (!flag) {
        if (isPalindrome(requestInput())) {
            flag = true
            println("The text you entered is Palindrome and you pass the test.")
        } else {
            println("You fail!, Please try with other text...")
        }
    }

}


