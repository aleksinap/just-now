fun agoToText(sec: Int): String{
    val seconds = sec
    val textAgo = when {
        seconds > 0 && seconds < 61 -> "только что"
        seconds >= 61 && seconds < 60*60+1 -> "${seconds/60} ${minutesToGenetive(seconds)} назад"
        seconds >= 60*60+1 && seconds < 24*60*60+1 -> "${seconds/3600} ${hoursToGenetive(seconds)} назад"
        seconds >= 24*60*60+1 && seconds < 2*24*60*60+1 -> "сегодня"
        seconds >= 2*24*60*60+1 && seconds < 3*24*60*60+1 -> "вчера"
        else -> "давно"
    }
    return textAgo
}