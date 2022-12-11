package mathematics
// Создать класс Математика, состоящий из 2х переменных типа Int и четырех функций:
// сложение, вычитание, умножение, деление
// в main считать 2 числа с клавиатуры,
// выполнить все действия из класса Математика над этими числами

fun main(args: Array<String>) {

    val text1 = readLine()?:"0"
    val text2 = readLine()?:"0"

    val math = Mathematics()
    math.number1 = text1.toInt()
    math.number2 = text2.toInt()

    math.sum(math.number1, math.number2)
    math.subtraction(math.number1, math.number2)
    math.multiplication(math.number1, math.number2)
    math.division(math.number1, math.number2)
}
