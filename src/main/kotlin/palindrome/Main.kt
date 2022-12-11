package palindrome

fun main(args: Array<String>) {
// вводим слово с клавиатуры, нужно проверить является ли оно палиндромом

    val palindrom  = readLine()?:""
    val text = palindrom.split("")
    val mutableList = text.toMutableList()
    val reversList = mutableList.reversed()
    val mutableListArray = mutableList.toTypedArray()
    val reversListArray = reversList.toTypedArray()
    if (mutableListArray contentEquals  reversListArray) {
        println("$palindrom This is palindrom")
    }
    else {
        println("$palindrom No, it's not palindrom")
    }
}