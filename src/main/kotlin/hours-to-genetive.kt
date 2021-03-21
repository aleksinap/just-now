fun hoursToGenetive(sec: Int): String{
    val seconds = sec
    val remainder = if(seconds/3600-11 == 0) 0 else(seconds/3600)%10
    val hoursText = when(remainder){
        1 -> "час"
        2,3,4 -> "часа"
        else -> "часов"
    }
    return hoursText
}