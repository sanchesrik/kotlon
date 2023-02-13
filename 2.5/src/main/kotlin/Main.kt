fun main(args: Array<String>) {
    val set = mutableListOf<String>()
    print("Введите количество строк: ")
    var kolvo = readLine()
    while (!CheckInputKolvo(kolvo.toString()) || kolvo==null) {
        print("Введите количество строк: ")
        kolvo = readLine()
    }
    for (i in 1..kolvo.toInt()){
        print("Введите " + i + " строку: ")
        set.add(readLine().toString())
    }
    print("Введите подстроку для поиска: ")
    var search = readLine().toString()
    while (search==""){
        print("Введите подстроку для поиска: ")
        search = readLine().toString()
    }
    val result = arrayListOf<String>()
    for (i in 0..set.size-1){
        if (set[i].contains(search)){
            result+=set[i]
        }
        //if (!set[i].contains(search)){
        //    set.remove(set[i].toString())
        //}
    }
    //println(set)
    println(result)

}
