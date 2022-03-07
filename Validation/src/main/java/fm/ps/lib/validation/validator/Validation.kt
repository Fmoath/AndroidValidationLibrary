package fm.ps.lib.validation.validator

import android.widget.EditText
import fm.ps.lib.validation.abstract.ValidatorAbstract
import fm.ps.lib.validation.keys.Validations
import fm.ps.lib.validation.validator.IncorrectValidator
import java.util.ArrayList

/**
 * @by : Eng-Moath Raed Abu Ouda
 * @CompanyManager : FM-Team
 * @In : Palestine - Gaza - Biet Hanoun
 * @OnDate : 2/20/2022
 * @InTheHour : 03 : 50 : 43
 * @Website : fm-ps.online
 * @Whatsapp : 00972597718418
 */
class Validation {


    private val validators = ArrayList<ValidatorAbstract>()

    fun addEmptyValidator(vararg editText: EditText?) {
        for (editText1 in editText) {
            validators.add(EmptyValidator(editText1!!))
        }
    }

    fun nameValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.NAME))
    }

    fun emailValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.EMAIL))
    }

    fun passwordValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.PASSWORD))
    }

    fun passportValidation(editText: EditText) {
        validators.add(IncorrectValidator(editText , Validations.PASSPORT))
    }

    val isValid: Boolean
        get() {
            var isValid = true
            for (validator in validators) {
                if (!validator.isValid) {
                    if (isValid) {
                        validator.requestFocus()
                    }
                    isValid = false
                }
            }
            return isValid
        }
}