class Bankomat (BankomatId:Int, Balance: Money, MinSum: Int, MaxSum: Int) {
    var bankomat_id: Int
    var balance: Money
    var mincash: Int
    var maxcash : Int
    init {
        bankomat_id=BankomatId
        balance=Balance
        mincash=MinSum
        maxcash=MaxSum
    }

    fun BankomatLoad(){
        println("Инициализация банкомата завершена! ")
        println("ID банкомата: " + bankomat_id)
        println("В банкомате сейчас: " + maxcash)
        println("Минимальная сумма для снятия: "+mincash)
        println("Максимальная сумма для снятия: "+maxcash)
        println("В банкомате находятся следующие купюры, следующего номинала:")
        if (balance.five_thousand!=0)println(balance.five_thousand.toString() + " купюр по 5000 или " +  balance.five_thousand*5000)
        if (balance.one_thousand!=0)println(balance.one_thousand.toString() + " купюр по 1000 или " +balance.one_thousand*1000)
        if (balance.five_hundred!=0)println(balance.five_hundred.toString() + " купюр по 500 или " +balance.five_hundred*500)
        if (balance.one_hunerd!=0)println(balance.one_hunerd.toString() + " купюр по 100 или " +balance.one_hunerd*100)
        if (balance.fifty!=0)println(balance.fifty.toString() + " купюр по 50 или " +balance.fifty*50)
        if (balance.ten!=0)println(balance.ten.toString() + " купюр по 10 или " +balance.ten*10)
    }

    fun AddMoney(){
        print("Введите сумму которую хотите внести. Сумма должна быть кратна 10: ")
        var sum = readln().replace("\\s".toRegex(), "")
        while (!CheckInput(sum) || sum.toInt()%10!=0){
            print("Введите корректную сумму. Сумма должна быть кратна 10: ")
            sum = readln().replace("\\s".toRegex(), "")
        }
        var result: Int = sum.toInt()


        if (result>=5000) {
            println("Внесите количество 5000 купюр")
            var fivooo = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(fivooo)) {
                println("Внесите количество 5000 купюр")
                fivooo = readln().replace("\\s".toRegex(), "")
            }
            if (fivooo.toInt() != 0) {
                result = result - fivooo.toInt() * 5000
                balance.five_thousand += fivooo.toInt()
            }
        }
         if (result>=1000 || result<0){
            println("Внесите количество 1000 купюр")
             var oneooo = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(oneooo)){
                println("Внесите количество 1000 купюр")
                 oneooo = readln().replace("\\s".toRegex(), "")
            }
             if (oneooo.toInt()!=0){
                 result=result-oneooo.toInt()*1000
                 balance.one_thousand+=oneooo.toInt()
             }
        }
         if (result>=500 || result<0){
            println("Внесите количество 500 купюр")
             var fivoo = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(fivoo)){
                println("Внесите количество 500 купюр")
                fivoo = readln().replace("\\s".toRegex(), "")
            }
             if (fivoo.toInt()!=0){
                 result=result-fivoo.toInt()*500
                 balance.five_hundred+=fivoo.toInt()
             }
        }
         if (result>=100 || result<0){
            println("Внесите количество 100 купюр")
             var oneoo = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(oneoo)){
                println("Внесите количество 100 купюр")
                 oneoo = readln().replace("\\s".toRegex(), "")
            }
             if (oneoo.toInt()!=0){
                 result=result-oneoo.toInt()*100
                 balance.one_hunerd+=oneoo.toInt()
             }
        }
         if (result>=50 || result<0){
            println("Внесите количество 50 купюр")
             var fif = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(fif)){
                println("Внесите количество 500 купюр")
                 fif = readln().replace("\\s".toRegex(), "")
            }
             if (fif.toInt()!=0){
                 result=result-fif.toInt()*50
                 balance.fifty+=fif.toInt()
             }
        }
         if (result>=10 || result<0){
            println("Внесите количество 10 купюр")
            var ten = readln().replace("\\s".toRegex(), "")
            while (!CheckInput(ten)){
                println("Внесите количество 500 купюр")
                ten = readln().replace("\\s".toRegex(), "")
            }
             if (ten.toInt()!=0){
                 result=result-ten.toInt()*10
                 balance.ten+=ten.toInt()
             }
        }
        if (result!=0){
            result=sum.toInt()-result
            println("Вы указали сумму: " + sum+"\nА внесли: " + result + "\nВнесенная сумма занесена в банкомат")
        }
        if (result==0)println("В банкомате сейчас: " + (maxcash+sum.toInt()))
        else println("В банкомате сейчас: " + (maxcash+result))
        println("Минимальная сумма для снятия: "+mincash)
        if (result==0)println("Максимальная сумма для снятия: " + (maxcash+sum.toInt()))
        else println("Максимальная сумма для снятия: "+(maxcash+result))
        println("В банкомате находятся следующие купюры, следующего номинала:")
        if (balance.five_thousand!=0)println(balance.five_thousand.toString() + " купюр по 5000 или " +  balance.five_thousand*5000)
        if (balance.one_thousand!=0)println(balance.one_thousand.toString() + " купюр по 1000 или " +balance.one_thousand*1000)
        if (balance.five_hundred!=0)println(balance.five_hundred.toString() + " купюр по 500 или " +balance.five_hundred*500)
        if (balance.one_hunerd!=0)println(balance.one_hunerd.toString() + " купюр по 100 или " +balance.one_hunerd*100)
        if (balance.fifty!=0)println(balance.fifty.toString() + " купюр по 50 или " +balance.fifty*50)
        if (balance.ten!=0)println(balance.ten.toString() + " купюр по 10 или " +balance.ten*10)


    }

    fun TakeMoney(){
        print("Введите сумму которую желаете снять\nСумма должна быть кратна 10\nТакже сумма не должна быть больше или меньше доступных сумм для снятия: ")
        var sum = readln().replace("\\s".toRegex(), "")
        while (!CheckInput(sum) || sum.toInt()%10!=0 || sum.toInt()>maxcash ||sum.toInt()<mincash){
            if (sum.toInt()>maxcash ) println("Вы ввели сумму выше допустимого значения! Попробуйте еще раз.")
            if( sum.toInt()<mincash)println("Вы ввели сумму ниже допустимого значения! Попробуйте еще раз.")
            print("Введите сумму которую желаете снять\nСумма должна быть кратна 10\nТакже сумма не должна быть больше или меньше доступных сумм для снятия: ")
            sum = readln().replace("\\s".toRegex(), "")
        }
        var result = sum.toInt()
        val fiveooo = result/5000
        val oneooo = (result-fiveooo*5000)/1000
        val fiveoo =( result - ((fiveooo*5000)+(oneooo*1000)))/500
        val oneoo = (result -((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)))/100
        val fift =( result - ((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)+(oneoo*100)))/50
        val ten = (result -((fiveooo*5000)+(oneooo*1000)+(fiveoo*500)+(oneoo*100)+(fift*50)))/10

        if (fiveooo!=0){
            balance.five_thousand-=fiveooo
            result-=fiveooo*5000
        }
        if (oneooo!=0   && balance.one_thousand-oneooo>=0){
            balance.one_thousand-=oneooo
            result-=oneooo*1000
        }
        if (fiveoo!=0 && balance.five_hundred-fiveoo>=0){
            balance.five_hundred-=fiveoo
            result-=fiveoo*500
        }
        if (oneoo!=0 && balance.one_hunerd-oneoo>=0){
            balance.one_hunerd-=oneoo
            result-=oneoo*100
        }
        if (fift!=0 && balance.fifty-fift>=0){
            balance.fifty-=fift
            result-=fift*50
        }
        if (ten!=0 && balance.ten-ten>=0){
            balance.ten-=ten
            result-=ten*10
        }
        if (result==0){
            maxcash=balance.five_thousand*5000 + balance.one_thousand*1000 + balance.five_hundred*500 + balance.one_hunerd*100 + balance.fifty*50 + balance.ten*10
            if (maxcash==0){
                println("Операцция прошла успешно!\nВам бвыло выдано " + sum.toInt())
                println("В данный момент, в банкомате не осталось средств")
                println("Просим прощения за доставленные неудобства, работа банкомата прекращен\nВсего хорошего !")
            }
            else{
            mincash= if (balance.ten!=0)ten * 10
            else if (balance.fifty!=0) fift * 50
            else if (balance.one_hunerd!=0) oneoo * 100
            else if (balance.five_hundred!=0) fiveoo * 500
            else if (balance.one_thousand!= 0) oneooo * 1000
            else balance.five_thousand * 5000
            println("Операцция прошла успешно!\nВам бвыло выдано " + sum.toInt())
            println("В банкомате сейчас: " + maxcash)
            println("Минимальная сумма для снятия: "+mincash)
            println("Максимальная сумма для снятия: "+ maxcash)
            println("В банкомате находятся следующие купюры, следующего номинала:")
            if (balance.five_thousand!=0)println(balance.five_thousand.toString() + " купюр по 5000 или " +  balance.five_thousand*5000)
            if (balance.one_thousand!=0)println(balance.one_thousand.toString() + " купюр по 1000 или " +balance.one_thousand*1000)
            if (balance.five_hundred!=0)println(balance.five_hundred.toString() + " купюр по 500 или " +balance.five_hundred*500)
            if (balance.one_hunerd!=0)println(balance.one_hunerd.toString() + " купюр по 100 или " +balance.one_hunerd*100)
            if (balance.fifty!=0)println(balance.fifty.toString() + " купюр по 50 или " +balance.fifty*50)
            if (balance.ten!=0)println(balance.ten.toString() + " купюр по 10 или " +balance.ten*10)
            }
        }
        if (result!=0){
            if (result%5000==0 && balance.five_thousand!=0){
                result-=balance.five_thousand*5000
                balance.five_thousand=0
            }
            if (result%1000==0 && balance.one_thousand!=0){
                result-=balance.one_thousand*1000
                balance.one_thousand=0
            }
            if (result%500==0 && balance.five_hundred!=0){
                result-=balance.five_hundred*500
                balance.five_hundred=0
            }
            if (result%100==0 && balance.one_hunerd!=0){
                result-=balance.one_hunerd*100
                balance.one_hunerd=0
            }
            if (result%50==0 && balance.fifty!=0){
                result-=balance.fifty*50
                balance.fifty=0
            }
            if (result%10==0 && balance.ten!=0){
                result-=balance.ten*10
                balance.ten=0
            }
            println("Просим прощения за доставленные неудобства. В данный момент в банкомате не хватает купюр для выдачи введенной суммы. Мы можем выдать вам сумму: " + (sum.toInt()-result))
            println("Хотите получить имеющуюся сумму ? \n 1.Да \n 2.Нет")
            var choice =readln().replace("\\s".toRegex(), "")
            while (!CheckInput(choice) && choice.toInt()!=1 && choice.toInt()!=2){
                println("Хотите получить имеющуюся сумму ? \n 1.Да \n 2.Нет")
                var choice =readln().replace("\\s".toRegex(), "")
            }
            if (choice.toInt()==1){
                println("Спасибо за ваше понимание!")
                maxcash=balance.five_thousand*5000 + balance.one_thousand*1000 + balance.five_hundred*500 + balance.one_hunerd*100 + balance.fifty*50 + balance.ten*10
                if (maxcash==0){
                    println("Операцция прошла успешно!\nВам бвыло выдано " + sum.toInt())
                    println("В данный момент, в банкомате не осталось средств")
                    println("Просим прощения за доставленные неудобства, работа банкомата прекращен\nВсего хорошего !")
                }
                else
                    mincash= if (balance.ten!=0)ten * 10
                    else if (balance.fifty!=0) fift * 50
                    else if (balance.one_hunerd!=0) oneoo * 100
                    else if (balance.five_hundred!=0) fiveoo * 500
                    else if (balance.one_thousand!= 0) oneooo * 1000
                    else balance.five_thousand * 5000
                println("Операцция прошла успешно!\nВам бвыло выдано " + sum.toInt())
                println("В банкомате сейчас: " + maxcash)
                println("Минимальная сумма для снятия: "+mincash)
                println("Максимальная сумма для снятия: "+ maxcash)
                println("В банкомате находятся следующие купюры, следующего номинала:")
                if (balance.five_thousand!=0)println(balance.five_thousand.toString() + " купюр по 5000 или " +  balance.five_thousand*5000)
                if (balance.one_thousand!=0)println(balance.one_thousand.toString() + " купюр по 1000 или " +balance.one_thousand*1000)
                if (balance.five_hundred!=0)println(balance.five_hundred.toString() + " купюр по 500 или " +balance.five_hundred*500)
                if (balance.one_hunerd!=0)println(balance.one_hunerd.toString() + " купюр по 100 или " +balance.one_hunerd*100)
                if (balance.fifty!=0)println(balance.fifty.toString() + " купюр по 50 или " +balance.fifty*50)
                if (balance.ten!=0)println(balance.ten.toString() + " купюр по 10 или " +balance.ten*10)
            }
            if (choice.toInt()==2){
                println("Сожалеем, что не смогли вам помочь. Спасибо что воспользовались нашим банкоматом. Всего хорошего!")
            }
        }

    }
}