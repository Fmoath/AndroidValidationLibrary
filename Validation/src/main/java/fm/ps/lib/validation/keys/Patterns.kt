package fm.ps.lib.validation.keys

/**
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 58 : 33
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
object Patterns {
    const val PATTERN_EMAIL = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@" + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +"(" +"\\." +"[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" + ")+"
    //const val PATTERN_NAME = "^" + "(?=.*[A-Za-z])" + "(?=\\S+$)" + ".{5,20}" + "$"
    const val PATTERN_NAME = "^" + "(?=\\S+$)" + ".{5,20}" + "$"
    const val PATTERN_PASSWORD = "^" + "(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*[a-zA-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{8,20}" + "$"
    const val PATTERN_PASSPORT = "^" + "(?=.*[0-9])" + "(?=.*[A-Z])" + "(?=\\S+$)" + ".{3,20}" + "$"
}