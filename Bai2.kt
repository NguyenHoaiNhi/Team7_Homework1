fun ConvertAcr(s: String): String
{
    var res :String = ""
    var str = s.trim() // tạo ra chuỗi mới bỏ hai dấu cách ở đầu và cuối
    var l = str.length-1 
    res = res+str[0] // in ra ký tự đầu tiên
    for (i in 1..l){
        if(str[i].isWhitespace()){ // kiểm tra xem có phải là dấu space ko, nếu đúng in ra ký tự tiếp theo
            //println(i)
        	res = res+str[i+1]
        }
    }
    return res
}