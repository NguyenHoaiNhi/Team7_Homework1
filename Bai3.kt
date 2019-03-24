
fun ConvertString(iNum: Int): String
{
    var res:String = ""
    var checkDevided: Boolean = false
    if (iNum % 3 == 0) { 
        //print("Pling")
        res = res+"Pling"
        checkDevided = true
    }
    if (iNum % 5 == 0) 
    {
        //print("Plang")
        res = res+"Plang"
        checkDevided = true
    }
    if (iNum % 7 == 0) 
    {
        //print("Plong")
        res = res+"Plong"
        checkDevided = true
    }
    if (checkDevided == false)
    {
        var number = iNum
        res = number.toString()
    }
    return res

}