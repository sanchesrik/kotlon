fun main(args: Array<String>) {
    print("Введите число: ")
    var number: String = readLine().toString().replace("\\s".toRegex(), "")
    while (!CheckInput(number)){
        print("Введите корректное значение: ")
        number = readLine().toString().replace("\\s".toRegex(), "")
    }
    val ToPrint = number
    var result = 0;
    while (true){
        result+= number[number.length-1].digitToInt()
        number = number.substring(0,number.length-1)
        if (number.length==0  && result.toString().length!=1)
        {
            number=result.toString()
            result=0
        }
        if (number.length==0  && result.toString().length==1){break}
    }
    println( "Цифровой корень числа " + ToPrint + " равен " + result)


}