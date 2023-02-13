fun CheckInput(inp: String):Boolean{
    try { if (inp.toInt()==0) { return false }}
    catch(e: NumberFormatException) { return false }
    if (inp.length == 1) { return false }
    else if (inp == null) { return false }
    return true
}
