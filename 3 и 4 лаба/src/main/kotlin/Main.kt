import java.util.Random
fun main(args: Array<String>) {
    println("Введите номер банкомата. Он указан на боковой панели и состоит из 9 цифр")
    var number = readln().replace("\\s".toRegex(), "")
    val array = arrayListOf<String>(number)
    while (!CheckInput(number) || array[0].length!=9){
        println("Введите корректный номер банкомата. Он указан на боковой панели и состоит из 9 цифр ")
        number = readln().replace("\\s".toRegex(), "")
        array[0]=number
    }
    var balance = rand(0,100000)
    balance = balance - balance%10
    val fiveooo = balance/5000
    val oneooo = (balance-fiveooo*5000)/1000
    val fiveoo =( balance - ((fiveooo*5000)+(oneooo*1000)))/500
    val oneoo = (balance -((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)))/100
    val fift =( balance - ((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)+(oneoo*100)))/50
    val ten = (balance -((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)+(oneoo*100)+(fift*50)))/10
    val bal = Money(fiveooo,oneooo,fiveoo,oneoo,fift,ten)
    val min = if (ten!=0) 10
              else if (fift!=0)  50
              else if (oneoo!=0) 100
              else if (fiveoo!=0) 500
              else if (oneooo!= 0) 1000
              else  5000
    val bankomat = Bankomat(number.toInt(),bal, MinSum = min, MaxSum = balance)
    bankomat.BankomatLoad()
    println("Какое действие вы хотите совершить ? \n 1.Внести деньги\n 2.Снять деньги")
    var choice = readln().replace("\\s".toRegex(), "")
    while (!CheckInput(choice) && choice.toInt()!=1 && choice.toInt()!=2){
        println("Введите корректное значение.")
        println("Какое действие вы хотите совершить ? \n 1.Внести деньги\n 2.Снять деньги")
        choice = readln().replace("\\s".toRegex(), "")
    }
    if (choice.toInt()==1){bankomat.AddMoney()}
    if (choice.toInt()==2){bankomat.TakeMoney()}
}
fun rand(from: Int, to: Int) : Int {
    val random = Random()
    return random.nextInt(to - from) + from
}