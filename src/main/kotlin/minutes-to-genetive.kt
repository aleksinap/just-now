fun minutesToGenetive(sec: Int): String{
    val seconds = sec
    val remainder = if(seconds/60-11 == 0) 0 else (seconds/60)%10
    val minutesText = when(remainder){
        1 -> "минуту"
        2,3,4 -> "минуты"
        else -> "минут"
    }
    return minutesText
}