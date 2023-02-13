fun CheckInput(test: String):Boolean {
    try {
        test.toLong()
    }catch (e: NumberFormatException){
        return false
    }

    return true
}