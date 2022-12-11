package translatenambers

class Russian {
    fun translate(j: Int){
        when (j){
            1-> println("один")
            2-> println("два")
            3-> println("три")
            4-> println("четыре")
            5-> println("пять")
            6-> println("шесть")
            7-> println("семь")
            8-> println("восемь")
            9-> println("девять")
            10-> println("десять")
            else->println("что-то пошло не так")
        }
    }
}