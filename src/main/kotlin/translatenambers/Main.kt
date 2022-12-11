package translatenambers
// c клавиатуры пользователь вводит 2 числа от 1 до 9
// их надо сложить и получить сумму
// если сумма больше 10, то надо сложить цифры этого числа
// потом вывести на экран эти числа в виде слов на русском языке

fun main(args: Array<String>) {
    val text1 = readLine()?:"0"
    val text2 = readLine()?:"0"
    val number1 = text1.toInt()
    val number2 = text2.toInt()

    val link = Count()

    val result1 = link.sum(number1, number2)
    var finalResult = 0

    if (result1>10){
        var result1Text = result1.toString().split("")
        var resultMutable = result1Text.toMutableList()
        resultMutable.removeAt(0)
        resultMutable.removeAt(2)

        var num1 = resultMutable[0].toInt()
        var num2 = resultMutable[1].toInt()

        finalResult = link.sum(num1, num2)

    }
    else {finalResult = result1
    }

    val link2 = Russian()
    link2.translate(finalResult)
}