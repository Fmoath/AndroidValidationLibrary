package fm.ps.lib.validation.validator

import android.widget.EditText
import fm.ps.lib.validation.R
import fm.ps.lib.validation.abstract.ValidatorAbstract
import fm.ps.lib.validation.util.ViewsUtil

/**
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 52 : 34
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */

class EmptyValidator(private var editText: EditText) : ValidatorAbstract(editText) {

    override val isValid: Boolean
        get() {
            if (ViewsUtil.isTheEditTextEmpty(editText)) {
                editText.error = getErrorMessage(editText)
                return false
            }
            editText.error = null
            return true
        }

    private fun getErrorMessage(editText: EditText): String {
        return editText.context.getString(R.string.error_empty, editText.hint)
    }

}