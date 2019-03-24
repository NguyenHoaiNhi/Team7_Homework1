fun convertDNAtoRNA(DNA: String): String
{ 
	var res:String = ""
    for (x in DNA) {
  		when (x){
            'A' -> res = res+"U"
            'T' -> res = res+"A"
            'G' -> res = res+"C"
            'C' -> res = res+"G"

        }
    }
    return res
}
