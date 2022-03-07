package fm.ps.lib.validation.abstract

import android.view.View

/**
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 49 : 53
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
abstract class ValidatorAbstract(var view: View) {

    abstract val isValid: Boolean

    fun requestFocus() {
        view.requestFocus()
    }

}