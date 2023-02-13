fun CheckInputKolvo(inp: String):Boolean {
    try { if (inp.toInt()==0) { return false }}
    catch(e: NumberFormatException) { return false }
    return true
}
